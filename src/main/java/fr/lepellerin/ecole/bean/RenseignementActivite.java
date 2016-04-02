package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the renseignements_activites database table.
 * 
 */
@Entity
@Table(name = "renseignements_activites")

public class RenseignementActivite implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDrenseignement;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  private int IDtype_renseignement;

  public RenseignementActivite() {
  }

  public int getIDrenseignement() {
    return this.IDrenseignement;
  }

  public void setIDrenseignement(int IDrenseignement) {
    this.IDrenseignement = IDrenseignement;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public int getIDtype_renseignement() {
    return this.IDtype_renseignement;
  }

  public void setIDtype_renseignement(int IDtype_renseignement) {
    this.IDtype_renseignement = IDtype_renseignement;
  }

}