package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the documents_modeles database table.
 * 
 */
@Entity
@Table(name = "documents_modeles")

public class DocumentModele implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDmodele;

  private String categorie;

  private int defaut;

  private int hauteur;

  private int IDfond;

  private int largeur;

  private String nom;

  @Lob
  private String observations;

  private int supprimable;

  public DocumentModele() {
  }

  public int getIDmodele() {
    return this.IDmodele;
  }

  public void setIDmodele(int IDmodele) {
    this.IDmodele = IDmodele;
  }

  public String getCategorie() {
    return this.categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(int defaut) {
    this.defaut = defaut;
  }

  public int getHauteur() {
    return this.hauteur;
  }

  public void setHauteur(int hauteur) {
    this.hauteur = hauteur;
  }

  public int getIDfond() {
    return this.IDfond;
  }

  public void setIDfond(int IDfond) {
    this.IDfond = IDfond;
  }

  public int getLargeur() {
    return this.largeur;
  }

  public void setLargeur(int largeur) {
    this.largeur = largeur;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

  public int getSupprimable() {
    return this.supprimable;
  }

  public void setSupprimable(int supprimable) {
    this.supprimable = supprimable;
  }

}