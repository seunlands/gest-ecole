package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the scolarite database table.
 * 
 */
@Entity

public class Scolarite implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDscolarite;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @ManyToOne
  @JoinColumn(name = "IDclasse")
  private Classe classe;

  @ManyToOne
  @JoinColumn(name = "IDecole")
  private Ecole ecole;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  @ManyToOne
  @JoinColumn(name = "IDniveau")
  private NiveauScolaire niveau;

  public Scolarite() {
  }

  public int getIDscolarite() {
    return this.IDscolarite;
  }

  public void setIDscolarite(int IDscolarite) {
    this.IDscolarite = IDscolarite;
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

  public Classe getClasse() {
    return classe;
  }

  public void setClasse(Classe classe) {
    this.classe = classe;
  }

  public Ecole getEcole() {
    return ecole;
  }

  public void setEcole(Ecole ecole) {
    this.ecole = ecole;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

  public NiveauScolaire getNiveau() {
    return niveau;
  }

  public void setNiveau(NiveauScolaire niveau) {
    this.niveau = niveau;
  }

}