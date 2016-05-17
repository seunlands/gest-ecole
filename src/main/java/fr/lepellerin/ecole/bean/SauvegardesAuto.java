/*
   Copyright (C)  Seun Landsberg 2016

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program; if not, see <http://www.gnu.org/licenses/>.
*/


package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the sauvegardes_auto database table.
 * 
 */
@Entity
@Table(name = "sauvegardes_auto")

public class SauvegardesAuto implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDsauvegarde;

  @Lob
  @Column(name = "condition_derniere")
  private String conditionDerniere;

  @Lob
  @Column(name = "condition_heure")
  private String conditionHeure;

  @Lob
  @Column(name = "condition_jours_scolaires")
  private String conditionJoursScolaires;

  @Lob
  @Column(name = "condition_jours_vacances")
  private String conditionJoursVacances;

  @Lob
  @Column(name = "condition_poste")
  private String conditionPoste;

  @Lob
  @Column(name = "condition_utilisateur")
  private String conditionUtilisateur;

  @Column(name = "date_derniere")
  private String dateDerniere;

  @Lob
  private String nom;

  @Lob
  private String observations;

  @Lob
  @Column(name = "option_afficher_interface")
  private String optionAfficherInterface;

  @Lob
  @Column(name = "option_confirmation")
  private String optionConfirmation;

  @Lob
  @Column(name = "option_demander")
  private String optionDemander;

  @Lob
  @Column(name = "option_suppression")
  private String optionSuppression;

  @Lob
  @Column(name = "sauvegarde_emails")
  private String sauvegardeEmails;

  @Lob
  @Column(name = "sauvegarde_fichiers_locaux")
  private String sauvegardeFichiersLocaux;

  @Lob
  @Column(name = "sauvegarde_fichiers_reseau")
  private String sauvegardeFichiersReseau;

  @Lob
  @Column(name = "sauvegarde_motdepasse")
  private String sauvegardeMotdepasse;

  @Lob
  @Column(name = "sauvegarde_nom")
  private String sauvegardeNom;

  @Lob
  @Column(name = "sauvegarde_repertoire")
  private String sauvegardeRepertoire;

  public SauvegardesAuto() {
  }

  public int getIDsauvegarde() {
    return this.IDsauvegarde;
  }

  public void setIDsauvegarde(int IDsauvegarde) {
    this.IDsauvegarde = IDsauvegarde;
  }

  public String getConditionDerniere() {
    return this.conditionDerniere;
  }

  public void setConditionDerniere(String conditionDerniere) {
    this.conditionDerniere = conditionDerniere;
  }

  public String getConditionHeure() {
    return this.conditionHeure;
  }

  public void setConditionHeure(String conditionHeure) {
    this.conditionHeure = conditionHeure;
  }

  public String getConditionJoursScolaires() {
    return this.conditionJoursScolaires;
  }

  public void setConditionJoursScolaires(String conditionJoursScolaires) {
    this.conditionJoursScolaires = conditionJoursScolaires;
  }

  public String getConditionJoursVacances() {
    return this.conditionJoursVacances;
  }

  public void setConditionJoursVacances(String conditionJoursVacances) {
    this.conditionJoursVacances = conditionJoursVacances;
  }

  public String getConditionPoste() {
    return this.conditionPoste;
  }

  public void setConditionPoste(String conditionPoste) {
    this.conditionPoste = conditionPoste;
  }

  public String getConditionUtilisateur() {
    return this.conditionUtilisateur;
  }

  public void setConditionUtilisateur(String conditionUtilisateur) {
    this.conditionUtilisateur = conditionUtilisateur;
  }

  public String getDateDerniere() {
    return this.dateDerniere;
  }

  public void setDateDerniere(String dateDerniere) {
    this.dateDerniere = dateDerniere;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

  public String getOptionAfficherInterface() {
    return this.optionAfficherInterface;
  }

  public void setOptionAfficherInterface(String optionAfficherInterface) {
    this.optionAfficherInterface = optionAfficherInterface;
  }

  public String getOptionConfirmation() {
    return this.optionConfirmation;
  }

  public void setOptionConfirmation(String optionConfirmation) {
    this.optionConfirmation = optionConfirmation;
  }

  public String getOptionDemander() {
    return this.optionDemander;
  }

  public void setOptionDemander(String optionDemander) {
    this.optionDemander = optionDemander;
  }

  public String getOptionSuppression() {
    return this.optionSuppression;
  }

  public void setOptionSuppression(String optionSuppression) {
    this.optionSuppression = optionSuppression;
  }

  public String getSauvegardeEmails() {
    return this.sauvegardeEmails;
  }

  public void setSauvegardeEmails(String sauvegardeEmails) {
    this.sauvegardeEmails = sauvegardeEmails;
  }

  public String getSauvegardeFichiersLocaux() {
    return this.sauvegardeFichiersLocaux;
  }

  public void setSauvegardeFichiersLocaux(String sauvegardeFichiersLocaux) {
    this.sauvegardeFichiersLocaux = sauvegardeFichiersLocaux;
  }

  public String getSauvegardeFichiersReseau() {
    return this.sauvegardeFichiersReseau;
  }

  public void setSauvegardeFichiersReseau(String sauvegardeFichiersReseau) {
    this.sauvegardeFichiersReseau = sauvegardeFichiersReseau;
  }

  public String getSauvegardeMotdepasse() {
    return this.sauvegardeMotdepasse;
  }

  public void setSauvegardeMotdepasse(String sauvegardeMotdepasse) {
    this.sauvegardeMotdepasse = sauvegardeMotdepasse;
  }

  public String getSauvegardeNom() {
    return this.sauvegardeNom;
  }

  public void setSauvegardeNom(String sauvegardeNom) {
    this.sauvegardeNom = sauvegardeNom;
  }

  public String getSauvegardeRepertoire() {
    return this.sauvegardeRepertoire;
  }

  public void setSauvegardeRepertoire(String sauvegardeRepertoire) {
    this.sauvegardeRepertoire = sauvegardeRepertoire;
  }

}