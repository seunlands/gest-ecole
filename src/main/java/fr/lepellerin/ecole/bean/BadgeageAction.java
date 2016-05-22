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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the badgeage_actions database table.
 *
 */
@Entity
@Table(name = "badgeage_actions")
public class BadgeageAction implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDaction")
  private int id;

  @Lob
  private String action;

  @Lob
  @Column(name = "action_activite")
  private String actionActivite;

  @Lob
  @Column(name = "action_attente")
  private String actionAttente;

  @Lob
  @Column(name = "action_date")
  private String actionDate;

  @Column(name = "action_demande")
  private String actionDemande;

  @Column(name = "action_duree")
  private String actionDuree;

  @Lob
  @Column(name = "action_etat")
  private String actionEtat;

  @Lob
  @Column(name = "action_frequence")
  private String actionFrequence;

  @Lob
  @Column(name = "action_heure_debut")
  private String actionHeureDebut;

  @Lob
  @Column(name = "action_heure_fin")
  private String actionHeureFin;

  @Lob
  @Column(name = "action_icone")
  private String actionIcone;

  @Lob
  @Column(name = "action_message")
  private String actionMessage;

  @Lob
  @Column(name = "action_question")
  private String actionQuestion;

  @Lob
  @Column(name = "action_ticket")
  private String actionTicket;

  @Lob
  @Column(name = "action_unite")
  private String actionUnite;

  @Lob
  @Column(name = "action_vocal")
  private String actionVocal;

  @Lob
  @Column(name = "condition_activite")
  private String conditionActivite;

  @Lob
  @Column(name = "condition_heure")
  private String conditionHeure;

  @Lob
  @Column(name = "condition_periode")
  private String conditionPeriode;

  @Lob
  @Column(name = "condition_poste")
  private String conditionPoste;

  @Lob
  @Column(name = "condition_questionnaire")
  private String conditionQuestionnaire;

  @ManyToOne
  @JoinColumn(name = "IDprocedure")
  private BadgeageProcedure procedure;

  private int ordre;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getAction() {
    return this.action;
  }

  public void setAction(final String action) {
    this.action = action;
  }

  public String getActionActivite() {
    return this.actionActivite;
  }

  public void setActionActivite(final String actionActivite) {
    this.actionActivite = actionActivite;
  }

  public String getActionAttente() {
    return this.actionAttente;
  }

  public void setActionAttente(final String actionAttente) {
    this.actionAttente = actionAttente;
  }

  public String getActionDate() {
    return this.actionDate;
  }

  public void setActionDate(final String actionDate) {
    this.actionDate = actionDate;
  }

  public String getActionDemande() {
    return this.actionDemande;
  }

  public void setActionDemande(final String actionDemande) {
    this.actionDemande = actionDemande;
  }

  public String getActionDuree() {
    return this.actionDuree;
  }

  public void setActionDuree(final String actionDuree) {
    this.actionDuree = actionDuree;
  }

  public String getActionEtat() {
    return this.actionEtat;
  }

  public void setActionEtat(final String actionEtat) {
    this.actionEtat = actionEtat;
  }

  public String getActionFrequence() {
    return this.actionFrequence;
  }

  public void setActionFrequence(final String actionFrequence) {
    this.actionFrequence = actionFrequence;
  }

  public String getActionHeureDebut() {
    return this.actionHeureDebut;
  }

  public void setActionHeureDebut(final String actionHeureDebut) {
    this.actionHeureDebut = actionHeureDebut;
  }

  public String getActionHeureFin() {
    return this.actionHeureFin;
  }

  public void setActionHeureFin(final String actionHeureFin) {
    this.actionHeureFin = actionHeureFin;
  }

  public String getActionIcone() {
    return this.actionIcone;
  }

  public void setActionIcone(final String actionIcone) {
    this.actionIcone = actionIcone;
  }

  public String getActionMessage() {
    return this.actionMessage;
  }

  public void setActionMessage(final String actionMessage) {
    this.actionMessage = actionMessage;
  }

  public String getActionQuestion() {
    return this.actionQuestion;
  }

  public void setActionQuestion(final String actionQuestion) {
    this.actionQuestion = actionQuestion;
  }

  public String getActionTicket() {
    return this.actionTicket;
  }

  public void setActionTicket(final String actionTicket) {
    this.actionTicket = actionTicket;
  }

  public String getActionUnite() {
    return this.actionUnite;
  }

  public void setActionUnite(final String actionUnite) {
    this.actionUnite = actionUnite;
  }

  public String getActionVocal() {
    return this.actionVocal;
  }

  public void setActionVocal(final String actionVocal) {
    this.actionVocal = actionVocal;
  }

  public String getConditionActivite() {
    return this.conditionActivite;
  }

  public void setConditionActivite(final String conditionActivite) {
    this.conditionActivite = conditionActivite;
  }

  public String getConditionHeure() {
    return this.conditionHeure;
  }

  public void setConditionHeure(final String conditionHeure) {
    this.conditionHeure = conditionHeure;
  }

  public String getConditionPeriode() {
    return this.conditionPeriode;
  }

  public void setConditionPeriode(final String conditionPeriode) {
    this.conditionPeriode = conditionPeriode;
  }

  public String getConditionPoste() {
    return this.conditionPoste;
  }

  public void setConditionPoste(final String conditionPoste) {
    this.conditionPoste = conditionPoste;
  }

  public String getConditionQuestionnaire() {
    return this.conditionQuestionnaire;
  }

  public void setConditionQuestionnaire(final String conditionQuestionnaire) {
    this.conditionQuestionnaire = conditionQuestionnaire;
  }

  public BadgeageProcedure getProcedure() {
    return procedure;
  }

  public void setProcedure(final BadgeageProcedure procedure) {
    this.procedure = procedure;
  }

  public int getOrdre() {
    return this.ordre;
  }

  public void setOrdre(final int ordre) {
    this.ordre = ordre;
  }

}