package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the types_vaccins database table.
 * 
 */
@Entity
@Table(name = "types_vaccins")

public class TypeVaccin implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDtype_vaccin;

  @Column(name = "duree_validite")
  private String dureeValidite;

  private String nom;

  public TypeVaccin() {
  }

  public int getIDtype_vaccin() {
    return this.IDtype_vaccin;
  }

  public void setIDtype_vaccin(int IDtype_vaccin) {
    this.IDtype_vaccin = IDtype_vaccin;
  }

  public String getDureeValidite() {
    return this.dureeValidite;
  }

  public void setDureeValidite(String dureeValidite) {
    this.dureeValidite = dureeValidite;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}