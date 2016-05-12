package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the groupes database table.
 * 
 */
@Entity
@Table(name = "groupes")

public class Groupe implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDgroupe;

  private String abrege;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  private String nom;

  private int ordre;

  public Groupe() {
  }

  public int getIDgroupe() {
    return this.IDgroupe;
  }

  public void setIDgroupe(int IDgroupe) {
    this.IDgroupe = IDgroupe;
  }

  public String getAbrege() {
    return this.abrege;
  }

  public void setAbrege(String abrege) {
    this.abrege = abrege;
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

  public int getOrdre() {
    return this.ordre;
  }

  public void setOrdre(int ordre) {
    this.ordre = ordre;
  }

}