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

import fr.lepellerin.ecole.bean.Famille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FamilleRepository extends JpaRepository<Famille, Integer> {

  @Query("select distinct f from Famille f join f.rattachements r "
      + "where r.idCategorie = 2 and not exists (select 1 from User u where u.famille = f)")
  List<Famille> findWithoutUserAccount();

  @Query("select distinct f from Famille f join f.rattachements r join r.individu i "
      + "where i.mail = ?1")
  List<Famille> findFamilleByEmail(String email);

}
