/*
   Copyright (C)  Seun Landsberg 2016

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program; if not, see <http://www.gnu.org/licenses/>.
 */

package fr.lepellerin.ecole.service.internal;

import java.time.DayOfWeek;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.YearMonth;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.Consommation;
import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.bean.Inscription;
import fr.lepellerin.ecole.bean.Ouverture;
import fr.lepellerin.ecole.bean.ParametreWeb;
import fr.lepellerin.ecole.bean.Unite;
import fr.lepellerin.ecole.bean.enums.EnumParametreWeb;
import fr.lepellerin.ecole.exceptions.ActNonModifiableException;
import fr.lepellerin.ecole.exceptions.FunctionalException;
import fr.lepellerin.ecole.exceptions.TechnicalException;
import fr.lepellerin.ecole.repo.ConsommationRepository;
import fr.lepellerin.ecole.repo.InscriptionRepository;
import fr.lepellerin.ecole.repo.OuvertureRepository;
import fr.lepellerin.ecole.repo.ParametreWebRepository;
import fr.lepellerin.ecole.repo.UniteRepository;
import fr.lepellerin.ecole.service.CantineService;
import fr.lepellerin.ecole.service.dto.CaseDto;
import fr.lepellerin.ecole.service.dto.ComboItemDto;
import fr.lepellerin.ecole.service.dto.LigneDto;
import fr.lepellerin.ecole.service.dto.PlanningDto;
import fr.lepellerin.ecole.utils.GeDateUtils;

@Service
public class CantineServiceImpl implements CantineService {
  
  private static final Logger LOGGER = LoggerFactory.getLogger(CantineServiceImpl.class);

  @Autowired
  private OuvertureRepository ouvertureRepository;

  @Autowired
  private UniteRepository uniteRepository;

  @Autowired
  private InscriptionRepository ictRepository;

  @Autowired
  private ParametreWebRepository paramRepo;

  @Autowired
  private ConsommationRepository consommationRepository;

  @Override
  @Transactional(readOnly = true)
  public PlanningDto getDateOuvert(final YearMonth anneeMois, final Famille famille) throws TechnicalException {
    final Date startDate = Date
        .from(Instant.from(anneeMois.atDay(1).atStartOfDay(ZoneId.systemDefault())));
    final Date endDate = Date
        .from(Instant.from(anneeMois.atEndOfMonth().atStartOfDay(ZoneId.systemDefault())));

    final Activite activite = getCantineActivite();

    final LocalDateTime heureH = LocalDateTime.now();
    final List<Inscription> icts = this.ictRepository.findByActiviteAndFamille(activite, famille);

    final PlanningDto planning = new PlanningDto();

    icts.forEach(ict -> {
      planning.getHeaders().add(ict.getIndividu().getPrenom());
      final List<Consommation> consos = this.consommationRepository
          .findByFamilleInscriptionActiviteUniteEtatsPeriode(famille, activite, ict.getGroupe(),
              Arrays.asList("reservation"), startDate, endDate);
      final List<Ouverture> ouvertures = this.ouvertureRepository
          .findByActiviteAndGroupeAndPeriode(activite, ict.getGroupe(), startDate, endDate);
      ouvertures.forEach(o -> {
        final LocalDate date = LocalDate.from(((java.sql.Date) o.getDate()).toLocalDate());
        final LocalDateTime heureResa = this.getLimiteResaCantine(date);
        final LigneDto ligne = planning.getOrCreateLigne(date);
        final CaseDto c = new CaseDto();
        c.setDate(date);
        c.setIndividu(ict.getIndividu());
        c.setActivite(o.getActivite());
        c.setUnite(o.getUnite());
        c.setReservable(heureResa.isAfter(heureH));
        final Optional<Consommation> cOpt = consos.stream().filter(conso -> {
          final LocalDate dateConso = LocalDate
              .from(((java.sql.Date) conso.getDate()).toLocalDate());
          return dateConso.equals(date);
        }).findAny();
        c.setReserve(cOpt.isPresent());
        ligne.getCases().add(c);
      });
    });

    return planning;
  }

  @Override
  @Transactional(readOnly = false)
  public String reserver(final LocalDate date, final int individuId, final Famille famille, final Boolean reserve) throws FunctionalException, TechnicalException {
    final LocalDateTime heureResa = this.getLimiteResaCantine(date);
    if (!heureResa.isAfter(LocalDateTime.now())) {
      throw new ActNonModifiableException("activite non reservable");
    }
    final Date d = Date.from(Instant.from(date.atStartOfDay(ZoneId.systemDefault())));
    final Activite activite = getCantineActivite();
    final List<Inscription> icts = this.ictRepository.findByActiviteAndFamille(activite, famille);
    final Inscription ict = icts.stream().filter(i -> individuId == i.getIndividu().getId())
        .findFirst().get();
    final List<Consommation> consos = this.consommationRepository
        .findByInscriptionActiviteUniteDate(ict, activite, ict.getGroupe(), d);
    final Unite unite = this.uniteRepository.findOneByActiviteAndType(ict.getActivite(),
        "Unitaire");
    if ((reserve == null && consos != null && !consos.isEmpty())
        || (reserve != null && reserve == false && consos != null && !consos.isEmpty())) {
      consos.forEach(c -> this.consommationRepository.delete(c));
      return "libre";
      // on supprime la conso
    } else if ((reserve == null && (consos == null || consos.isEmpty()))
        || (reserve == true &&  (consos == null || consos.isEmpty()))) {
      // cree la conso
      final Consommation conso = new Consommation();
      conso.setActivite(activite);
      conso.setDate(d);
      conso.setDateSaisie(new Date());
      conso.setEtat("reservation");
      conso.setGroupe(ict.getGroupe());
      conso.setIndividu(ict.getIndividu());
      conso.setInscription(ict);
      conso.setComptePayeur(ict.getComptePayeur());
      conso.setCategorieTarif(ict.getCategorieTarif());
      conso.setUnite(unite);
      conso.setHeureDebut(unite.getHeureDebut());
      conso.setHeureFin(unite.getHeureFin());

      this.consommationRepository.save(conso);
      return "reserve";
    }
    return "rien";

  }

  @Override
  @Transactional(readOnly = false)
  public void reserver(final LocalDate startDate, final Famille famille, final List<DayOfWeek> jours) throws TechnicalException {

    final Activite activite = getCantineActivite();
    final List<Inscription> icts = this.ictRepository.findByActiviteAndFamille(activite, famille);
    icts.forEach(ict -> {
      final List<Ouverture> ouvertures = this.ouvertureRepository
          .findByActiviteAndGroupeAndDateDebut(activite, ict.getGroupe(), Date.from(Instant.from(startDate.atStartOfDay(ZoneId.systemDefault()))));
      ouvertures.forEach(o -> {
        final LocalDate date = LocalDate.from(((java.sql.Date) o.getDate()).toLocalDate());
        try {
          this.reserver(date, ict.getIndividu().getId(), famille, jours.contains(date.getDayOfWeek()));
        } catch (TechnicalException e) {
          LOGGER.error("Une erreur technique s'est produite : " + e.getMessage(), e);
        } catch (FunctionalException e) {
          LOGGER.warn("Une erreur fonctionnelle s'est produite : " + e.getMessage(), e);
        }
      });
    });
  }


  @Override
  @Transactional(readOnly = true)
  public Activite getCantineActivite() throws TechnicalException {
    final ParametreWeb p = this.paramRepo.findOne(EnumParametreWeb.ID_ACTIVITE_CANTINE.getId());
    if (p == null) {
      throw new TechnicalException("Pas d'activité cantine sélectionné");
    }
    final Activite activite = new Activite();
    activite.setId(Integer.valueOf(p.getValeurParametre()));
    return activite;
  }

  @Override
  @Transactional(readOnly = true)
  public LocalDateTime getLimiteResaCantine(final LocalDate date) {
    final LocalTime midnight = LocalTime.MIDNIGHT;
    final LocalDateTime limiteResa = LocalDateTime.of(date, midnight);
    final ParametreWeb p = this.paramRepo.findOne(EnumParametreWeb.ID_OFFSET_RESA.getId());
    int h = 0;
    int m = 0;
    if (p != null) {
      if (p.getValeurParametre().startsWith("-")) {
        final String[] hm = p.getValeurParametre().substring(1).split(":");
        h = -Integer.valueOf(hm[0]);
        m = Integer.valueOf(hm[1]);
      } else {
        String[] hm;
        if (p.getValeurParametre().startsWith("+")) {
          hm = p.getValeurParametre().substring(1).split(":");
        } else {
          hm = p.getValeurParametre().split(":");
        }
        h = Integer.valueOf(hm[0]);
        m = Integer.valueOf(hm[1]);
      }
    }
    return GeDateUtils.addHeureMinute(limiteResa, h, m);
  }

  @Override
  @Transactional(readOnly = true)
  public List<ComboItemDto> getMoisOuvertCantine() throws TechnicalException {
    final Activite activite = this.getCantineActivite();
    final List<Ouverture> ouvertures = this.ouvertureRepository.findByActivite(activite);
    final Set<YearMonth> moisActs = new HashSet<>();
    moisActs.add(YearMonth.now());
    ouvertures.sort((o1, o2) -> o1.getDate().compareTo(o2.getDate()));
    ouvertures.forEach(o -> {
      moisActs.add(YearMonth.from(((java.sql.Date) o.getDate()).toLocalDate()));
    });
    final List<ComboItemDto> comboMois = new ArrayList<>();
    moisActs.forEach(ma -> {
      final Integer id = Integer.valueOf(ma.format(DateTimeFormatter.ofPattern(GeDateUtils.DATE_FORMAT_YYYYMM)));
      final String libelle = ma.format(DateTimeFormatter.ofPattern(GeDateUtils.DATE_FORMAT_ANNEE_MOIS_FULL));
      comboMois.add(new ComboItemDto(id, libelle));
    });
    comboMois.sort((c1, c2) -> c1.getId().compareTo(c2.getId()));
    return comboMois;
  }

  @Override
  @Transactional(readOnly = true)
  public List<DayOfWeek> getJourOuvertCantine(final LocalDate startDate, final Famille famille) throws TechnicalException {
    final List<DayOfWeek> jours = new ArrayList<>();
    final Activite activite = getCantineActivite();
    final List<Inscription> icts = this.ictRepository.findByActiviteAndFamille(activite, famille);
    icts.forEach(ict -> {
      final List<Ouverture> ouvertures = this.ouvertureRepository
          .findByActiviteAndGroupeAndDateDebut(activite, ict.getGroupe(), Date.from(Instant.from(startDate.atStartOfDay(ZoneId.systemDefault()))));
      ouvertures.forEach(o -> {
        final LocalDate date = LocalDate.from(((java.sql.Date) o.getDate()).toLocalDate());
        if (!jours.contains(date.getDayOfWeek())) {
          jours.add(date.getDayOfWeek());
        }
      });
    });

    return jours;
  }

}
