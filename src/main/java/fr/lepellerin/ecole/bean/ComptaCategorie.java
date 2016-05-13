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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the compta_categories database table.
 * 
 */
@Entity
@Table(name = "compta_categories")

public class ComptaCategorie implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcategorie;

  private String abrege;

  @ManyToOne
  @JoinColumn(name = "IDcompte")
  private ComptaComptesComptable compte;

  private String journal;

  @Lob
  private String nom;

  private String type;

  public ComptaCategorie() {
  }

  public int getIDcategorie() {
    return this.IDcategorie;
  }

  public void setIDcategorie(int IDcategorie) {
    this.IDcategorie = IDcategorie;
  }

  public String getAbrege() {
    return this.abrege;
  }

  public void setAbrege(String abrege) {
    this.abrege = abrege;
  }

  public ComptaComptesComptable getCompte() {
    return compte;
  }

  public void setCompte(ComptaComptesComptable compte) {
    this.compte = compte;
  }

  public String getJournal() {
    return this.journal;
  }

  public void setJournal(String journal) {
    this.journal = journal;
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