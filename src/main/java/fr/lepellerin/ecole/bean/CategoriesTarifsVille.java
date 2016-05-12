package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the categories_tarifs_villes database table.
 * 
 */
@Entity
@Table(name = "categories_tarifs_villes")

public class CategoriesTarifsVille implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDville;

  private String cp;

  @ManyToOne
  @JoinColumn(name = "IDcategorie_tarif")
  private CategoriesTarif categorieTarif;

  private String nom;

  public CategoriesTarifsVille() {
  }

  public int getIDville() {
    return this.IDville;
  }

  public void setIDville(int IDville) {
    this.IDville = IDville;
  }

  public String getCp() {
    return this.cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public CategoriesTarif getCategorieTarif() {
    return categorieTarif;
  }

  public void setCategorieTarif(CategoriesTarif categorieTarif) {
    this.categorieTarif = categorieTarif;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}