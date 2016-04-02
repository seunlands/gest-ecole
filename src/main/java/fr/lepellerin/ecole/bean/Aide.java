package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the aides database table.
 * 
 */
@Entity
@Table(name = "aides")

public class Aide implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDaide;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDcaisse")
  private Caisse caisse;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @Column(name = "montant_max")
  private double montantMax;

  @Column(name = "nbre_dates_max")
  private int nbreDatesMax;

  private String nom;

  public Aide() {
  }

  public int getIDaide() {
    return this.IDaide;
  }

  public void setIDaide(int IDaide) {
    this.IDaide = IDaide;
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

  public Caisse getCaisse() {
    return caisse;
  }

  public void setCaisse(Caisse caisse) {
    this.caisse = caisse;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(Famille famille) {
    this.famille = famille;
  }

  public double getMontantMax() {
    return this.montantMax;
  }

  public void setMontantMax(double montantMax) {
    this.montantMax = montantMax;
  }

  public int getNbreDatesMax() {
    return this.nbreDatesMax;
  }

  public void setNbreDatesMax(int nbreDatesMax) {
    this.nbreDatesMax = nbreDatesMax;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}