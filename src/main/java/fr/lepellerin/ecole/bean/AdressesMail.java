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
import javax.persistence.Table;

/**
 * The persistent class for the adresses_mail database table.
 * 
 */
@Entity
@Table(name = "adresses_mail")

public class AdressesMail implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDadresse")
  private int id;

  private String adresse;

  private int connexionssl;

  private int defaut;

  private String motdepasse;

  private int port;

  private String smtp;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAdresse() {
    return this.adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public int getConnexionssl() {
    return this.connexionssl;
  }

  public void setConnexionssl(int connexionssl) {
    this.connexionssl = connexionssl;
  }

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(int defaut) {
    this.defaut = defaut;
  }

  public String getMotdepasse() {
    return this.motdepasse;
  }

  public void setMotdepasse(String motdepasse) {
    this.motdepasse = motdepasse;
  }

  public int getPort() {
    return this.port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public String getSmtp() {
    return this.smtp;
  }

  public void setSmtp(String smtp) {
    this.smtp = smtp;
  }

}