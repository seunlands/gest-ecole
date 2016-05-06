package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the categories_travail database table.
 * 
 */
@Entity
@Table(name = "categories_travail")

public class CategoriesTravail implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcategorie;

  private String nom;

  public CategoriesTravail() {
  }

  public int getIDcategorie() {
    return this.IDcategorie;
  }

  public void setIDcategorie(int IDcategorie) {
    this.IDcategorie = IDcategorie;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}