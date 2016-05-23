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
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the compta_ventilation database table.
 *
 */
@Entity
@Table(name = "compta_ventilation")

public class ComptaVentilation implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDventilation")
  private int id;

  @Column(name = "date_budget")
  private String dateBudget;

  @ManyToOne
  @JoinColumn(name = "IDanalytique")
  private ComptaAnalytique analytique;

  @ManyToOne
  @JoinColumn(name = "IDcategorie")
  private ComptaCategorie categorie;

  @ManyToOne
  @JoinColumn(name = "IDexercice")
  private ComptaExercice exercice;

  @ManyToOne
  @JoinColumn(name = "IDoperation")
  private ComptaOperation operation;

  @Lob
  private String libelle;

  private double montant;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getDateBudget() {
    return this.dateBudget;
  }

  public void setDateBudget(final String dateBudget) {
    this.dateBudget = dateBudget;
  }

  public String getLibelle() {
    return this.libelle;
  }

  public void setLibelle(final String libelle) {
    this.libelle = libelle;
  }

  public double getMontant() {
    return this.montant;
  }

  public void setMontant(final double montant) {
    this.montant = montant;
  }

}