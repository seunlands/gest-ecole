package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the types_groupes_activites database table.
 * 
 */
@Entity
@Table(name = "types_groupes_activites")

public class TypeGroupeActivite implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDtype_groupe_activite;

  private String nom;

  @Lob
  private String observations;

  public TypeGroupeActivite() {
  }

  public int getIDtype_groupe_activite() {
    return this.IDtype_groupe_activite;
  }

  public void setIDtype_groupe_activite(int IDtype_groupe_activite) {
    this.IDtype_groupe_activite = IDtype_groupe_activite;
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