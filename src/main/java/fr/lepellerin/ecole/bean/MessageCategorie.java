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
 * The persistent class for the messages_categories database table.
 * 
 */
@Entity
@Table(name = "messages_categories")

public class MessageCategorie implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcategorie;

  @Column(name = "afficher_accueil")
  private int afficherAccueil;

  @Column(name = "afficher_liste")
  private int afficherListe;

  private String nom;

  private String priorite;

  public MessageCategorie() {
  }

  public int getIDcategorie() {
    return this.IDcategorie;
  }

  public void setIDcategorie(int IDcategorie) {
    this.IDcategorie = IDcategorie;
  }

  public int getAfficherAccueil() {
    return this.afficherAccueil;
  }

  public void setAfficherAccueil(int afficherAccueil) {
    this.afficherAccueil = afficherAccueil;
  }

  public int getAfficherListe() {
    return this.afficherListe;
  }

  public void setAfficherListe(int afficherListe) {
    this.afficherListe = afficherListe;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPriorite() {
    return this.priorite;
  }

  public void setPriorite(String priorite) {
    this.priorite = priorite;
  }

}