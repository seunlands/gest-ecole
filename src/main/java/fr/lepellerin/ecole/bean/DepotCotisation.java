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

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the depots_cotisations database table.
 * 
 */
@Entity
@Table(name = "depots_cotisations")

public class DepotCotisation implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDdepot_cotisation;

  private String date;

  private String nom;

  @Lob
  private String observations;

  private int verrouillage;

  public DepotCotisation() {
  }

  public int getIDdepot_cotisation() {
    return this.IDdepot_cotisation;
  }

  public void setIDdepot_cotisation(int IDdepot_cotisation) {
    this.IDdepot_cotisation = IDdepot_cotisation;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
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

  public int getVerrouillage() {
    return this.verrouillage;
  }

  public void setVerrouillage(int verrouillage) {
    this.verrouillage = verrouillage;
  }

}