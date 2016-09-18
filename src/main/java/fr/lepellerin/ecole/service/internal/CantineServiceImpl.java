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

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.Consommation;
import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.bean.Inscription;
import fr.lepellerin.ecole.bean.Ouverture;
import fr.lepellerin.ecole.bean.ParametreWeb;
import fr.lepellerin.ecole.bean.Prestation;
import fr.lepellerin.ecole.bean.Unite;
import fr.lepellerin.ecole.bean.enums.EnumParametreWeb;
import fr.lepellerin.ecole.exceptions.TechnicalException;
import fr.lepellerin.ecole.repo.ComptePayeurRepository;
import fr.lepellerin.ecole.repo.ConsommationRepository;
import fr.lepellerin.ecole.repo.InscriptionRepository;
import fr.lepellerin.ecole.repo.OuvertureRepository;
import fr.lepellerin.ecole.repo.ParametreWebRepository;
import fr.lepellerin.ecole.repo.RattachementRepository;
import fr.lepellerin.ecole.repo.UniteRepository;
import fr.lepellerin.ecole.service.CantineService;
import fr.lepellerin.ecole.service.dto.CaseDto;
import fr.lepellerin.ecole.service.dto.LigneDto;
import fr.lepellerin.ecole.service.dto.PlanningDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.time.Instant;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class CantineServiceImpl implements CantineService {

  @Autowired
  private OuvertureRepository ouvertureRepository;

  @Autowired
  private UniteRepository uniteRepository;

  @Autowired
  private InscriptionRepository ictRepository;
  
  @Autowired
  private ParametreWebRepository paramRepo;

  @Autowired
  private RattachementRepository rattachementRepository;

  @Autowired
  private ConsommationRepository consommationRepository;

  @Autowired
  private InscriptionRepository inscriptionRepository;

  @Autowired
  private ComptePayeurRepository comptePayeurRepository;

  @Override
  @Transactional(readOnly = true)
  public PlanningDto getDateOuvert(final YearMonth anneeMois, final Famille famille) throws TechnicalException {
    final Date startDate = Date
        .from(Instant.from(anneeMois.atDay(1).atStartOfDay(ZoneId.systemDefault())));
    final Date endDate = Date
        .from(Instant.from(anneeMois.atEndOfMonth().atStartOfDay(ZoneId.systemDefault())));

    final Activite activite = getCantineActivite();

    final LocalDate dateLimiteReservation = LocalDate.now();
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
        final LigneDto ligne = planning.getOrCreateLigne(date);
        final CaseDto c = new CaseDto();
        c.setDate(date);
        c.setIndividu(ict.getIndividu());
        c.setActivite(o.getActivite());
        c.setUnite(o.getUnite());
        c.setReservable(date.isAfter(dateLimiteReservation));
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
  public String reserver(final LocalDate date, final int individuId, final Famille famille) throws TechnicalException {
    final Date d = Date.from(Instant.from(date.atStartOfDay(ZoneId.systemDefault())));
    final Activite activite = getCantineActivite();
    final List<Inscription> icts = this.ictRepository.findByActiviteAndFamille(activite, famille);
    final Inscription ict = icts.stream().filter(i -> individuId == i.getIndividu().getId())
        .findFirst().get();
    final List<Consommation> consos = this.consommationRepository
        .findByFamilleInscriptionActiviteUniteDate(famille, activite, ict.getGroupe(), d);
    final Unite unite = this.uniteRepository.findOneByActiviteAndType(ict.getActivite(),
        "Unitaire");
    if (consos != null && !consos.isEmpty()) {
      consos.forEach(c -> this.consommationRepository.delete(c));
      return "libre";
      // on supprime la conso
    } else {
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

      final Prestation presta = new Prestation();
      presta.setActivite(activite);
      presta.setCategorie("consommation");
      presta.setCategorieTarif(ict.getCategorieTarif());
      // presta.setCodeCompta();
      presta.setComptePayeur(ict.getComptePayeur());
      presta.setContrat(null);
      presta.setDate(d);
      presta.setFacture(null);
      presta.setFamille(famille);
      presta.setForfait(null);
      presta.setForfaitDateDebut(null);
      presta.setForfaitDateFin(null);
      presta.setIndividu(ict.getIndividu());
      presta.setLabel(unite.getNom());
      // presta.setMontant(ict.getCategorieTarif().);
      presta.setMontantInitial(individuId);
      presta.setReglementFrais(null);
      presta.setTarif(null);
      presta.setTempsFacture(null);
      presta.setTva(individuId);

      // presta.set

      this.consommationRepository.save(conso);
      return "reserve";
    }
    // etat reservation / present
    // si annulation => on supprime la consommation
    // => a voir pour la prestation

  }


  //@Override
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

}
