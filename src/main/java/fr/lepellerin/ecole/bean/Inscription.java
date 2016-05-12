package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the inscriptions database table.
 * 
 */
@Entity
@Table(name = "inscriptions")

public class Inscription implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDinscription;

  @Column(name = "date_inscription")
  private String dateInscription;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDcategorie_tarif")
  private CategoriesTarif categorie_tarif;

  @ManyToOne
  @JoinColumn(name = "IDcompte_payeur")
  private ComptePayeur compte_payeur;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDgroupe")
  private Groupe groupe;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  private int parti;

  public Inscription() {
  }

  public int getIDinscription() {
    return this.IDinscription;
  }

  public void setIDinscription(int IDinscription) {
    this.IDinscription = IDinscription;
  }

  public String getDateInscription() {
    return this.dateInscription;
  }

  public void setDateInscription(String dateInscription) {
    this.dateInscription = dateInscription;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public CategoriesTarif getCategorie_tarif() {
    return categorie_tarif;
  }

  public void setCategorie_tarif(CategoriesTarif categorie_tarif) {
    this.categorie_tarif = categorie_tarif;
  }

  public ComptePayeur getCompte_payeur() {
    return compte_payeur;
  }

  public void setCompte_payeur(ComptePayeur compte_payeur) {
    this.compte_payeur = compte_payeur;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(Famille famille) {
    this.famille = famille;
  }

  public Groupe getGroupe() {
    return groupe;
  }

  public void setGroupe(Groupe groupe) {
    this.groupe = groupe;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

  public int getParti() {
    return this.parti;
  }

  public void setParti(int parti) {
    this.parti = parti;
  }

}