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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the reglements database table.
 * 
 */
@Entity
@Table(name = "reglements")

public class Reglement implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDreglement;

  @Column(name = "avis_depot")
  private String avisDepot;

  private String date;

  @Column(name = "date_differe")
  private String dateDiffere;

  @Column(name = "date_saisie")
  private String dateSaisie;

  @Column(name = "encaissement_attente")
  private int encaissementAttente;

  private int IDcompte;

  @ManyToOne
  @JoinColumn(name = "IDcompte_payeur")
  private ComptePayeur comptePayeur;

  @ManyToOne
  @JoinColumn(name = "IDdepot")
  private Depot depot;

  @ManyToOne
  @JoinColumn(name = "IDemetteur")
  private Emetteur emetteur;

  @ManyToOne
  @JoinColumn(name = "IDmode")
  private ModeReglement mode;

  @ManyToOne
  @JoinColumn(name = "IDpayeur")
  private Payeur payeur;

  @ManyToOne
  @JoinColumn(name = "IDpiece")
  private Piece piece;

  @ManyToOne
  @JoinColumn(name = "IDprelevement")
  private Prelevement prelevement;

  @ManyToOne
  @JoinColumn(name = "IDprestation_frais")
  private Prestation prestation_frais;

  @ManyToOne
  @JoinColumn(name = "IDutilisateur")
  private Utilisateur utilisateur;

  private double montant;

  @Column(name = "numero_piece")
  private String numeroPiece;

  @Column(name = "numero_quittancier")
  private String numeroQuittancier;

  private String observations;

  public Reglement() {
  }

  public int getIDreglement() {
    return this.IDreglement;
  }

  public void setIDreglement(int IDreglement) {
    this.IDreglement = IDreglement;
  }

  public String getAvisDepot() {
    return this.avisDepot;
  }

  public void setAvisDepot(String avisDepot) {
    this.avisDepot = avisDepot;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDateDiffere() {
    return this.dateDiffere;
  }

  public void setDateDiffere(String dateDiffere) {
    this.dateDiffere = dateDiffere;
  }

  public String getDateSaisie() {
    return this.dateSaisie;
  }

  public void setDateSaisie(String dateSaisie) {
    this.dateSaisie = dateSaisie;
  }

  public int getEncaissementAttente() {
    return this.encaissementAttente;
  }

  public void setEncaissementAttente(int encaissementAttente) {
    this.encaissementAttente = encaissementAttente;
  }

  public int getIDcompte() {
    return this.IDcompte;
  }

  public void setIDcompte(int IDcompte) {
    this.IDcompte = IDcompte;
  }

  public ComptePayeur getComptePayeur() {
    return comptePayeur;
  }

  public void setComptePayeur(ComptePayeur comptePayeur) {
    this.comptePayeur = comptePayeur;
  }

  public Depot getDepot() {
    return depot;
  }

  public void setDepot(Depot depot) {
    this.depot = depot;
  }

  public Emetteur getEmetteur() {
    return emetteur;
  }

  public void setEmetteur(Emetteur emetteur) {
    this.emetteur = emetteur;
  }

  public ModeReglement getMode() {
    return mode;
  }

  public void setMode(ModeReglement mode) {
    this.mode = mode;
  }

  public Payeur getPayeur() {
    return payeur;
  }

  public void setPayeur(Payeur payeur) {
    this.payeur = payeur;
  }

  public Piece getPiece() {
    return piece;
  }

  public void setPiece(Piece piece) {
    this.piece = piece;
  }

  public Prelevement getPrelevement() {
    return prelevement;
  }

  public void setPrelevement(Prelevement prelevement) {
    this.prelevement = prelevement;
  }

  public Prestation getPrestation_frais() {
    return prestation_frais;
  }

  public void setPrestation_frais(Prestation prestation_frais) {
    this.prestation_frais = prestation_frais;
  }

  public Utilisateur getUtilisateur() {
    return utilisateur;
  }

  public void setUtilisateur(Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
  }

  public double getMontant() {
    return this.montant;
  }

  public void setMontant(double montant) {
    this.montant = montant;
  }

  public String getNumeroPiece() {
    return this.numeroPiece;
  }

  public void setNumeroPiece(String numeroPiece) {
    this.numeroPiece = numeroPiece;
  }

  public String getNumeroQuittancier() {
    return this.numeroQuittancier;
  }

  public void setNumeroQuittancier(String numeroQuittancier) {
    this.numeroQuittancier = numeroQuittancier;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

}