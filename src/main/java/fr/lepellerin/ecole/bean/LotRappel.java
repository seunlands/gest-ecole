package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the lots_rappels database table.
 * 
 */
@Entity
@Table(name = "lots_rappels")

public class LotRappel implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDlot;

  @Lob
  private String nom;

  public LotRappel() {
  }

  public int getIDlot() {
    return this.IDlot;
  }

  public void setIDlot(int IDlot) {
    this.IDlot = IDlot;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}