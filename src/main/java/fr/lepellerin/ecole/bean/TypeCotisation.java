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
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the types_cotisations database table.
 * 
 */
@Entity
@Table(name = "types_cotisations")

public class TypeCotisation implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDtype_cotisation;

  private int carte;

  @Lob
  @Column(name = "code_comptable")
  private String codeComptable;

  private int defaut;

  private String nom;

  private String type;

  public TypeCotisation() {
  }

  public int getIDtype_cotisation() {
    return this.IDtype_cotisation;
  }

  public void setIDtype_cotisation(int IDtype_cotisation) {
    this.IDtype_cotisation = IDtype_cotisation;
  }

  public int getCarte() {
    return this.carte;
  }

  public void setCarte(int carte) {
    this.carte = carte;
  }

  public String getCodeComptable() {
    return this.codeComptable;
  }

  public void setCodeComptable(String codeComptable) {
    this.codeComptable = codeComptable;
  }

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(int defaut) {
    this.defaut = defaut;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}