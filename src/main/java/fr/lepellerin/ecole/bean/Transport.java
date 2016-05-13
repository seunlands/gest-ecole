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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the transports database table.
 * 
 */
@Entity
@Table(name = "transports")

public class Transport implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDtransport;

  private int actif;

  @Column(name = "arrivee_date")
  private String arriveeDate;

  @Column(name = "arrivee_heure")
  private String arriveeHeure;

  @Lob
  @Column(name = "arrivee_localisation")
  private String arriveeLocalisation;

  private String categorie;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @Column(name = "depart_date")
  private String departDate;

  @Column(name = "depart_heure")
  private String departHeure;

  @Lob
  @Column(name = "depart_localisation")
  private String departLocalisation;

  @Lob
  private String details;

  @ManyToOne
  @JoinColumn(name = "IDcompagnie")
  private TransportCompagnie compagnie;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  @ManyToOne
  @JoinColumn(name = "IDligne")
  private TransportLigne ligne;

  @ManyToOne
  @JoinColumn(name = "arrivee_IDarret")
  private TransportArret arriveeArret;

  @ManyToOne
  @JoinColumn(name = "arrivee_IDlieu")
  private TransportLieu arriveeLieu;

  @ManyToOne
  @JoinColumn(name = "depart_IDarret")
  private TransportArret departArret;

  @ManyToOne
  @JoinColumn(name = "depart_IDlieu")
  private TransportLieu departLieu;

  @Column(name = "jours_scolaires")
  private String joursScolaires;

  @Column(name = "jours_vacances")
  private String joursVacances;

  private String mode;

  private String numero;

  @Lob
  private String observations;

  private int prog;

  @Lob
  private String unites;

  public Transport() {
  }

  public int getIDtransport() {
    return this.IDtransport;
  }

  public void setIDtransport(int IDtransport) {
    this.IDtransport = IDtransport;
  }

  public int getActif() {
    return this.actif;
  }

  public void setActif(int actif) {
    this.actif = actif;
  }

  public String getArriveeDate() {
    return this.arriveeDate;
  }

  public void setArriveeDate(String arriveeDate) {
    this.arriveeDate = arriveeDate;
  }

  public String getArriveeHeure() {
    return this.arriveeHeure;
  }

  public void setArriveeHeure(String arriveeHeure) {
    this.arriveeHeure = arriveeHeure;
  }

  public String getArriveeLocalisation() {
    return this.arriveeLocalisation;
  }

  public void setArriveeLocalisation(String arriveeLocalisation) {
    this.arriveeLocalisation = arriveeLocalisation;
  }

  public String getCategorie() {
    return this.categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
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

  public String getDepartDate() {
    return this.departDate;
  }

  public void setDepartDate(String departDate) {
    this.departDate = departDate;
  }

  public String getDepartHeure() {
    return this.departHeure;
  }

  public void setDepartHeure(String departHeure) {
    this.departHeure = departHeure;
  }

  public String getDepartLocalisation() {
    return this.departLocalisation;
  }

  public void setDepartLocalisation(String departLocalisation) {
    this.departLocalisation = departLocalisation;
  }

  public String getDetails() {
    return this.details;
  }

  public void setDetails(String details) {
    this.details = details;
  }

  public TransportCompagnie getCompagnie() {
    return compagnie;
  }

  public void setCompagnie(TransportCompagnie compagnie) {
    this.compagnie = compagnie;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

  public TransportLigne getLigne() {
    return ligne;
  }

  public void setLigne(TransportLigne ligne) {
    this.ligne = ligne;
  }

  public TransportArret getArriveeArret() {
    return arriveeArret;
  }

  public void setArriveeArret(TransportArret arriveeArret) {
    this.arriveeArret = arriveeArret;
  }

  public TransportLieu getArriveeLieu() {
    return arriveeLieu;
  }

  public void setArriveeLieu(TransportLieu arriveeLieu) {
    this.arriveeLieu = arriveeLieu;
  }

  public TransportArret getDepartArret() {
    return departArret;
  }

  public void setDepartArret(TransportArret departArret) {
    this.departArret = departArret;
  }

  public TransportLieu getDepartLieu() {
    return departLieu;
  }

  public void setDepartLieu(TransportLieu departLieu) {
    this.departLieu = departLieu;
  }

  public String getJoursScolaires() {
    return this.joursScolaires;
  }

  public void setJoursScolaires(String joursScolaires) {
    this.joursScolaires = joursScolaires;
  }

  public String getJoursVacances() {
    return this.joursVacances;
  }

  public void setJoursVacances(String joursVacances) {
    this.joursVacances = joursVacances;
  }

  public String getMode() {
    return this.mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public String getNumero() {
    return this.numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

  public int getProg() {
    return this.prog;
  }

  public void setProg(int prog) {
    this.prog = prog;
  }

  public String getUnites() {
    return this.unites;
  }

  public void setUnites(String unites) {
    this.unites = unites;
  }

}