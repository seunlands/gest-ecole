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
import fr.lepellerin.ecole.bean.ComptePayeur;
import fr.lepellerin.ecole.bean.Consommation;
import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.bean.Inscription;
import fr.lepellerin.ecole.bean.Ouverture;
import fr.lepellerin.ecole.bean.Prestation;
import fr.lepellerin.ecole.repo.ComptePayeurRepository;
import fr.lepellerin.ecole.repo.ConsommationRepository;
import fr.lepellerin.ecole.repo.InscriptionRepository;
import fr.lepellerin.ecole.repo.OuvertureRepository;
import fr.lepellerin.ecole.service.CantineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class CantineServiceImpl implements CantineService {

  @Autowired
  private OuvertureRepository ouvertureRepository;

  @Autowired
  private ConsommationRepository consommationRepository;

  @Autowired
  private InscriptionRepository inscriptionRepository;

  @Autowired
  private ComptePayeurRepository comptePayeurRepository;

  @Override
  public Set<Integer> getDateOuvert() {
    Calendar cal = new GregorianCalendar();
    Date debut = cal.getTime();
    cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));
    Date fin = cal.getTime();
    Activite activite = getCantineActivite();
    List<Ouverture> ouvertures = this.ouvertureRepository.findByActiviteAndPeriode(activite, debut,
        fin);
    Set<Integer> jours = new HashSet<>();
    ouvertures.forEach(o -> {
      Calendar jour = new GregorianCalendar();
      jour.setTime(o.getDate());
      jours.add(jour.get(Calendar.DAY_OF_WEEK));
    });

    return jours;
  }

  @Override
  public YearMonth getMoisAnneeReservation() {
    LocalDate date = LocalDate.now();
    // TODO ext parametre
    // if (date.getDayOfMonth() > 20) {
    return YearMonth.now().plusMonths(1);
    // }
    // return null;
  }

  @Override
  public boolean isReservationDoneForFamillyAndMonth(final YearMonth anneeMois,
      final Famille famille) {
    anneeMois.atDay(1);
    List<Consommation> consos = consommationRepository.findByActiviteAndFamilyBetweenDates(
        getCantineActivite(), famille,
        Date.from(anneeMois.atDay(1).atStartOfDay(ZoneId.systemDefault()).toInstant()),
        Date.from(anneeMois.atEndOfMonth().atStartOfDay(ZoneId.systemDefault()).toInstant()));
    return !consos.isEmpty();
  }

  public void saveReservation(final Famille famille, final YearMonth anneeMois,
      final boolean reserveLundi) {
    List<Inscription> icts = this.inscriptionRepository
        .findByActiviteAndFamille(this.getCantineActivite(), famille);
    List<Ouverture> ouvertures = this.ouvertureRepository.findByActiviteAndPeriode(
        this.getCantineActivite(),
        Date.from(anneeMois.atDay(1).atStartOfDay(ZoneId.systemDefault()).toInstant()),
        Date.from(anneeMois.atEndOfMonth().atStartOfDay(ZoneId.systemDefault()).toInstant()));
    ComptePayeur cp = this.comptePayeurRepository.findOneByFamille(famille);
    ouvertures.forEach(o -> {
      LocalDate date = o.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

      if (reserveLundi && date.getDayOfWeek() == DayOfWeek.MONDAY) {
        icts.forEach(i -> {
          Prestation presta = new Prestation();
          presta.setComptePayeur(cp);
          presta.setDate(o.getDate());
          presta.setCategorie("consommation");

          Consommation conso = new Consommation();
          conso.setDate(o.getDate());
          conso.setActivite(getCantineActivite());
          conso.setIndividu(i.getIndividu());
          conso.setInscription(i);

          // IDUnite => 1
          // IDgroupe => 1
          // heuredebut => 12:00
          // heurefin => 13:30
          // etat => reservation
          // verrouillage => 0
          // dateçsaisie => today
          // IDUtilisateur => 1
          // IDcategorie_tarif => 1
          // IDcompte_payeur => 14
          // IDprestation => 1452
          // quantite => null
          // etiquette => ''

          consommationRepository.save(conso);
        });
      }
    });

  }

  private Activite getCantineActivite() {
    Activite activite = new Activite();
    activite.setId(1);
    return activite;
  }

}
