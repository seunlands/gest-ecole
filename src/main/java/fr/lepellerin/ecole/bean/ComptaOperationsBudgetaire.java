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
 * The persistent class for the compta_operations_budgetaires database table.
 *
 */
@Entity
@Table(name = "compta_operations_budgetaires")

public class ComptaOperationsBudgetaire implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDoperation_budgetaire")
  private int id;

  @Column(name = "date_budget")
  private String dateBudget;

  @ManyToOne
  @JoinColumn(name = "IDanalytique")
  private ComptaAnalytique analytique;

  @ManyToOne
  @JoinColumn(name = "IDcategorie")
  private ComptaCategorie categorie;

  @Lob
  private String libelle;

  private double montant;

  private String type;

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

  public ComptaAnalytique getAnalytique() {
    return analytique;
  }

  public void setAnalytique(final ComptaAnalytique analytique) {
    this.analytique = analytique;
  }

  public ComptaCategorie getCategorie() {
    return categorie;
  }

  public void setCategorie(final ComptaCategorie categorie) {
    this.categorie = categorie;
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

  public String getType() {
    return this.type;
  }

  public void setType(final String type) {
    this.type = type;
  }

}