package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the compta_exercices database table.
 * 
 */
@Entity
@Table(name = "compta_exercices")

public class ComptaExercice implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDexercice;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  private int defaut;

  @Lob
  private String nom;

  public ComptaExercice() {
  }

  public int getIDexercice() {
    return this.IDexercice;
  }

  public void setIDexercice(int IDexercice) {
    this.IDexercice = IDexercice;
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

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(int defaut) {
    this.defaut = defaut;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}