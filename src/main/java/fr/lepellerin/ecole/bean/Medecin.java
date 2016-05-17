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
 * The persistent class for the medecins database table.
 * 
 */
@Entity
@Table(name = "medecins")

public class Medecin implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDmedecin;

  @Column(name = "cp_resid")
  private String cpResid;

  private String nom;

  private String prenom;

  @Column(name = "rue_resid")
  private String rueResid;

  @Column(name = "tel_cabinet")
  private String telCabinet;

  @Column(name = "tel_mobile")
  private String telMobile;

  @Column(name = "ville_resid")
  private String villeResid;

  public Medecin() {
  }

  public int getIDmedecin() {
    return this.IDmedecin;
  }

  public void setIDmedecin(int IDmedecin) {
    this.IDmedecin = IDmedecin;
  }

  public String getCpResid() {
    return this.cpResid;
  }

  public void setCpResid(String cpResid) {
    this.cpResid = cpResid;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return this.prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getRueResid() {
    return this.rueResid;
  }

  public void setRueResid(String rueResid) {
    this.rueResid = rueResid;
  }

  public String getTelCabinet() {
    return this.telCabinet;
  }

  public void setTelCabinet(String telCabinet) {
    this.telCabinet = telCabinet;
  }

  public String getTelMobile() {
    return this.telMobile;
  }

  public void setTelMobile(String telMobile) {
    this.telMobile = telMobile;
  }

  public String getVilleResid() {
    return this.villeResid;
  }

  public void setVilleResid(String villeResid) {
    this.villeResid = villeResid;
  }

}