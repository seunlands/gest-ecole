package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the types_sieste database table.
 * 
 */
@Entity
@Table(name = "types_sieste")

public class TypeSieste implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDtype_sieste;

  private String nom;

  public TypeSieste() {
  }

  public int getIDtype_sieste() {
    return this.IDtype_sieste;
  }

  public void setIDtype_sieste(int IDtype_sieste) {
    this.IDtype_sieste = IDtype_sieste;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}