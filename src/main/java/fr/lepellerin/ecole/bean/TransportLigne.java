package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the transports_lignes database table.
 * 
 */
@Entity
@Table(name = "transports_lignes")

public class TransportLigne implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDligne;

  private String categorie;

  @Lob
  private String nom;

  public TransportLigne() {
  }

  public int getIDligne() {
    return this.IDligne;
  }

  public void setIDligne(int IDligne) {
    this.IDligne = IDligne;
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

}