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
 * The persistent class for the pes_lots database table.
 * 
 */
@Entity
@Table(name = "pes_lots")

public class PesLot implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDlot")
  private int id;

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

  @Column(name = "IDcompte")
  private int idCompte;

  @Column(name = "IDmode")
  private int idMode;

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

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
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

  public int getIdCompte() {
    return this.idCompte;
  }

  public void setIdCompte(int idCompte) {
    this.idCompte = idCompte;
  }

  public int getIdMode() {
    return this.idMode;
  }

  public void setIDmode(int idMode) {
    this.idMode = idMode;
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