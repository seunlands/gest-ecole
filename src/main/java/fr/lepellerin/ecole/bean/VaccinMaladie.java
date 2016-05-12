package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the vaccins_maladies database table.
 * 
 */
@Entity
@Table(name = "vaccins_maladies")

public class VaccinMaladie implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDvaccins_maladies;

  @ManyToOne
  @JoinColumn(name = "IDtype_maladie")
  private TypeMaladie typeMaladie;

  @ManyToOne
  @JoinColumn(name = "IDtype_vaccin")
  private TypeVaccin typeVaccin;

  public VaccinMaladie() {
  }

  public int getIDvaccins_maladies() {
    return this.IDvaccins_maladies;
  }

  public void setIDvaccins_maladies(int IDvaccins_maladies) {
    this.IDvaccins_maladies = IDvaccins_maladies;
  }

  public TypeMaladie getTypeMaladie() {
    return typeMaladie;
  }

  public void setTypeMaladie(TypeMaladie typeMaladie) {
    this.typeMaladie = typeMaladie;
  }

  public TypeVaccin getTypeVaccin() {
    return typeVaccin;
  }

  public void setTypeVaccin(TypeVaccin typeVaccin) {
    this.typeVaccin = typeVaccin;
  }

}