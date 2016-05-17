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
import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.repo.ConsommationRepository;
import fr.lepellerin.ecole.repo.InscriptionRepository;
import fr.lepellerin.ecole.repo.OuvertureRepository;
import fr.lepellerin.ecole.repo.VacancesRepository;
import fr.lepellerin.ecole.service.InscriptionService;
import fr.lepellerin.ecole.service.dto.PlanningDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InscriptionServiceImpl implements InscriptionService {

  @Autowired
  private InscriptionRepository inscriptionRepository;

  @Autowired
  private OuvertureRepository ouvertureRepository;

  @Autowired
  private VacancesRepository vacancesRepo;

  @Autowired
  private ConsommationRepository consommationRepo;

  @Override
  public PlanningDto findByActiviteAndFamille(Activite activite, Famille famille) {
    // Calendar cal = new GregorianCalendar();
    // cal.set(2016, Calendar.APRIL, 1);
    // Date debut = cal.getTime();
    // cal.set(Calendar.DAY_OF_MONTH, 30);
    // Date fin = cal.getTime();
    // List<Ouverture> ouvertures =
    // this.ouvertureRepository.findByActiviteAndPeriode(activite, debut,
    // fin);
    // List<Inscription> icts =
    // this.inscriptionRepository.findByActiviteAndFamille(activite, famille);
    // icts.forEach(i -> {
    // ReservationEnfantDto reservation = new ReservationEnfantDto();
    // reservation.setNomEnfant(i.getIndividu().getPrenom());
    // reservation.setDatesReserves(new ArrayList<>());
    // });

    PlanningDto planning = new PlanningDto();

    // for (Ouverture o : ouvertures) {
    // for (Inscription i : icts) {
    // if (i.getGroupe() != null && i.getGroupe().equals(o.getGroupe())
    // && !planning.getDates().contains(o.getDate())) {
    // DateDto date = new DateDto();
    // date.setDate(o.getDate());
    // planning.getDates().add(date);
    // }
    // }
    // }
    //
    // /*
    // * Calendar aujourdhui = GeDateUtils.truncateCal(new GregorianCalendar());
    // * aujourdhui.add(Calendar.DATE, 1); if
    // * (o.getDate().after(aujourdhui.getTime())) {
    // * planning.getDatesReservables().add(o.getDate()); } // date reservable
    // si
    // * date > auj + 1; Consommation conso =
    // * this.consommationRepo.findByActiviteAndIndividuAndDate(activite,
    // * i.getIndividu(), o.getDate()); if (conso != null &&
    // * EnumEtatReservation.RESERVE.getLibelle().equals(conso.getEtat())) {
    // * planning.getDatesReserves().add(o.getDate()); }
    // *
    // */
    //
    // List<Vacances> vacs = this.vacancesRepo.findVacancesByPeriode(debut,
    // fin);
    // List<Date> datesDuMois = new ArrayList<>();
    // ouvertures.forEach(o -> datesDuMois.add(o.getDate()));

    return planning;
  }

}
