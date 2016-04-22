package fr.lepellerin.ecole.service;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.Famille;

import java.time.YearMonth;
import java.util.Set;

public interface CantineService {

  Set<Integer> getDateOuvert();

  /**
   * @return le mois année de la réservation en masse. (null si non ouverte)e
   */
  YearMonth getMoisAnneeReservation();

  boolean isReservationDoneForFamillyAndMonth(final YearMonth anneeMois, final Famille famille,
      final Activite activite);

}
