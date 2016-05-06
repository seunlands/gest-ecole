package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the parametres database table.
 * 
 */
@Entity
@Table(name = "parametres")

public class Parametre implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDparametre;

  private String categorie;

  private String nom;

  @Lob
  private String parametre;

  public Parametre() {
  }

  public int getIDparametre() {
    return this.IDparametre;
  }

  public void setIDparametre(int IDparametre) {
    this.IDparametre = IDparametre;
  }

  public String getCategorie() {
    return this.categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getParametre() {
    return this.parametre;
  }

  public void setParametre(String parametre) {
    this.parametre = parametre;
  }

}