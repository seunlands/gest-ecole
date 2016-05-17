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
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the corrections_villes database table.
 * 
 */
@Entity
@Table(name = "corrections_villes")

public class CorrectionVille implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcorrection;

  private String cp;

  private int IDville;

  private String mode;

  @Lob
  private String nom;

  public CorrectionVille() {
  }

  public int getIDcorrection() {
    return this.IDcorrection;
  }

  public void setIDcorrection(int IDcorrection) {
    this.IDcorrection = IDcorrection;
  }

  public String getCp() {
    return this.cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public int getIDville() {
    return this.IDville;
  }

  public void setIDville(int IDville) {
    this.IDville = IDville;
  }

  public String getMode() {
    return this.mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}