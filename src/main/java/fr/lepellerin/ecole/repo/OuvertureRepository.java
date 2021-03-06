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
import fr.lepellerin.ecole.bean.Groupe;
import fr.lepellerin.ecole.bean.Ouverture;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface OuvertureRepository extends JpaRepository<Ouverture, Integer> {

  @Query("from Ouverture o where o.activite = ?1 and o.groupe = ?2 and date between ?3 and ?4 order by date")
  List<Ouverture> findByActiviteAndGroupeAndPeriode(Activite activite, Groupe groupe, Date debutPeriode, Date finPeriode);
  
  @Query("from Ouverture o where o.activite = ?1 and o.groupe = ?2 and date > ?3 order by date")
  List<Ouverture> findByActiviteAndGroupeAndDateDebut(Activite activite, Groupe groupe, Date debutPeriode);
  
  List<Ouverture> findByActivite(Activite activite);
}
