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
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the documents_modeles database table.
 *
 */
@Entity
@Table(name = "documents_modeles")

public class DocumentModele implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDmodele")
  private int id;

  private String categorie;

  private int defaut;

  private int hauteur;

  @Column(name = "IDfond")
  private int idFond;

  private int largeur;

  private String nom;

  @Lob
  private String observations;

  private int supprimable;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getCategorie() {
    return this.categorie;
  }

  public void setCategorie(final String categorie) {
    this.categorie = categorie;
  }

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(final int defaut) {
    this.defaut = defaut;
  }

  public int getHauteur() {
    return this.hauteur;
  }

  public void setHauteur(final int hauteur) {
    this.hauteur = hauteur;
  }

  public int getIdFond() {
    return this.idFond;
  }

  public void setIdFond(final int idFond) {
    this.idFond = idFond;
  }

  public int getLargeur() {
    return this.largeur;
  }

  public void setLargeur(final int largeur) {
    this.largeur = largeur;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(final String nom) {
    this.nom = nom;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(final String observations) {
    this.observations = observations;
  }

  public int getSupprimable() {
    return this.supprimable;
  }

  public void setSupprimable(final int supprimable) {
    this.supprimable = supprimable;
  }

}