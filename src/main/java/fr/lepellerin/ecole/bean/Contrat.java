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
 * The persistent class for the contrats database table.
 * 
 */
@Entity
@Table(name = "contrats")

public class Contrat implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDcontrat;

  @Column(name = "arrondi_delta")
  private int arrondiDelta;

  @Column(name = "arrondi_type")
  private String arrondiType;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @Column(name = "duree_absences_prevues")
  private String dureeAbsencesPrevues;

  @Column(name = "duree_heures_regularisation")
  private String dureeHeuresRegularisation;

  @Column(name = "duree_tolerance_depassement")
  private String dureeToleranceDepassement;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  @ManyToOne
  @JoinColumn(name = "IDinscription")
  private Inscription inscription;

  @ManyToOne
  @JoinColumn(name = "IDtarif")
  private Tarif tarif;

  @Column(name = "nbre_absences_prevues")
  private int nbreAbsencesPrevues;

  @Column(name = "nbre_heures_regularisation")
  private int nbreHeuresRegularisation;

  @Lob
  private String observations;

  private String type;

  public Contrat() {
  }

  public int getIDcontrat() {
    return this.IDcontrat;
  }

  public void setIDcontrat(int IDcontrat) {
    this.IDcontrat = IDcontrat;
  }

  public int getArrondiDelta() {
    return this.arrondiDelta;
  }

  public void setArrondiDelta(int arrondiDelta) {
    this.arrondiDelta = arrondiDelta;
  }

  public String getArrondiType() {
    return this.arrondiType;
  }

  public void setArrondiType(String arrondiType) {
    this.arrondiType = arrondiType;
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

  public String getDureeAbsencesPrevues() {
    return this.dureeAbsencesPrevues;
  }

  public void setDureeAbsencesPrevues(String dureeAbsencesPrevues) {
    this.dureeAbsencesPrevues = dureeAbsencesPrevues;
  }

  public String getDureeHeuresRegularisation() {
    return this.dureeHeuresRegularisation;
  }

  public void setDureeHeuresRegularisation(String dureeHeuresRegularisation) {
    this.dureeHeuresRegularisation = dureeHeuresRegularisation;
  }

  public String getDureeToleranceDepassement() {
    return this.dureeToleranceDepassement;
  }

  public void setDureeToleranceDepassement(String dureeToleranceDepassement) {
    this.dureeToleranceDepassement = dureeToleranceDepassement;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

  public Inscription getInscription() {
    return inscription;
  }

  public void setInscription(Inscription inscription) {
    this.inscription = inscription;
  }

  public Tarif getTarif() {
    return tarif;
  }

  public void setTarif(Tarif tarif) {
    this.tarif = tarif;
  }

  public int getNbreAbsencesPrevues() {
    return this.nbreAbsencesPrevues;
  }

  public void setNbreAbsencesPrevues(int nbreAbsencesPrevues) {
    this.nbreAbsencesPrevues = nbreAbsencesPrevues;
  }

  public int getNbreHeuresRegularisation() {
    return this.nbreHeuresRegularisation;
  }

  public void setNbreHeuresRegularisation(int nbreHeuresRegularisation) {
    this.nbreHeuresRegularisation = nbreHeuresRegularisation;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}