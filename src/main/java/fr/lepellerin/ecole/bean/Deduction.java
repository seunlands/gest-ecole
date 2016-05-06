package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the deductions database table.
 * 
 */
@Entity
@Table(name = "deductions")

public class Deduction implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDdeduction;

  private String date;

  @ManyToOne
  @JoinColumn(name = "IDaide")
  private Aide aide;

  @ManyToOne
  @JoinColumn(name = "IDcompte_payeur")
  private ComptePayeur comptePayeur;

  @ManyToOne
  @JoinColumn(name = "IDprestation")
  private Prestation prestation;

  private String label;

  private double montant;

  public Deduction() {
  }

  public int getIDdeduction() {
    return this.IDdeduction;
  }

  public void setIDdeduction(int IDdeduction) {
    this.IDdeduction = IDdeduction;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Aide getAide() {
    return aide;
  }

  public void setAide(Aide aide) {
    this.aide = aide;
  }

  public ComptePayeur getComptePayeur() {
    return comptePayeur;
  }

  public void setComptePayeur(ComptePayeur comptePayeur) {
    this.comptePayeur = comptePayeur;
  }

  public Prestation getPrestation() {
    return prestation;
  }

  public void setPrestation(Prestation prestation) {
    this.prestation = prestation;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public double getMontant() {
    return this.montant;
  }

  public void setMontant(double montant) {
    this.montant = montant;
  }

}