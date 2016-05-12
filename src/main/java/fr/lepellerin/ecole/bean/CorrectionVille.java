package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the corrections_villes database table.
 * 
 */
@Entity
@Table(name = "corrections_villes")

public class CorrectionVille implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcorrection;

  private String cp;

  private int IDville;

  private String mode;

  @Lob
  private String nom;

  public CorrectionVille() {
  }

  public int getIDcorrection() {
    return this.IDcorrection;
  }

  public void setIDcorrection(int IDcorrection) {
    this.IDcorrection = IDcorrection;
  }

  public String getCp() {
    return this.cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public int getIDville() {
    return this.IDville;
  }

  public void setIDville(int IDville) {
    this.IDville = IDville;
  }

  public String getMode() {
    return this.mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}