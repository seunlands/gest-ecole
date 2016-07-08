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

package fr.lepellerin.ecole.service;

import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.service.dto.PlanningDto;

import java.time.LocalDate;
import java.time.YearMonth;

public interface CantineService {

  /**
   * @return le mois année de la réservation en masse. (null si non ouverte)
   */
  YearMonth getMoisAnneeReservation();

  boolean isReservationDoneForFamillyAndMonth(YearMonth anneeMois, Famille famille);

  PlanningDto getDateOuvert(YearMonth anneeMois, Famille famille);

  String reserver(LocalDate date, int individuId, Famille famille);

}
