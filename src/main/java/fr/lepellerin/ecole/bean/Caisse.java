package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the caisses database table.
 * 
 */
@Entity
@Table(name = "caisses")

public class Caisse implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcaisse;

  @ManyToOne
  @JoinColumn(name = "IDregime")
  private Regime regime;

  private String nom;

  public Caisse() {
  }

  public int getIDcaisse() {
    return this.IDcaisse;
  }

  public void setIDcaisse(int IDcaisse) {
    this.IDcaisse = IDcaisse;
  }

  public Regime getRegime() {
    return regime;
  }

  public void setRegime(Regime regime) {
    this.regime = regime;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}