package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the jours_feries database table.
 * 
 */
@Entity
@Table(name = "jours_feries")

public class JourFerie implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDferie;

  private int annee;

  private int jour;

  private int mois;

  private String nom;

  private String type;

  public JourFerie() {
  }

  public int getIDferie() {
    return this.IDferie;
  }

  public void setIDferie(int IDferie) {
    this.IDferie = IDferie;
  }

  public int getAnnee() {
    return this.annee;
  }

  public void setAnnee(int annee) {
    this.annee = annee;
  }

  public int getJour() {
    return this.jour;
  }

  public void setJour(int jour) {
    this.jour = jour;
  }

  public int getMois() {
    return this.mois;
  }

  public void setMois(int mois) {
    this.mois = mois;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}