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
 * The persistent class for the badgeage_procedures database table.
 *
 */
@Entity
@Table(name = "badgeage_procedures")
public class BadgeageProcedure implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDprocedure")
  private int id;

  @Lob
  private String activites;

  private int confirmation;

  private int defaut;

  @Lob
  private String image;

  @Lob
  private String nom;

  @Lob
  private String style;

  @Lob
  private String systeme;

  @Lob
  private String theme;

  private int tutoiement;

  private int vocal;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getActivites() {
    return this.activites;
  }

  public void setActivites(final String activites) {
    this.activites = activites;
  }

  public int getConfirmation() {
    return this.confirmation;
  }

  public void setConfirmation(final int confirmation) {
    this.confirmation = confirmation;
  }

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(final int defaut) {
    this.defaut = defaut;
  }

  public String getImage() {
    return this.image;
  }

  public void setImage(final String image) {
    this.image = image;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(final String nom) {
    this.nom = nom;
  }

  public String getStyle() {
    return this.style;
  }

  public void setStyle(final String style) {
    this.style = style;
  }

  public String getSysteme() {
    return this.systeme;
  }

  public void setSysteme(final String systeme) {
    this.systeme = systeme;
  }

  public String getTheme() {
    return this.theme;
  }

  public void setTheme(final String theme) {
    this.theme = theme;
  }

  public int getTutoiement() {
    return this.tutoiement;
  }

  public void setTutoiement(final int tutoiement) {
    this.tutoiement = tutoiement;
  }

  public int getVocal() {
    return this.vocal;
  }

  public void setVocal(final int vocal) {
    this.vocal = vocal;
  }

}