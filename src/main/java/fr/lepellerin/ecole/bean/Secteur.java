package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the secteurs database table.
 * 
 */
@Entity
@Table(name = "secteurs")

public class Secteur implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDsecteur;

  private String nom;

  public Secteur() {
  }

  public int getIDsecteur() {
    return this.IDsecteur;
  }

  public void setIDsecteur(int IDsecteur) {
    this.IDsecteur = IDsecteur;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}