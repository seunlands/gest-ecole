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


package fr.lepellerin.ecole.repo;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.Consommation;
import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.bean.Individu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ConsommationRepository extends JpaRepository<Consommation, Integer> {

  Consommation findByActiviteAndIndividuAndDate(Activite activite, Individu individu, Date date);

  @Query("from Consommation c where c.activite = ?1 and c.inscription.famille = ?2 and "
      + "c.date between ?3 and ?4" + " order by date")
  List<Consommation> findByActiviteAndFamilyBetweenDates(Activite activite, Famille famille,
      Date dateInf, Date dateSup);

}
