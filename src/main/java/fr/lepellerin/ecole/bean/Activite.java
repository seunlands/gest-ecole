package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the activites database table.
 * 
 */
@Entity
@Table(name = "activites")

public class Activite implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDactivite;

  private String abrege;

  @Lob
  @Column(name = "code_comptable")
  private String codeComptable;

  @Column(name = "coords_org")
  private int coordsOrg;

  private String cp;

  @Column(name = "date_creation")
  private String dateCreation;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  private String fax;

  @Lob
  private byte[] logo;

  @Column(name = "logo_org")
  private int logoOrg;

  private String mail;

  @Column(name = "nbre_inscrits_max")
  private Integer nbreInscritsMax;

  private String nom;

  @Column(name = "psu_activation")
  private Integer psuActivation;

  @Column(name = "psu_etiquette_rtt")
  private Integer psuEtiquetteRtt;

  @Column(name = "psu_tarif_forfait")
  private Integer psuTarifForfait;

  @Column(name = "psu_unite_presence")
  private Integer psuUnitePresence;

  @Column(name = "psu_unite_prevision")
  private Integer psuUnitePrevision;

  @Column(name = "public")
  private String public_;

  private String rue;

  private String site;

  private String tel;

  @Column(name = "vaccins_obligatoires")
  private Integer vaccinsObligatoires;

  private String ville;

  public Activite() {
  }

  public int getIDactivite() {
    return this.IDactivite;
  }

  public void setIDactivite(int IDactivite) {
    this.IDactivite = IDactivite;
  }

  public String getAbrege() {
    return this.abrege;
  }

  public void setAbrege(String abrege) {
    this.abrege = abrege;
  }

  public String getCodeComptable() {
    return this.codeComptable;
  }

  public void setCodeComptable(String codeComptable) {
    this.codeComptable = codeComptable;
  }

  public int getCoordsOrg() {
    return this.coordsOrg;
  }

  public void setCoordsOrg(int coordsOrg) {
    this.coordsOrg = coordsOrg;
  }

  public String getCp() {
    return this.cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public String getDateCreation() {
    return this.dateCreation;
  }

  public void setDateCreation(String dateCreation) {
    this.dateCreation = dateCreation;
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

  public String getFax() {
    return this.fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public byte[] getLogo() {
    return this.logo;
  }

  public void setLogo(byte[] logo) {
    this.logo = logo;
  }

  public int getLogoOrg() {
    return this.logoOrg;
  }

  public void setLogoOrg(int logoOrg) {
    this.logoOrg = logoOrg;
  }

  public String getMail() {
    return this.mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public Integer getNbreInscritsMax() {
    return this.nbreInscritsMax;
  }

  public void setNbreInscritsMax(Integer nbreInscritsMax) {
    this.nbreInscritsMax = nbreInscritsMax;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public Integer getPsuActivation() {
    return this.psuActivation;
  }

  public void setPsuActivation(Integer psuActivation) {
    this.psuActivation = psuActivation;
  }

  public Integer getPsuEtiquetteRtt() {
    return this.psuEtiquetteRtt;
  }

  public void setPsuEtiquetteRtt(Integer psuEtiquetteRtt) {
    this.psuEtiquetteRtt = psuEtiquetteRtt;
  }

  public Integer getPsuTarifForfait() {
    return this.psuTarifForfait;
  }

  public void setPsuTarifForfait(Integer psuTarifForfait) {
    this.psuTarifForfait = psuTarifForfait;
  }

  public Integer getPsuUnitePresence() {
    return this.psuUnitePresence;
  }

  public void setPsuUnitePresence(Integer psuUnitePresence) {
    this.psuUnitePresence = psuUnitePresence;
  }

  public Integer getPsuUnitePrevision() {
    return this.psuUnitePrevision;
  }

  public void setPsuUnitePrevision(Integer psuUnitePrevision) {
    this.psuUnitePrevision = psuUnitePrevision;
  }

  public String getPublic_() {
    return this.public_;
  }

  public void setPublic_(String public_) {
    this.public_ = public_;
  }

  public String getRue() {
    return this.rue;
  }

  public void setRue(String rue) {
    this.rue = rue;
  }

  public String getSite() {
    return this.site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public String getTel() {
    return this.tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public Integer getVaccinsObligatoires() {
    return this.vaccinsObligatoires;
  }

  public void setVaccinsObligatoires(Integer vaccinsObligatoires) {
    this.vaccinsObligatoires = vaccinsObligatoires;
  }

  public String getVille() {
    return this.ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

}