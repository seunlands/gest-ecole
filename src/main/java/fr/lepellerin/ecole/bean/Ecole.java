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
 * The persistent class for the ecoles database table.
 *
 */
@Entity
@Table(name = "ecoles")

public class Ecole implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDecole")
  private int id;

  private String cp;

  private String fax;

  private String mail;

  @Lob
  private String nom;

  private String rue;

  private String secteurs;

  private String tel;

  private String ville;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getCp() {
    return this.cp;
  }

  public void setCp(final String cp) {
    this.cp = cp;
  }

  public String getFax() {
    return this.fax;
  }

  public void setFax(final String fax) {
    this.fax = fax;
  }

  public String getMail() {
    return this.mail;
  }

  public void setMail(final String mail) {
    this.mail = mail;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(final String nom) {
    this.nom = nom;
  }

  public String getRue() {
    return this.rue;
  }

  public void setRue(final String rue) {
    this.rue = rue;
  }

  public String getSecteurs() {
    return this.secteurs;
  }

  public void setSecteurs(final String secteurs) {
    this.secteurs = secteurs;
  }

  public String getTel() {
    return this.tel;
  }

  public void setTel(final String tel) {
    this.tel = tel;
  }

  public String getVille() {
    return this.ville;
  }

  public void setVille(final String ville) {
    this.ville = ville;
  }

}