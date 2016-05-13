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
 * The persistent class for the caisses database table.
 * 
 */
@Entity
@Table(name = "caisses")

public class Caisse implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcaisse;

  @ManyToOne
  @JoinColumn(name = "IDregime")
  private Regime regime;

  private String nom;

  public Caisse() {
  }

  public int getIDcaisse() {
    return this.IDcaisse;
  }

  public void setIDcaisse(int IDcaisse) {
    this.IDcaisse = IDcaisse;
  }

  public Regime getRegime() {
    return regime;
  }

  public void setRegime(Regime regime) {
    this.regime = regime;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}