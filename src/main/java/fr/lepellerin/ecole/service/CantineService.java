package fr.lepellerin.ecole.service;

import java.time.YearMonth;
import java.util.Set;

public interface CantineService {

  Set<Integer> getDateOuvert();

  /**
   * @return le mois année de la réservation en masse. (null si non ouverte)e
   */
  YearMonth getMoisAnneeReservation();

}
