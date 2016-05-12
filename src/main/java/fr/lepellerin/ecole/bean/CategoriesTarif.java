package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the categories_tarifs database table.
 * 
 */
@Entity
@Table(name = "categories_tarifs")
public class CategoriesTarif implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcategorie_tarif;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  private String nom;

  public CategoriesTarif() {
  }

  public int getIDcategorie_tarif() {
    return this.IDcategorie_tarif;
  }

  public void setIDcategorie_tarif(int IDcategorie_tarif) {
    this.IDcategorie_tarif = IDcategorie_tarif;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}