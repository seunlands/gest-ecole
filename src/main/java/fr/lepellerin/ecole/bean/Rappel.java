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
 * The persistent class for the rappels database table.
 * 
 */
@Entity
@Table(name = "rappels")

public class Rappel implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDrappel;

  @Lob
  private String activites;

  @Column(name = "date_edition")
  private String dateEdition;

  @Column(name = "date_max")
  private String dateMax;

  @Column(name = "date_min")
  private String dateMin;

  @Column(name = "date_reference")
  private String dateReference;

  @ManyToOne
  @JoinColumn(name = "IDcompte_payeur")
  private ComptePayeur comptePayeur;

  @ManyToOne
  @JoinColumn(name = "IDlot")
  private LotRappel lot;

  @ManyToOne
  @JoinColumn(name = "IDtexte")
  private TexteRappel texte;

  @ManyToOne
  @JoinColumn(name = "IDutilisateur")
  private Utilisateur utilisateur;

  private int numero;

  @Lob
  private String prestations;

  private double solde;

  public Rappel() {
  }

  public int getIDrappel() {
    return this.IDrappel;
  }

  public void setIDrappel(int IDrappel) {
    this.IDrappel = IDrappel;
  }

  public String getActivites() {
    return this.activites;
  }

  public void setActivites(String activites) {
    this.activites = activites;
  }

  public String getDateEdition() {
    return this.dateEdition;
  }

  public void setDateEdition(String dateEdition) {
    this.dateEdition = dateEdition;
  }

  public String getDateMax() {
    return this.dateMax;
  }

  public void setDateMax(String dateMax) {
    this.dateMax = dateMax;
  }

  public String getDateMin() {
    return this.dateMin;
  }

  public void setDateMin(String dateMin) {
    this.dateMin = dateMin;
  }

  public String getDateReference() {
    return this.dateReference;
  }

  public void setDateReference(String dateReference) {
    this.dateReference = dateReference;
  }

  public ComptePayeur getComptePayeur() {
    return comptePayeur;
  }

  public void setComptePayeur(ComptePayeur comptePayeur) {
    this.comptePayeur = comptePayeur;
  }

  public LotRappel getLot() {
    return lot;
  }

  public void setLot(LotRappel lot) {
    this.lot = lot;
  }

  public TexteRappel getTexte() {
    return texte;
  }

  public void setTexte(TexteRappel texte) {
    this.texte = texte;
  }

  public Utilisateur getUtilisateur() {
    return utilisateur;
  }

  public void setUtilisateur(Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public String getPrestations() {
    return this.prestations;
  }

  public void setPrestations(String prestations) {
    this.prestations = prestations;
  }

  public double getSolde() {
    return this.solde;
  }

  public void setSolde(double solde) {
    this.solde = solde;
  }

}