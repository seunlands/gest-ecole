package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the compta_tiers database table.
 * 
 */
@Entity
@Table(name = "compta_tiers")

public class ComptaTier implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDtiers;

  private int IDcode_comptable;

  @Lob
  private String nom;

  @Lob
  private String observations;

  public ComptaTier() {
  }

  public int getIDtiers() {
    return this.IDtiers;
  }

  public void setIDtiers(int IDtiers) {
    this.IDtiers = IDtiers;
  }

  public int getIDcode_comptable() {
    return this.IDcode_comptable;
  }

  public void setIDcode_comptable(int IDcode_comptable) {
    this.IDcode_comptable = IDcode_comptable;
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