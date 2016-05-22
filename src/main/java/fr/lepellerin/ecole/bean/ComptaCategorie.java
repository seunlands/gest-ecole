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
import javax.persistence.GeneratedValue;
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
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDcategorie")
  private int id;

  private String abrege;

  @ManyToOne
  @JoinColumn(name = "IDcompte")
  private ComptaComptesComptable compte;

  private String journal;

  @Lob
  private String nom;

  private String type;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getAbrege() {
    return this.abrege;
  }

  public void setAbrege(final String abrege) {
    this.abrege = abrege;
  }

  public ComptaComptesComptable getCompte() {
    return compte;
  }

  public void setCompte(final ComptaComptesComptable compte) {
    this.compte = compte;
  }

  public String getJournal() {
    return this.journal;
  }

  public void setJournal(final String journal) {
    this.journal = journal;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(final String nom) {
    this.nom = nom;
  }

  public String getType() {
    return this.type;
  }

  public void setType(final String type) {
    this.type = type;
  }

}