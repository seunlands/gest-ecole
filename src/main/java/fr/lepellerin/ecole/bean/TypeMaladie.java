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

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the types_maladies database table.
 * 
 */
@Entity
@Table(name = "types_maladies")

public class TypeMaladie implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDtype_maladie;

  private String nom;

  @Column(name = "vaccin_obligatoire")
  private int vaccinObligatoire;

  public TypeMaladie() {
  }

  public int getIDtype_maladie() {
    return this.IDtype_maladie;
  }

  public void setIDtype_maladie(int IDtype_maladie) {
    this.IDtype_maladie = IDtype_maladie;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public int getVaccinObligatoire() {
    return this.vaccinObligatoire;
  }

  public void setVaccinObligatoire(int vaccinObligatoire) {
    this.vaccinObligatoire = vaccinObligatoire;
  }

}