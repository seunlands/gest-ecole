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
 * The persistent class for the unites_remplissage database table.
 * 
 */
@Entity
@Table(name = "unites_remplissage")

public class UniteRemplissage implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDunite_remplissage;

  private String abrege;

  @Column(name = "afficher_grille_conso")
  private int afficherGrilleConso;

  @Column(name = "afficher_page_accueil")
  private int afficherPageAccueil;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @Lob
  private String etiquettes;

  @Column(name = "heure_max")
  private String heureMax;

  @Column(name = "heure_min")
  private String heureMin;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  private String nom;

  private int ordre;

  @Column(name = "seuil_alerte")
  private int seuilAlerte;

  public UniteRemplissage() {
  }

  public int getIDunite_remplissage() {
    return this.IDunite_remplissage;
  }

  public void setIDunite_remplissage(int IDunite_remplissage) {
    this.IDunite_remplissage = IDunite_remplissage;
  }

  public String getAbrege() {
    return this.abrege;
  }

  public void setAbrege(String abrege) {
    this.abrege = abrege;
  }

  public int getAfficherGrilleConso() {
    return this.afficherGrilleConso;
  }

  public void setAfficherGrilleConso(int afficherGrilleConso) {
    this.afficherGrilleConso = afficherGrilleConso;
  }

  public int getAfficherPageAccueil() {
    return this.afficherPageAccueil;
  }

  public void setAfficherPageAccueil(int afficherPageAccueil) {
    this.afficherPageAccueil = afficherPageAccueil;
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

  public String getEtiquettes() {
    return this.etiquettes;
  }

  public void setEtiquettes(String etiquettes) {
    this.etiquettes = etiquettes;
  }

  public String getHeureMax() {
    return this.heureMax;
  }

  public void setHeureMax(String heureMax) {
    this.heureMax = heureMax;
  }

  public String getHeureMin() {
    return this.heureMin;
  }

  public void setHeureMin(String heureMin) {
    this.heureMin = heureMin;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
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

  public int getSeuilAlerte() {
    return this.seuilAlerte;
  }

  public void setSeuilAlerte(int seuilAlerte) {
    this.seuilAlerte = seuilAlerte;
  }

}