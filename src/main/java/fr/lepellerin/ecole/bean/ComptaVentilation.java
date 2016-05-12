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
 * The persistent class for the compta_ventilation database table.
 * 
 */
@Entity
@Table(name = "compta_ventilation")

public class ComptaVentilation implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDventilation;

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

  public ComptaVentilation() {
  }

  public int getIDventilation() {
    return this.IDventilation;
  }

  public void setIDventilation(int IDventilation) {
    this.IDventilation = IDventilation;
  }

  public String getDateBudget() {
    return this.dateBudget;
  }

  public void setDateBudget(String dateBudget) {
    this.dateBudget = dateBudget;
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

}