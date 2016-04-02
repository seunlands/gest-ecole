package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the pes_lots database table.
 * 
 */
@Entity
@Table(name = "pes_lots")

public class PesLot implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDlot;

  @Column(name = "code_budget")
  private String codeBudget;

  @Column(name = "code_collectivite")
  private String codeCollectivite;

  @Column(name = "code_prodloc")
  private String codeProdloc;

  @Column(name = "date_emission")
  private String dateEmission;

  @Column(name = "date_envoi")
  private String dateEnvoi;

  @Column(name = "date_prelevement")
  private String datePrelevement;

  private int exercice;

  @Column(name = "id_bordereau")
  private String idBordereau;

  @Column(name = "id_collectivite")
  private String idCollectivite;

  @Column(name = "id_poste")
  private String idPoste;

  private int IDcompte;

  private int IDmode;

  private int mois;

  private String nom;

  @Lob
  @Column(name = "objet_dette")
  private String objetDette;

  @Lob
  @Column(name = "objet_piece")
  private String objetPiece;

  @Lob
  private String observations;

  @Lob
  @Column(name = "prelevement_libelle")
  private String prelevementLibelle;

  @Column(name = "reglement_auto")
  private int reglementAuto;

  private int verrouillage;

  public PesLot() {
  }

  public int getIDlot() {
    return this.IDlot;
  }

  public void setIDlot(int IDlot) {
    this.IDlot = IDlot;
  }

  public String getCodeBudget() {
    return this.codeBudget;
  }

  public void setCodeBudget(String codeBudget) {
    this.codeBudget = codeBudget;
  }

  public String getCodeCollectivite() {
    return this.codeCollectivite;
  }

  public void setCodeCollectivite(String codeCollectivite) {
    this.codeCollectivite = codeCollectivite;
  }

  public String getCodeProdloc() {
    return this.codeProdloc;
  }

  public void setCodeProdloc(String codeProdloc) {
    this.codeProdloc = codeProdloc;
  }

  public String getDateEmission() {
    return this.dateEmission;
  }

  public void setDateEmission(String dateEmission) {
    this.dateEmission = dateEmission;
  }

  public String getDateEnvoi() {
    return this.dateEnvoi;
  }

  public void setDateEnvoi(String dateEnvoi) {
    this.dateEnvoi = dateEnvoi;
  }

  public String getDatePrelevement() {
    return this.datePrelevement;
  }

  public void setDatePrelevement(String datePrelevement) {
    this.datePrelevement = datePrelevement;
  }

  public int getExercice() {
    return this.exercice;
  }

  public void setExercice(int exercice) {
    this.exercice = exercice;
  }

  public String getIdBordereau() {
    return this.idBordereau;
  }

  public void setIdBordereau(String idBordereau) {
    this.idBordereau = idBordereau;
  }

  public String getIdCollectivite() {
    return this.idCollectivite;
  }

  public void setIdCollectivite(String idCollectivite) {
    this.idCollectivite = idCollectivite;
  }

  public String getIdPoste() {
    return this.idPoste;
  }

  public void setIdPoste(String idPoste) {
    this.idPoste = idPoste;
  }

  public int getIDcompte() {
    return this.IDcompte;
  }

  public void setIDcompte(int IDcompte) {
    this.IDcompte = IDcompte;
  }

  public int getIDmode() {
    return this.IDmode;
  }

  public void setIDmode(int IDmode) {
    this.IDmode = IDmode;
  }

  public int getMois() {
    return this.mois;
  }

  public void setMois(int mois) {
    this.mois = mois;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getObjetDette() {
    return this.objetDette;
  }

  public void setObjetDette(String objetDette) {
    this.objetDette = objetDette;
  }

  public String getObjetPiece() {
    return this.objetPiece;
  }

  public void setObjetPiece(String objetPiece) {
    this.objetPiece = objetPiece;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

  public String getPrelevementLibelle() {
    return this.prelevementLibelle;
  }

  public void setPrelevementLibelle(String prelevementLibelle) {
    this.prelevementLibelle = prelevementLibelle;
  }

  public int getReglementAuto() {
    return this.reglementAuto;
  }

  public void setReglementAuto(int reglementAuto) {
    this.reglementAuto = reglementAuto;
  }

  public int getVerrouillage() {
    return this.verrouillage;
  }

  public void setVerrouillage(int verrouillage) {
    this.verrouillage = verrouillage;
  }

}