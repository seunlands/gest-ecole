package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the historique database table.
 * 
 */
@Entity

public class Historique implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDaction;

  @Lob
  private String action;

  private String date;

  private String heure;

  private int IDcategorie;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  @ManyToOne
  @JoinColumn(name = "IDutilisateur")
  private Utilisateur utilisateur;

  public Historique() {
  }

  public int getIDaction() {
    return this.IDaction;
  }

  public void setIDaction(int IDaction) {
    this.IDaction = IDaction;
  }

  public String getAction() {
    return this.action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getHeure() {
    return this.heure;
  }

  public void setHeure(String heure) {
    this.heure = heure;
  }

  public int getIDcategorie() {
    return this.IDcategorie;
  }

  public void setIDcategorie(int IDcategorie) {
    this.IDcategorie = IDcategorie;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(Famille famille) {
    this.famille = famille;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

  public Utilisateur getUtilisateur() {
    return utilisateur;
  }

  public void setUtilisateur(Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
  }

}