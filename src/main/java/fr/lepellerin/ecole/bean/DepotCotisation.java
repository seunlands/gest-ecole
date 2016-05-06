package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the depots_cotisations database table.
 * 
 */
@Entity
@Table(name = "depots_cotisations")

public class DepotCotisation implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDdepot_cotisation;

  private String date;

  private String nom;

  @Lob
  private String observations;

  private int verrouillage;

  public DepotCotisation() {
  }

  public int getIDdepot_cotisation() {
    return this.IDdepot_cotisation;
  }

  public void setIDdepot_cotisation(int IDdepot_cotisation) {
    this.IDdepot_cotisation = IDdepot_cotisation;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
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

  public int getVerrouillage() {
    return this.verrouillage;
  }

  public void setVerrouillage(int verrouillage) {
    this.verrouillage = verrouillage;
  }

}