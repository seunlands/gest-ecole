package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the aides_montants database table.
 * 
 */
@Entity
@Table(name = "aides_montants")
public class AidesMontant implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDaide_montant;

  @ManyToOne
  @JoinColumn(name = "IDaide")
  private Aide aide;

  private double montant;

  public AidesMontant() {
  }

  public int getIDaide_montant() {
    return this.IDaide_montant;
  }

  public void setIDaide_montant(int IDaide_montant) {
    this.IDaide_montant = IDaide_montant;
  }

  public Aide getAide() {
    return aide;
  }

  public void setAide(Aide aide) {
    this.aide = aide;
  }

  public double getMontant() {
    return this.montant;
  }

  public void setMontant(double montant) {
    this.montant = montant;
  }

}