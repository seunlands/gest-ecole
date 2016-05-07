package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the regimes database table.
 * 
 */
@Entity
@Table(name = "regimes")

public class Regime implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDregime;

  private String nom;

  public Regime() {
  }

  public int getIDregime() {
    return this.IDregime;
  }

  public void setIDregime(int IDregime) {
    this.IDregime = IDregime;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}