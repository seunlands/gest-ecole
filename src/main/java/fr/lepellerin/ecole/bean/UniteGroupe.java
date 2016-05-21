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


package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the unites_groupes database table.
 * 
 */
@Entity
@Table(name = "unites_groupes")

public class UniteGroupe implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDunite_groupe;

  @ManyToOne
  @JoinColumn(name = "IDgroupe")
  private Groupe groupe;

  @ManyToOne
  @JoinColumn(name = "IDunite")
  private Unite unite;

  public UniteGroupe() {
  }

  public int getIDunite_groupe() {
    return this.IDunite_groupe;
  }

  public void setIDunite_groupe(int IDunite_groupe) {
    this.IDunite_groupe = IDunite_groupe;
  }

  public Groupe getGroupe() {
    return groupe;
  }

  public void setGroupe(Groupe groupe) {
    this.groupe = groupe;
  }

  public Unite getUnite() {
    return unite;
  }

  public void setUnite(Unite unite) {
    this.unite = unite;
  }

}