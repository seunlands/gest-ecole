package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the noms_tarifs database table.
 * 
 */
@Entity
@Table(name = "noms_tarifs")

public class NomTarif implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDnom_tarif;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDcategorie_tarif")
  private CategoriesTarif categorieTarif;

  private String nom;

  public NomTarif() {
  }

  public int getIDnom_tarif() {
    return this.IDnom_tarif;
  }

  public void setIDnom_tarif(int IDnom_tarif) {
    this.IDnom_tarif = IDnom_tarif;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
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