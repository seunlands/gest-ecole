package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the modeles_droits database table.
 * 
 */
@Entity
@Table(name = "modeles_droits")

public class ModeleDroit implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDmodele;

  private int defaut;

  @Lob
  private String nom;

  @Lob
  private String observations;

  public ModeleDroit() {
  }

  public int getIDmodele() {
    return this.IDmodele;
  }

  public void setIDmodele(int IDmodele) {
    this.IDmodele = IDmodele;
  }

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(int defaut) {
    this.defaut = defaut;
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

}