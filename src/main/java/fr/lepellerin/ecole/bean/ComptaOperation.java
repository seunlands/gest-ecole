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
 * The persistent class for the compta_operations database table.
 * 
 */
@Entity
@Table(name = "compta_operations")

public class ComptaOperation implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDoperation;

  private String date;

  @ManyToOne
  @JoinColumn(name = "IDcompte_bancaire")
  private CompteBancaire compteBancaire;

  @ManyToOne
  @JoinColumn(name = "IDmode")
  private ModeReglement mode;

  @ManyToOne
  @JoinColumn(name = "IDreleve")
  private ComptaReleve releve;

  @ManyToOne
  @JoinColumn(name = "IDtiers")
  private ComptaTier tiers;

  @ManyToOne
  @JoinColumn(name = "IDvirement")
  private ComptaVirement virement;

  @Lob
  private String libelle;

  private double montant;

  @Column(name = "num_piece")
  private String numPiece;

  @Lob
  private String observations;

  @Column(name = "ref_piece")
  private String refPiece;

  private String type;

  public ComptaOperation() {
  }

  public int getIDoperation() {
    return this.IDoperation;
  }

  public void setIDoperation(int IDoperation) {
    this.IDoperation = IDoperation;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public CompteBancaire getCompteBancaire() {
    return compteBancaire;
  }

  public void setCompteBancaire(CompteBancaire compteBancaire) {
    this.compteBancaire = compteBancaire;
  }

  public ModeReglement getMode() {
    return mode;
  }

  public void setMode(ModeReglement mode) {
    this.mode = mode;
  }

  public ComptaReleve getReleve() {
    return releve;
  }

  public void setReleve(ComptaReleve releve) {
    this.releve = releve;
  }

  public ComptaTier getTiers() {
    return tiers;
  }

  public void setTiers(ComptaTier tiers) {
    this.tiers = tiers;
  }

  public ComptaVirement getVirement() {
    return virement;
  }

  public void setVirement(ComptaVirement virement) {
    this.virement = virement;
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

  public String getNumPiece() {
    return this.numPiece;
  }

  public void setNumPiece(String numPiece) {
    this.numPiece = numPiece;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

  public String getRefPiece() {
    return this.refPiece;
  }

  public void setRefPiece(String refPiece) {
    this.refPiece = refPiece;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}