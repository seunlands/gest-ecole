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
 * The persistent class for the lots_prelevements database table.
 * 
 */
@Entity
@Table(name = "lots_prelevements")

public class LotPrelevement implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDlot")
  private int id;

  private String date;

  private int IDcompte;

  private int IDmode;

  private String nom;

  @Lob
  private String observations;

  @Column(name = "reglement_auto")
  private int reglementAuto;

  private String type;

  private int verrouillage;

  public LotPrelevement() {
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public int getIDcompte() {
    return this.IDcompte;
  }

  public void setIDcompte(int IDcompte) {
    this.IDcompte = IDcompte;
  }

  public int getIDmode() {
    return this.IDmode;
  }

  public void setIDmode(int IDmode) {
    this.IDmode = IDmode;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

  public int getReglementAuto() {
    return this.reglementAuto;
  }

  public void setReglementAuto(int reglementAuto) {
    this.reglementAuto = reglementAuto;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getVerrouillage() {
    return this.verrouillage;
  }

  public void setVerrouillage(int verrouillage) {
    this.verrouillage = verrouillage;
  }

}