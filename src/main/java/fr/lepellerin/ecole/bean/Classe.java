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
 * The persistent class for the classes database table.
 * 
 */
@Entity
@Table(name = "classes")

public class Classe implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDclasse;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @ManyToOne
  @JoinColumn(name = "IDecole")
  private Ecole ecole;

  @Lob
  private String niveaux;

  @Lob
  private String nom;

  public Classe() {
  }

  public int getIDclasse() {
    return this.IDclasse;
  }

  public void setIDclasse(int IDclasse) {
    this.IDclasse = IDclasse;
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

  public Ecole getEcole() {
    return ecole;
  }

  public void setEcole(Ecole ecole) {
    this.ecole = ecole;
  }

  public String getNiveaux() {
    return this.niveaux;
  }

  public void setNiveaux(String niveaux) {
    this.niveaux = niveaux;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}