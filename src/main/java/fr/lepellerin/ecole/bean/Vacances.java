package fr.lepellerin.ecole.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the vacances database table.
 * 
 */
@Entity
@Table(name = "vacances")

public class Vacances implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDvacance;

  private int annee;

  @Column(name = "date_debut")
  @Temporal(TemporalType.DATE)
  private Date dateDebut;

  @Column(name = "date_fin")
  @Temporal(TemporalType.DATE)
  private Date dateFin;

  private String nom;

  public Vacances() {
  }

  public int getIDvacance() {
    return this.IDvacance;
  }

  public void setIDvacance(int IDvacance) {
    this.IDvacance = IDvacance;
  }

  public int getAnnee() {
    return this.annee;
  }

  public void setAnnee(int annee) {
    this.annee = annee;
  }

  public Date getDateDebut() {
    return this.dateDebut;
  }

  public void setDateDebut(Date dateDebut) {
    this.dateDebut = dateDebut;
  }

  public Date getDateFin() {
    return this.dateFin;
  }

  public void setDateFin(Date dateFin) {
    this.dateFin = dateFin;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}