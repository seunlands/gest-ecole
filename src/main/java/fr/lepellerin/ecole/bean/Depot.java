package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the depots database table.
 * 
 */
@Entity
@Table(name = "depots")

public class Depot implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDdepot;

  @Column(name = "code_compta")
  private String codeCompta;

  private String date;

  private int IDcompte;

  private String nom;

  @Lob
  private String observations;

  private int verrouillage;

  public Depot() {
  }

  public int getIDdepot() {
    return this.IDdepot;
  }

  public void setIDdepot(int IDdepot) {
    this.IDdepot = IDdepot;
  }

  public String getCodeCompta() {
    return this.codeCompta;
  }

  public void setCodeCompta(String codeCompta) {
    this.codeCompta = codeCompta;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public int getIDcompte() {
    return this.IDcompte;
  }

  public void setIDcompte(int IDcompte) {
    this.IDcompte = IDcompte;
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