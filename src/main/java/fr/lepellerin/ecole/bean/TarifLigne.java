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
 * The persistent class for the tarifs_lignes database table.
 * 
 */
@Entity
@Table(name = "tarifs_lignes")

public class TarifLigne implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDligne;

  private double ajustement;

  private String code;

  private double coefficient;

  private String date;

  @Column(name = "duree_max")
  private String dureeMax;

  @Column(name = "duree_min")
  private String dureeMin;

  @Column(name = "duree_plafond")
  private String dureePlafond;

  @Column(name = "duree_seuil")
  private String dureeSeuil;

  @Column(name = "heure_debut_max")
  private String heureDebutMax;

  @Column(name = "heure_debut_min")
  private String heureDebutMin;

  @Column(name = "heure_fin_max")
  private String heureFinMax;

  @Column(name = "heure_fin_min")
  private String heureFinMin;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDtarif")
  private Tarif tarif;

  @Lob
  private String label;

  @Column(name = "montant_enfant_1")
  private double montantEnfant1;

  @Column(name = "montant_enfant_2")
  private double montantEnfant2;

  @Column(name = "montant_enfant_3")
  private double montantEnfant3;

  @Column(name = "montant_enfant_4")
  private double montantEnfant4;

  @Column(name = "montant_enfant_5")
  private double montantEnfant5;

  @Column(name = "montant_enfant_6")
  private double montantEnfant6;

  @Column(name = "montant_max")
  private double montantMax;

  @Column(name = "montant_min")
  private double montantMin;

  @Column(name = "montant_questionnaire")
  private int montantQuestionnaire;

  @Column(name = "montant_unique")
  private double montantUnique;

  @Column(name = "nbre_enfants")
  private int nbreEnfants;

  @Column(name = "num_ligne")
  private int numLigne;

  @Column(name = "qf_max")
  private double qfMax;

  @Column(name = "qf_min")
  private double qfMin;

  @Column(name = "revenu_max")
  private double revenuMax;

  @Column(name = "revenu_min")
  private double revenuMin;

  private double taux;

  @Column(name = "temps_facture")
  private String tempsFacture;

  private String tranche;

  @Column(name = "unite_horaire")
  private String uniteHoraire;

  public TarifLigne() {
  }

  public int getIDligne() {
    return this.IDligne;
  }

  public void setIDligne(int IDligne) {
    this.IDligne = IDligne;
  }

  public double getAjustement() {
    return this.ajustement;
  }

  public void setAjustement(double ajustement) {
    this.ajustement = ajustement;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public double getCoefficient() {
    return this.coefficient;
  }

  public void setCoefficient(double coefficient) {
    this.coefficient = coefficient;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDureeMax() {
    return this.dureeMax;
  }

  public void setDureeMax(String dureeMax) {
    this.dureeMax = dureeMax;
  }

  public String getDureeMin() {
    return this.dureeMin;
  }

  public void setDureeMin(String dureeMin) {
    this.dureeMin = dureeMin;
  }

  public String getDureePlafond() {
    return this.dureePlafond;
  }

  public void setDureePlafond(String dureePlafond) {
    this.dureePlafond = dureePlafond;
  }

  public String getDureeSeuil() {
    return this.dureeSeuil;
  }

  public void setDureeSeuil(String dureeSeuil) {
    this.dureeSeuil = dureeSeuil;
  }

  public String getHeureDebutMax() {
    return this.heureDebutMax;
  }

  public void setHeureDebutMax(String heureDebutMax) {
    this.heureDebutMax = heureDebutMax;
  }

  public String getHeureDebutMin() {
    return this.heureDebutMin;
  }

  public void setHeureDebutMin(String heureDebutMin) {
    this.heureDebutMin = heureDebutMin;
  }

  public String getHeureFinMax() {
    return this.heureFinMax;
  }

  public void setHeureFinMax(String heureFinMax) {
    this.heureFinMax = heureFinMax;
  }

  public String getHeureFinMin() {
    return this.heureFinMin;
  }

  public void setHeureFinMin(String heureFinMin) {
    this.heureFinMin = heureFinMin;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
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

  public double getMontantEnfant1() {
    return this.montantEnfant1;
  }

  public void setMontantEnfant1(double montantEnfant1) {
    this.montantEnfant1 = montantEnfant1;
  }

  public double getMontantEnfant2() {
    return this.montantEnfant2;
  }

  public void setMontantEnfant2(double montantEnfant2) {
    this.montantEnfant2 = montantEnfant2;
  }

  public double getMontantEnfant3() {
    return this.montantEnfant3;
  }

  public void setMontantEnfant3(double montantEnfant3) {
    this.montantEnfant3 = montantEnfant3;
  }

  public double getMontantEnfant4() {
    return this.montantEnfant4;
  }

  public void setMontantEnfant4(double montantEnfant4) {
    this.montantEnfant4 = montantEnfant4;
  }

  public double getMontantEnfant5() {
    return this.montantEnfant5;
  }

  public void setMontantEnfant5(double montantEnfant5) {
    this.montantEnfant5 = montantEnfant5;
  }

  public double getMontantEnfant6() {
    return this.montantEnfant6;
  }

  public void setMontantEnfant6(double montantEnfant6) {
    this.montantEnfant6 = montantEnfant6;
  }

  public double getMontantMax() {
    return this.montantMax;
  }

  public void setMontantMax(double montantMax) {
    this.montantMax = montantMax;
  }

  public double getMontantMin() {
    return this.montantMin;
  }

  public void setMontantMin(double montantMin) {
    this.montantMin = montantMin;
  }

  public int getMontantQuestionnaire() {
    return this.montantQuestionnaire;
  }

  public void setMontantQuestionnaire(int montantQuestionnaire) {
    this.montantQuestionnaire = montantQuestionnaire;
  }

  public double getMontantUnique() {
    return this.montantUnique;
  }

  public void setMontantUnique(double montantUnique) {
    this.montantUnique = montantUnique;
  }

  public int getNbreEnfants() {
    return this.nbreEnfants;
  }

  public void setNbreEnfants(int nbreEnfants) {
    this.nbreEnfants = nbreEnfants;
  }

  public int getNumLigne() {
    return this.numLigne;
  }

  public void setNumLigne(int numLigne) {
    this.numLigne = numLigne;
  }

  public double getQfMax() {
    return this.qfMax;
  }

  public void setQfMax(double qfMax) {
    this.qfMax = qfMax;
  }

  public double getQfMin() {
    return this.qfMin;
  }

  public void setQfMin(double qfMin) {
    this.qfMin = qfMin;
  }

  public double getRevenuMax() {
    return this.revenuMax;
  }

  public void setRevenuMax(double revenuMax) {
    this.revenuMax = revenuMax;
  }

  public double getRevenuMin() {
    return this.revenuMin;
  }

  public void setRevenuMin(double revenuMin) {
    this.revenuMin = revenuMin;
  }

  public double getTaux() {
    return this.taux;
  }

  public void setTaux(double taux) {
    this.taux = taux;
  }

  public String getTempsFacture() {
    return this.tempsFacture;
  }

  public void setTempsFacture(String tempsFacture) {
    this.tempsFacture = tempsFacture;
  }

  public String getTranche() {
    return this.tranche;
  }

  public void setTranche(String tranche) {
    this.tranche = tranche;
  }

  public String getUniteHoraire() {
    return this.uniteHoraire;
  }

  public void setUniteHoraire(String uniteHoraire) {
    this.uniteHoraire = uniteHoraire;
  }

}