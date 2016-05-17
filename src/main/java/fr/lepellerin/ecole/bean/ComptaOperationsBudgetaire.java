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
 * The persistent class for the compta_operations_budgetaires database table.
 * 
 */
@Entity
@Table(name = "compta_operations_budgetaires")

public class ComptaOperationsBudgetaire implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDoperation_budgetaire;

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

  public ComptaOperationsBudgetaire() {
  }

  public int getIDoperation_budgetaire() {
    return this.IDoperation_budgetaire;
  }

  public void setIDoperation_budgetaire(int IDoperation_budgetaire) {
    this.IDoperation_budgetaire = IDoperation_budgetaire;
  }

  public String getDateBudget() {
    return this.dateBudget;
  }

  public void setDateBudget(String dateBudget) {
    this.dateBudget = dateBudget;
  }

  public ComptaAnalytique getAnalytique() {
    return analytique;
  }

  public void setAnalytique(ComptaAnalytique analytique) {
    this.analytique = analytique;
  }

  public ComptaCategorie getCategorie() {
    return categorie;
  }

  public void setCategorie(ComptaCategorie categorie) {
    this.categorie = categorie;
  }

  public String getLibelle() {
    return this.libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public double getMontant() {
    return this.montant;
  }

  public void setMontant(double montant) {
    this.montant = montant;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}