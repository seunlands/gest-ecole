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

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.util.List;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.exceptions.FunctionalException;
import fr.lepellerin.ecole.exceptions.TechnicalException;
import fr.lepellerin.ecole.service.dto.ComboItemDto;
import fr.lepellerin.ecole.service.dto.PlanningDto;

public interface CantineService {

  PlanningDto getDateOuvert(YearMonth anneeMois, Famille famille) throws TechnicalException;

  Activite getCantineActivite() throws TechnicalException;

  LocalDateTime getLimiteResaCantine(LocalDate date);

  List<ComboItemDto> getMoisOuvertCantine() throws TechnicalException;
  
  List<DayOfWeek> getJourOuvertCantine(final LocalDate startDate, final Famille famille) throws TechnicalException;

  void reserver(LocalDate startDate, Famille famille, List<DayOfWeek> jours) throws TechnicalException;

  String reserver(LocalDate date, int individuId, Famille famille, Boolean reserve)
      throws FunctionalException, TechnicalException;

}
