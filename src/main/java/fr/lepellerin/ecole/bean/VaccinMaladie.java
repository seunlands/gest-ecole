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
 * The persistent class for the vaccins_maladies database table.
 * 
 */
@Entity
@Table(name = "vaccins_maladies")

public class VaccinMaladie implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDvaccins_maladies;

  @ManyToOne
  @JoinColumn(name = "IDtype_maladie")
  private TypeMaladie typeMaladie;

  @ManyToOne
  @JoinColumn(name = "IDtype_vaccin")
  private TypeVaccin typeVaccin;

  public VaccinMaladie() {
  }

  public int getIDvaccins_maladies() {
    return this.IDvaccins_maladies;
  }

  public void setIDvaccins_maladies(int IDvaccins_maladies) {
    this.IDvaccins_maladies = IDvaccins_maladies;
  }

  public TypeMaladie getTypeMaladie() {
    return typeMaladie;
  }

  public void setTypeMaladie(TypeMaladie typeMaladie) {
    this.typeMaladie = typeMaladie;
  }

  public TypeVaccin getTypeVaccin() {
    return typeVaccin;
  }

  public void setTypeVaccin(TypeVaccin typeVaccin) {
    this.typeVaccin = typeVaccin;
  }

}