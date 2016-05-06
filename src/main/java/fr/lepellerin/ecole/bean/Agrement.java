package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the agrements database table.
 * 
 */
@Entity
@Table(name = "agrements")

public class Agrement implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDagrement;

  private String agrement;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  public Agrement() {
  }

  public int getIDagrement() {
    return this.IDagrement;
  }

  public void setIDagrement(int IDagrement) {
    this.IDagrement = IDagrement;
  }

  public String getAgrement() {
    return this.agrement;
  }

  public void setAgrement(String agrement) {
    this.agrement = agrement;
  }

  public String getDateDebut() {
    return this.dateDebut;
  }

  public void setDateDebut(String dateDebut) {
    this.dateDebut = dateDebut;
  }

  public String getDateFin() {
    return this.dateFin;
  }

  public void setDateFin(String dateFin) {
    this.dateFin = dateFin;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

}