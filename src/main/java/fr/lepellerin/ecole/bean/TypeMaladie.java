package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the types_maladies database table.
 * 
 */
@Entity
@Table(name = "types_maladies")

public class TypeMaladie implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDtype_maladie;

  private String nom;

  @Column(name = "vaccin_obligatoire")
  private int vaccinObligatoire;

  public TypeMaladie() {
  }

  public int getIDtype_maladie() {
    return this.IDtype_maladie;
  }

  public void setIDtype_maladie(int IDtype_maladie) {
    this.IDtype_maladie = IDtype_maladie;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public int getVaccinObligatoire() {
    return this.vaccinObligatoire;
  }

  public void setVaccinObligatoire(int vaccinObligatoire) {
    this.vaccinObligatoire = vaccinObligatoire;
  }

}