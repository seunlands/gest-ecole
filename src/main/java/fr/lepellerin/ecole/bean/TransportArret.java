package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the transports_arrets database table.
 * 
 */
@Entity
@Table(name = "transports_arrets")

public class TransportArret implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDarret;

  private int IDligne;

  @Lob
  private String nom;

  private int ordre;

  public TransportArret() {
  }

  public int getIDarret() {
    return this.IDarret;
  }

  public void setIDarret(int IDarret) {
    this.IDarret = IDarret;
  }

  public int getIDligne() {
    return this.IDligne;
  }

  public void setIDligne(int IDligne) {
    this.IDligne = IDligne;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public int getOrdre() {
    return this.ordre;
  }

  public void setOrdre(int ordre) {
    this.ordre = ordre;
  }

}