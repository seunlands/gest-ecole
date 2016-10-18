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
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the vacances database table.
 * 
 */
@Entity
@Table(name = "vacances")

public class Vacances implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDvacance")
  private int id;

  private int annee;

  @Column(name = "date_debut")
  @Temporal(TemporalType.DATE)
  private Date dateDebut;

  @Column(name = "date_fin")
  @Temporal(TemporalType.DATE)
  private Date dateFin;

  private String nom;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAnnee() {
    return this.annee;
  }

  public void setAnnee(int annee) {
    this.annee = annee;
  }

  public Date getDateDebut() {
    return this.dateDebut;
  }

  public void setDateDebut(Date dateDebut) {
    this.dateDebut = dateDebut;
  }

  public Date getDateFin() {
    return this.dateFin;
  }

  public void setDateFin(Date dateFin) {
    this.dateFin = dateFin;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}