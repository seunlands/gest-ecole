package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the listes_diffusion database table.
 * 
 */
@Entity
@Table(name = "listes_diffusion")

public class ListeDiffusion implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDliste;

  private String nom;

  public ListeDiffusion() {
  }

  public int getIDliste() {
    return this.IDliste;
  }

  public void setIDliste(int IDliste) {
    this.IDliste = IDliste;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}