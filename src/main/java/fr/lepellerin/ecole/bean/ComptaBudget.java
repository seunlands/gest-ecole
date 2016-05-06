package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the compta_budgets database table.
 * 
 */
@Entity
@Table(name = "compta_budgets")

public class ComptaBudget implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDbudget;

  @Lob
  private String analytiques;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @ManyToOne
  @JoinColumn(name = "IDexercice")
  private ComptaExercice exercice;

  @Lob
  private String nom;

  private String observations;

  public ComptaBudget() {
  }

  public int getIDbudget() {
    return this.IDbudget;
  }

  public void setIDbudget(int IDbudget) {
    this.IDbudget = IDbudget;
  }

  public String getAnalytiques() {
    return this.analytiques;
  }

  public void setAnalytiques(String analytiques) {
    this.analytiques = analytiques;
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

  public ComptaExercice getExercice() {
    return exercice;
  }

  public void setExercice(ComptaExercice exercice) {
    this.exercice = exercice;
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