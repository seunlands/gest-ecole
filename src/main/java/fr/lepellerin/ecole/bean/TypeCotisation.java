package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the types_cotisations database table.
 * 
 */
@Entity
@Table(name = "types_cotisations")

public class TypeCotisation implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDtype_cotisation;

  private int carte;

  @Lob
  @Column(name = "code_comptable")
  private String codeComptable;

  private int defaut;

  private String nom;

  private String type;

  public TypeCotisation() {
  }

  public int getIDtype_cotisation() {
    return this.IDtype_cotisation;
  }

  public void setIDtype_cotisation(int IDtype_cotisation) {
    this.IDtype_cotisation = IDtype_cotisation;
  }

  public int getCarte() {
    return this.carte;
  }

  public void setCarte(int carte) {
    this.carte = carte;
  }

  public String getCodeComptable() {
    return this.codeComptable;
  }

  public void setCodeComptable(String codeComptable) {
    this.codeComptable = codeComptable;
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

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}