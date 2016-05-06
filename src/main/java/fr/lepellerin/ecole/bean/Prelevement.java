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
 * The persistent class for the prelevements database table.
 * 
 */
@Entity
@Table(name = "prelevements")

public class Prelevement implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDprelevement;

  @ManyToOne
  @JoinColumn(name = "IDfacture")
  private Facture facture;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  private int IDlot;

  @ManyToOne
  @JoinColumn(name = "IDmandat")
  private Mandat mandat;

  @Lob
  private String libelle;

  private double montant;

  @Column(name = "prelevement_banque")
  private int prelevementBanque;

  @Column(name = "prelevement_bic")
  private String prelevementBic;

  @Column(name = "prelevement_cle")
  private String prelevementCle;

  @Column(name = "prelevement_date_mandat")
  private String prelevementDateMandat;

  @Column(name = "prelevement_etab")
  private String prelevementEtab;

  @Column(name = "prelevement_guichet")
  private String prelevementGuichet;

  @Column(name = "prelevement_iban")
  private String prelevementIban;

  @Column(name = "prelevement_numero")
  private String prelevementNumero;

  @Lob
  @Column(name = "prelevement_reference_mandat")
  private String prelevementReferenceMandat;

  private String sequence;

  private String statut;

  @Lob
  private String titulaire;

  @Lob
  private String type;

  public Prelevement() {
  }

  public int getIDprelevement() {
    return this.IDprelevement;
  }

  public void setIDprelevement(int IDprelevement) {
    this.IDprelevement = IDprelevement;
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

  public int getIDlot() {
    return this.IDlot;
  }

  public void setIDlot(int IDlot) {
    this.IDlot = IDlot;
  }

  public Mandat getMandat() {
    return mandat;
  }

  public void setMandat(Mandat mandat) {
    this.mandat = mandat;
  }

  public String getLibelle() {
    return this.libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public double getMontant() {
    return this.montant;
  }

  public void setMontant(double montant) {
    this.montant = montant;
  }

  public int getPrelevementBanque() {
    return this.prelevementBanque;
  }

  public void setPrelevementBanque(int prelevementBanque) {
    this.prelevementBanque = prelevementBanque;
  }

  public String getPrelevementBic() {
    return this.prelevementBic;
  }

  public void setPrelevementBic(String prelevementBic) {
    this.prelevementBic = prelevementBic;
  }

  public String getPrelevementCle() {
    return this.prelevementCle;
  }

  public void setPrelevementCle(String prelevementCle) {
    this.prelevementCle = prelevementCle;
  }

  public String getPrelevementDateMandat() {
    return this.prelevementDateMandat;
  }

  public void setPrelevementDateMandat(String prelevementDateMandat) {
    this.prelevementDateMandat = prelevementDateMandat;
  }

  public String getPrelevementEtab() {
    return this.prelevementEtab;
  }

  public void setPrelevementEtab(String prelevementEtab) {
    this.prelevementEtab = prelevementEtab;
  }

  public String getPrelevementGuichet() {
    return this.prelevementGuichet;
  }

  public void setPrelevementGuichet(String prelevementGuichet) {
    this.prelevementGuichet = prelevementGuichet;
  }

  public String getPrelevementIban() {
    return this.prelevementIban;
  }

  public void setPrelevementIban(String prelevementIban) {
    this.prelevementIban = prelevementIban;
  }

  public String getPrelevementNumero() {
    return this.prelevementNumero;
  }

  public void setPrelevementNumero(String prelevementNumero) {
    this.prelevementNumero = prelevementNumero;
  }

  public String getPrelevementReferenceMandat() {
    return this.prelevementReferenceMandat;
  }

  public void setPrelevementReferenceMandat(String prelevementReferenceMandat) {
    this.prelevementReferenceMandat = prelevementReferenceMandat;
  }

  public String getSequence() {
    return this.sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  public String getStatut() {
    return this.statut;
  }

  public void setStatut(String statut) {
    this.statut = statut;
  }

  public String getTitulaire() {
    return this.titulaire;
  }

  public void setTitulaire(String titulaire) {
    this.titulaire = titulaire;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}