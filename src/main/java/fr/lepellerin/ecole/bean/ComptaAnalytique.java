package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the compta_analytiques database table.
 * 
 */
@Entity
@Table(name = "compta_analytiques")

public class ComptaAnalytique implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDanalytique;

  private String abrege;

  private int defaut;

  @Lob
  private String nom;

  public ComptaAnalytique() {
  }

  public int getIDanalytique() {
    return this.IDanalytique;
  }

  public void setIDanalytique(int IDanalytique) {
    this.IDanalytique = IDanalytique;
  }

  public String getAbrege() {
    return this.abrege;
  }

  public void setAbrege(String abrege) {
    this.abrege = abrege;
  }

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(int defaut) {
    this.defaut = defaut;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}