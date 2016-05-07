package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the ventilation database table.
 * 
 */
@Entity

public class Ventilation implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDventilation;

  @ManyToOne
  @JoinColumn(name = "IDcompte_payeur")
  private ComptePayeur comptePayeur;

  @ManyToOne
  @JoinColumn(name = "IDprestation")
  private Prestation prestation;

  @ManyToOne
  @JoinColumn(name = "IDreglement")
  private Reglement reglement;

  private double montant;

  public Ventilation() {
  }

  public int getIDventilation() {
    return this.IDventilation;
  }

  public void setIDventilation(int IDventilation) {
    this.IDventilation = IDventilation;
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

  public Reglement getReglement() {
    return reglement;
  }

  public void setReglement(Reglement reglement) {
    this.reglement = reglement;
  }

  public double getMontant() {
    return this.montant;
  }

  public void setMontant(double montant) {
    this.montant = montant;
  }

}