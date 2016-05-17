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
 * The persistent class for the compta_budgets database table.
 * 
 */
@Entity
@Table(name = "compta_budgets")

public class ComptaBudget implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDbudget;

  @Lob
  private String analytiques;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @ManyToOne
  @JoinColumn(name = "IDexercice")
  private ComptaExercice exercice;

  @Lob
  private String nom;

  private String observations;

  public ComptaBudget() {
  }

  public int getIDbudget() {
    return this.IDbudget;
  }

  public void setIDbudget(int IDbudget) {
    this.IDbudget = IDbudget;
  }

  public String getAnalytiques() {
    return this.analytiques;
  }

  public void setAnalytiques(String analytiques) {
    this.analytiques = analytiques;
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

  public ComptaExercice getExercice() {
    return exercice;
  }

  public void setExercice(ComptaExercice exercice) {
    this.exercice = exercice;
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

}