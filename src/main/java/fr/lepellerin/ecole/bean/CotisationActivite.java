package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the cotisations_activites database table.
 * 
 */
@Entity
@Table(name = "cotisations_activites")

public class CotisationActivite implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcotisation_activite;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDtype_cotisation")
  private TypeCotisation typeCotisation;

  public CotisationActivite() {
  }

  public int getIDcotisation_activite() {
    return this.IDcotisation_activite;
  }

  public void setIDcotisation_activite(int IDcotisation_activite) {
    this.IDcotisation_activite = IDcotisation_activite;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public TypeCotisation getTypeCotisation() {
    return typeCotisation;
  }

  public void setTypeCotisation(TypeCotisation typeCotisation) {
    this.typeCotisation = typeCotisation;
  }

}