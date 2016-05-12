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
 * The persistent class for the compta_releves database table.
 * 
 */
@Entity
@Table(name = "compta_releves")

public class ComptaReleve implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDreleve;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @ManyToOne
  @JoinColumn(name = "IDcompte_bancaire")
  private CompteBancaire compteBancaire;

  @Lob
  private String nom;

  public ComptaReleve() {
  }

  public int getIDreleve() {
    return this.IDreleve;
  }

  public void setIDreleve(int IDreleve) {
    this.IDreleve = IDreleve;
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

  public CompteBancaire getCompteBancaire() {
    return compteBancaire;
  }

  public void setCompteBancaire(CompteBancaire compteBancaire) {
    this.compteBancaire = compteBancaire;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}