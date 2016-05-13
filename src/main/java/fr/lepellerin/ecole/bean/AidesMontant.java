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
 * The persistent class for the aides_montants database table.
 * 
 */
@Entity
@Table(name = "aides_montants")
public class AidesMontant implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDaide_montant;

  @ManyToOne
  @JoinColumn(name = "IDaide")
  private Aide aide;

  private double montant;

  public AidesMontant() {
  }

  public int getIDaide_montant() {
    return this.IDaide_montant;
  }

  public void setIDaide_montant(int IDaide_montant) {
    this.IDaide_montant = IDaide_montant;
  }

  public Aide getAide() {
    return aide;
  }

  public void setAide(Aide aide) {
    this.aide = aide;
  }

  public double getMontant() {
    return this.montant;
  }

  public void setMontant(double montant) {
    this.montant = montant;
  }

}