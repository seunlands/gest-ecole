package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the modeles_plannings database table.
 * 
 */
@Entity
@Table(name = "modeles_plannings")

public class ModelePlanning implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDmodele;

  @Lob
  private String donnees;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @Lob
  private String nom;

  public ModelePlanning() {
  }

  public int getIDmodele() {
    return this.IDmodele;
  }

  public void setIDmodele(int IDmodele) {
    this.IDmodele = IDmodele;
  }

  public String getDonnees() {
    return this.donnees;
  }

  public void setDonnees(String donnees) {
    this.donnees = donnees;
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