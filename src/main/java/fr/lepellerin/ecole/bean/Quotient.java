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
 * The persistent class for the quotients database table.
 * 
 */
@Entity
@Table(name = "quotients")

public class Quotient implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDquotient;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @Lob
  private String observations;

  private int quotient;

  private double revenu;

  public Quotient() {
  }

  public int getIDquotient() {
    return this.IDquotient;
  }

  public void setIDquotient(int IDquotient) {
    this.IDquotient = IDquotient;
  }

  public String getDateDebut() {
    return this.dateDebut;
  }

  public void setDateDebut(String dateDebut) {
    this.dateDebut = dateDebut;
  }

  public String getDateFin() {
    return this.dateFin;
  }

  public void setDateFin(String dateFin) {
    this.dateFin = dateFin;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(Famille famille) {
    this.famille = famille;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

  public int getQuotient() {
    return this.quotient;
  }

  public void setQuotient(int quotient) {
    this.quotient = quotient;
  }

  public double getRevenu() {
    return this.revenu;
  }

  public void setRevenu(double revenu) {
    this.revenu = revenu;
  }

}