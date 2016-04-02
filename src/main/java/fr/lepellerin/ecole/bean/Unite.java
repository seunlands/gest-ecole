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
 * The persistent class for the unites database table.
 * 
 */
@Entity
@Table(name = "unites")

public class Unite implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDunite;

  private String abrege;

  @Column(name = "autogen_active")
  private Integer autogenActive;

  @Lob
  @Column(name = "autogen_conditions")
  private String autogenConditions;

  @Lob
  @Column(name = "autogen_parametres")
  private String autogenParametres;

  private String coeff;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @Column(name = "heure_debut")
  private String heureDebut;

  @Column(name = "heure_debut_fixe")
  private int heureDebutFixe;

  @Column(name = "heure_fin")
  private String heureFin;

  @Column(name = "heure_fin_fixe")
  private int heureFinFixe;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDrestaurateur")
  private Restaurateur restaurateur;

  private int largeur;

  private String nom;

  private int ordre;

  private int repas;

  @Column(name = "touche_raccourci")
  private String toucheRaccourci;

  private String type;

  public Unite() {
  }

  public int getIDunite() {
    return this.IDunite;
  }

  public void setIDunite(int IDunite) {
    this.IDunite = IDunite;
  }

  public String getAbrege() {
    return this.abrege;
  }

  public void setAbrege(String abrege) {
    this.abrege = abrege;
  }

  public Integer getAutogenActive() {
    return this.autogenActive;
  }

  public void setAutogenActive(Integer autogenActive) {
    this.autogenActive = autogenActive;
  }

  public String getAutogenConditions() {
    return this.autogenConditions;
  }

  public void setAutogenConditions(String autogenConditions) {
    this.autogenConditions = autogenConditions;
  }

  public String getAutogenParametres() {
    return this.autogenParametres;
  }

  public void setAutogenParametres(String autogenParametres) {
    this.autogenParametres = autogenParametres;
  }

  public String getCoeff() {
    return this.coeff;
  }

  public void setCoeff(String coeff) {
    this.coeff = coeff;
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

  public String getHeureDebut() {
    return this.heureDebut;
  }

  public void setHeureDebut(String heureDebut) {
    this.heureDebut = heureDebut;
  }

  public int getHeureDebutFixe() {
    return this.heureDebutFixe;
  }

  public void setHeureDebutFixe(int heureDebutFixe) {
    this.heureDebutFixe = heureDebutFixe;
  }

  public String getHeureFin() {
    return this.heureFin;
  }

  public void setHeureFin(String heureFin) {
    this.heureFin = heureFin;
  }

  public int getHeureFinFixe() {
    return this.heureFinFixe;
  }

  public void setHeureFinFixe(int heureFinFixe) {
    this.heureFinFixe = heureFinFixe;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public Restaurateur getRestaurateur() {
    return restaurateur;
  }

  public void setRestaurateur(Restaurateur restaurateur) {
    this.restaurateur = restaurateur;
  }

  public int getLargeur() {
    return this.largeur;
  }

  public void setLargeur(int largeur) {
    this.largeur = largeur;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public int getOrdre() {
    return this.ordre;
  }

  public void setOrdre(int ordre) {
    this.ordre = ordre;
  }

  public int getRepas() {
    return this.repas;
  }

  public void setRepas(int repas) {
    this.repas = repas;
  }

  public String getToucheRaccourci() {
    return this.toucheRaccourci;
  }

  public void setToucheRaccourci(String toucheRaccourci) {
    this.toucheRaccourci = toucheRaccourci;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}