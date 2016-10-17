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
 * The persistent class for the modeles_tickets database table.
 * 
 */
@Entity
@Table(name = "modeles_tickets")

public class ModeleTicket implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDmodele")
  private int id;

  @Lob
  private String categorie;

  private int defaut;

  @Lob
  private String description;

  @Lob
  private String imprimante;

  private int interligne;

  @Lob
  private String lignes;

  @Lob
  private String nom;

  private int taille;

  public ModeleTicket() {
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCategorie() {
    return this.categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(int defaut) {
    this.defaut = defaut;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getImprimante() {
    return this.imprimante;
  }

  public void setImprimante(String imprimante) {
    this.imprimante = imprimante;
  }

  public int getInterligne() {
    return this.interligne;
  }

  public void setInterligne(int interligne) {
    this.interligne = interligne;
  }

  public String getLignes() {
    return this.lignes;
  }

  public void setLignes(String lignes) {
    this.lignes = lignes;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public int getTaille() {
    return this.taille;
  }

  public void setTaille(int taille) {
    this.taille = taille;
  }

}