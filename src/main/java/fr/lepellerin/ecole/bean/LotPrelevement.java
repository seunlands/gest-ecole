package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the lots_prelevements database table.
 * 
 */
@Entity
@Table(name = "lots_prelevements")

public class LotPrelevement implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDlot;

  private String date;

  private int IDcompte;

  private int IDmode;

  private String nom;

  @Lob
  private String observations;

  @Column(name = "reglement_auto")
  private int reglementAuto;

  private String type;

  private int verrouillage;

  public LotPrelevement() {
  }

  public int getIDlot() {
    return this.IDlot;
  }

  public void setIDlot(int IDlot) {
    this.IDlot = IDlot;
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

  public int getIDmode() {
    return this.IDmode;
  }

  public void setIDmode(int IDmode) {
    this.IDmode = IDmode;
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

  public int getReglementAuto() {
    return this.reglementAuto;
  }

  public void setReglementAuto(int reglementAuto) {
    this.reglementAuto = reglementAuto;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getVerrouillage() {
    return this.verrouillage;
  }

  public void setVerrouillage(int verrouillage) {
    this.verrouillage = verrouillage;
  }

}