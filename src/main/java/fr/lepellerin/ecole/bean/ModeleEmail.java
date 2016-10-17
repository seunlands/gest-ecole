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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the modeles_emails database table.
 * 
 */
@Entity
@Table(name = "modeles_emails")

public class ModeleEmail implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDmodele")
  private int id;

  @Lob
  private String categorie;

  private int defaut;

  @Lob
  private String description;

  @ManyToOne
  @JoinColumn(name = "IDadresse")
  private AdressesMail adresse;

  @Lob
  private String nom;

  @Lob
  private String objet;

  @Lob
  @Column(name = "texte_xml")
  private String texteXml;

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

  public AdressesMail getAdresse() {
    return adresse;
  }

  public void setAdresse(AdressesMail adresse) {
    this.adresse = adresse;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getObjet() {
    return this.objet;
  }

  public void setObjet(String objet) {
    this.objet = objet;
  }

  public String getTexteXml() {
    return this.texteXml;
  }

  public void setTexteXml(String texteXml) {
    this.texteXml = texteXml;
  }

}