package fr.lepellerin.ecole.service.internal;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.Consommation;
import fr.lepellerin.ecole.bean.Individu;
import fr.lepellerin.ecole.bean.Inscription;
import fr.lepellerin.ecole.bean.Unite;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class ReservationServiceImpl {

  public void reserver(final Activite activite, final Individu individu, final LocalDate date,
      final Inscription ict, final Unite unite) {
    final Consommation conso = new Consommation();
    conso.setDateSaisie(new Date());
    conso.setActivite(activite);
    conso.setCategorieTarif(ict.getCategorieTarif());
    conso.setComptePayeur(ict.getComptePayeur());
    conso.setEtat("reservation");
    conso.setIndividu(individu);
    conso.setDate(Date.from(date.atStartOfDay(ZoneId.systemDefault()).toInstant()));
    // TODO a retrouver par activite
    conso.setUnite(unite);
    conso.setGroupe(ict.getGroupe());
    conso.setHeureDebut(unite.getHeureDebut());
    conso.setHeureFin(unite.getHeureFin());
    // TODO creer la prestation.
    conso.setPrestation(null);
    // conso.setDa
  }

}
