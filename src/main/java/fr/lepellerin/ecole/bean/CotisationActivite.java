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
 * The persistent class for the cotisations_activites database table.
 * 
 */
@Entity
@Table(name = "cotisations_activites")

public class CotisationActivite implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcotisation_activite;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDtype_cotisation")
  private TypeCotisation typeCotisation;

  public CotisationActivite() {
  }

  public int getIDcotisation_activite() {
    return this.IDcotisation_activite;
  }

  public void setIDcotisation_activite(int IDcotisation_activite) {
    this.IDcotisation_activite = IDcotisation_activite;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public TypeCotisation getTypeCotisation() {
    return typeCotisation;
  }

  public void setTypeCotisation(TypeCotisation typeCotisation) {
    this.typeCotisation = typeCotisation;
  }

}