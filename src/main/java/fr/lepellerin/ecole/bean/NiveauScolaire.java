package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the niveaux_scolaires database table.
 * 
 */
@Entity
@Table(name = "niveaux_scolaires")

public class NiveauScolaire implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDniveau;

  private String abrege;

  @Lob
  private String nom;

  private int ordre;

  public NiveauScolaire() {
  }

  public int getIDniveau() {
    return this.IDniveau;
  }

  public void setIDniveau(int IDniveau) {
    this.IDniveau = IDniveau;
  }

  public String getAbrege() {
    return this.abrege;
  }

  public void setAbrege(String abrege) {
    this.abrege = abrege;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public int getOrdre() {
    return this.ordre;
  }

  public void setOrdre(int ordre) {
    this.ordre = ordre;
  }

}