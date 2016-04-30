package fr.lepellerin.ecole.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the prestations database table.
 * 
 */
@Entity
@Table(name = "prestations")

public class Prestation implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue
  @Column(name = "IDprestation")
  private int id;

  private String categorie;

  @Column(name = "code_compta")
  private String codeCompta;

  @Temporal(TemporalType.DATE)
  private Date date;

  private Integer forfait;

  @Column(name = "forfait_date_debut")
  private String forfaitDateDebut;

  @Column(name = "forfait_date_fin")
  private String forfaitDateFin;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDcategorie_tarif")
  private CategoriesTarif categorieTarif;

  @ManyToOne
  @JoinColumn(name = "IDcompte_payeur")
  private ComptePayeur comptePayeur;

  @ManyToOne
  @JoinColumn(name = "IDcontrat")
  private Contrat contrat;

  @ManyToOne
  @JoinColumn(name = "IDfacture")
  private Facture facture;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  @ManyToOne
  @JoinColumn(name = "IDtarif")
  private Tarif tarif;

  private String label;

  private double montant;

  @Column(name = "montant_initial")
  private double montantInitial;

  @Column(name = "reglement_frais")
  private Integer reglementFrais;

  @Column(name = "temps_facture")
  private String tempsFacture;

  private double tva;

  public Prestation() {
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCategorie() {
    return this.categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }

  public String getCodeCompta() {
    return this.codeCompta;
  }

  public void setCodeCompta(String codeCompta) {
    this.codeCompta = codeCompta;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Integer getForfait() {
    return this.forfait;
  }

  public void setForfait(Integer forfait) {
    this.forfait = forfait;
  }

  public String getForfaitDateDebut() {
    return this.forfaitDateDebut;
  }

  public void setForfaitDateDebut(String forfaitDateDebut) {
    this.forfaitDateDebut = forfaitDateDebut;
  }

  public String getForfaitDateFin() {
    return this.forfaitDateFin;
  }

  public void setForfaitDateFin(String forfaitDateFin) {
    this.forfaitDateFin = forfaitDateFin;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public CategoriesTarif getCategorieTarif() {
    return categorieTarif;
  }

  public void setCategorieTarif(CategoriesTarif categorieTarif) {
    this.categorieTarif = categorieTarif;
  }

  public ComptePayeur getComptePayeur() {
    return comptePayeur;
  }

  public void setComptePayeur(ComptePayeur comptePayeur) {
    this.comptePayeur = comptePayeur;
  }

  public Contrat getContrat() {
    return contrat;
  }

  public void setContrat(Contrat contrat) {
    this.contrat = contrat;
  }

  public Facture getFacture() {
    return facture;
  }

  public void setFacture(Facture facture) {
    this.facture = facture;
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

  public Tarif getTarif() {
    return tarif;
  }

  public void setTarif(Tarif tarif) {
    this.tarif = tarif;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public double getMontant() {
    return this.montant;
  }

  public void setMontant(double montant) {
    this.montant = montant;
  }

  public double getMontantInitial() {
    return this.montantInitial;
  }

  public void setMontantInitial(double montantInitial) {
    this.montantInitial = montantInitial;
  }

  public Integer getReglementFrais() {
    return this.reglementFrais;
  }

  public void setReglementFrais(Integer reglementFrais) {
    this.reglementFrais = reglementFrais;
  }

  public String getTempsFacture() {
    return this.tempsFacture;
  }

  public void setTempsFacture(String tempsFacture) {
    this.tempsFacture = tempsFacture;
  }

  public double getTva() {
    return this.tva;
  }

  public void setTva(double tva) {
    this.tva = tva;
  }

}