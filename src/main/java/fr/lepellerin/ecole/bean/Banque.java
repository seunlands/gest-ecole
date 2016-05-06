package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the banques database table.
 * 
 */
@Entity
@Table(name = "banques")
public class Banque implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDbanque;

  @Column(name = "cp_resid")
  private String cpResid;

  private String nom;

  @Column(name = "rue_resid")
  private String rueResid;

  @Column(name = "ville_resid")
  private String villeResid;

  public Banque() {
  }

  public int getIDbanque() {
    return this.IDbanque;
  }

  public void setIDbanque(int IDbanque) {
    this.IDbanque = IDbanque;
  }

  public String getCpResid() {
    return this.cpResid;
  }

  public void setCpResid(String cpResid) {
    this.cpResid = cpResid;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getRueResid() {
    return this.rueResid;
  }

  public void setRueResid(String rueResid) {
    this.rueResid = rueResid;
  }

  public String getVilleResid() {
    return this.villeResid;
  }

  public void setVilleResid(String villeResid) {
    this.villeResid = villeResid;
  }

}