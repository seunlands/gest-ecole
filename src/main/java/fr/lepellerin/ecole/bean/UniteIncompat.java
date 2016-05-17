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
 * The persistent class for the unites_incompat database table.
 * 
 */
@Entity
@Table(name = "unites_incompat")

public class UniteIncompat implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDunite_incompat;

  @ManyToOne
  @JoinColumn(name = "IDunite")
  private Unite unite;

  @ManyToOne
  @JoinColumn(name = "IDunite_incompatible")
  private Unite uniteIncompatible;

  public UniteIncompat() {
  }

  public int getIDunite_incompat() {
    return this.IDunite_incompat;
  }

  public void setIDunite_incompat(int IDunite_incompat) {
    this.IDunite_incompat = IDunite_incompat;
  }

  public Unite getUnite() {
    return unite;
  }

  public void setUnite(Unite unite) {
    this.unite = unite;
  }

  public Unite getUniteIncompatible() {
    return uniteIncompatible;
  }

  public void setUniteIncompatible(Unite uniteIncompatible) {
    this.uniteIncompatible = uniteIncompatible;
  }

}