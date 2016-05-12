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
 * The persistent class for the factures database table.
 * 
 */
@Entity
@Table(name = "factures")

public class Facture implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDfacture;

  @Lob
  private String activites;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_echeance")
  private String dateEcheance;

  @Column(name = "date_edition")
  private String dateEdition;

  @Column(name = "date_fin")
  private String dateFin;

  private String etat;

  @ManyToOne
  @JoinColumn(name = "IDcompte_payeur")
  private ComptePayeur comptePayeur;

  @ManyToOne
  @JoinColumn(name = "IDlot")
  private LotFacture lot;

  @ManyToOne
  @JoinColumn(name = "IDutilisateur")
  private Utilisateur utilisateur;

  @Lob
  private String individus;

  private int numero;

  @Lob
  private String prestations;

  private double regle;

  private double solde;

  private double total;

  public Facture() {
  }

  public int getIDfacture() {
    return this.IDfacture;
  }

  public void setIDfacture(int IDfacture) {
    this.IDfacture = IDfacture;
  }

  public String getActivites() {
    return this.activites;
  }

  public void setActivites(String activites) {
    this.activites = activites;
  }

  public String getDateDebut() {
    return this.dateDebut;
  }

  public void setDateDebut(String dateDebut) {
    this.dateDebut = dateDebut;
  }

  public String getDateEcheance() {
    return this.dateEcheance;
  }

  public void setDateEcheance(String dateEcheance) {
    this.dateEcheance = dateEcheance;
  }

  public String getDateEdition() {
    return this.dateEdition;
  }

  public void setDateEdition(String dateEdition) {
    this.dateEdition = dateEdition;
  }

  public String getDateFin() {
    return this.dateFin;
  }

  public void setDateFin(String dateFin) {
    this.dateFin = dateFin;
  }

  public String getEtat() {
    return this.etat;
  }

  public void setEtat(String etat) {
    this.etat = etat;
  }

  public ComptePayeur getComptePayeur() {
    return comptePayeur;
  }

  public void setComptePayeur(ComptePayeur comptePayeur) {
    this.comptePayeur = comptePayeur;
  }

  public LotFacture getLot() {
    return lot;
  }

  public void setLot(LotFacture lot) {
    this.lot = lot;
  }

  public Utilisateur getUtilisateur() {
    return utilisateur;
  }

  public void setUtilisateur(Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
  }

  public String getIndividus() {
    return this.individus;
  }

  public void setIndividus(String individus) {
    this.individus = individus;
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

  public double getRegle() {
    return this.regle;
  }

  public void setRegle(double regle) {
    this.regle = regle;
  }

  public double getSolde() {
    return this.solde;
  }

  public void setSolde(double solde) {
    this.solde = solde;
  }

  public double getTotal() {
    return this.total;
  }

  public void setTotal(double total) {
    this.total = total;
  }

}