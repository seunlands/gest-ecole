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
import javax.persistence.Table;

/**
 * The persistent class for the liens database table.
 * 
 */
@Entity
@Table(name = "liens")

public class Lien implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDlien;

  private int IDautorisation;

  private int IDfamille;

  private int IDindividu_objet;

  private int IDindividu_sujet;

  private int IDtype_lien;

  private int responsable;

  public Lien() {
  }

  public int getIDlien() {
    return this.IDlien;
  }

  public void setIDlien(int IDlien) {
    this.IDlien = IDlien;
  }

  public int getIDautorisation() {
    return this.IDautorisation;
  }

  public void setIDautorisation(int IDautorisation) {
    this.IDautorisation = IDautorisation;
  }

  public int getIDfamille() {
    return this.IDfamille;
  }

  public void setIDfamille(int IDfamille) {
    this.IDfamille = IDfamille;
  }

  public int getIDindividu_objet() {
    return this.IDindividu_objet;
  }

  public void setIDindividu_objet(int IDindividu_objet) {
    this.IDindividu_objet = IDindividu_objet;
  }

  public int getIDindividu_sujet() {
    return this.IDindividu_sujet;
  }

  public void setIDindividu_sujet(int IDindividu_sujet) {
    this.IDindividu_sujet = IDindividu_sujet;
  }

  public int getIDtype_lien() {
    return this.IDtype_lien;
  }

  public void setIDtype_lien(int IDtype_lien) {
    this.IDtype_lien = IDtype_lien;
  }

  public int getResponsable() {
    return this.responsable;
  }

  public void setResponsable(int responsable) {
    this.responsable = responsable;
  }

}