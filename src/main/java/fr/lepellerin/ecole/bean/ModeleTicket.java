package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the modeles_tickets database table.
 * 
 */
@Entity
@Table(name = "modeles_tickets")

public class ModeleTicket implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDmodele;

  @Lob
  private String categorie;

  private int defaut;

  @Lob
  private String description;

  @Lob
  private String imprimante;

  private int interligne;

  @Lob
  private String lignes;

  @Lob
  private String nom;

  private int taille;

  public ModeleTicket() {
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

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getImprimante() {
    return this.imprimante;
  }

  public void setImprimante(String imprimante) {
    this.imprimante = imprimante;
  }

  public int getInterligne() {
    return this.interligne;
  }

  public void setInterligne(int interligne) {
    this.interligne = interligne;
  }

  public String getLignes() {
    return this.lignes;
  }

  public void setLignes(String lignes) {
    this.lignes = lignes;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public int getTaille() {
    return this.taille;
  }

  public void setTaille(int taille) {
    this.taille = taille;
  }

}