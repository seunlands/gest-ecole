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
 * The persistent class for the cotisations database table.
 *
 */
@Entity
@Table(name = "cotisations")

public class Cotisation implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDcotisation")
  private int id;

  @Lob
  private String activites;

  @Column(name = "date_creation_carte")
  private String dateCreationCarte;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @Column(name = "date_saisie")
  private String dateSaisie;

  @ManyToOne
  @JoinColumn(name = "IDdepot_cotisation")
  private DepotCotisation depotCotisation;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  @ManyToOne
  @JoinColumn(name = "IDprestation")
  private Prestation prestation;

  @ManyToOne
  @JoinColumn(name = "IDtype_cotisation")
  private TypeCotisation typeCotisation;

  @ManyToOne
  @JoinColumn(name = "IDunite_cotisation")
  private UniteCotisation uniteCotisation;

  @ManyToOne
  @JoinColumn(name = "IDutilisateur")
  private Utilisateur utilisateur;

  private String numero;

  @Lob
  private String observations;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getActivites() {
    return this.activites;
  }

  public void setActivites(final String activites) {
    this.activites = activites;
  }

  public String getDateCreationCarte() {
    return this.dateCreationCarte;
  }

  public void setDateCreationCarte(final String dateCreationCarte) {
    this.dateCreationCarte = dateCreationCarte;
  }

  public String getDateDebut() {
    return this.dateDebut;
  }

  public void setDateDebut(final String dateDebut) {
    this.dateDebut = dateDebut;
  }

  public String getDateFin() {
    return this.dateFin;
  }

  public void setDateFin(final String dateFin) {
    this.dateFin = dateFin;
  }

  public String getDateSaisie() {
    return this.dateSaisie;
  }

  public void setDateSaisie(final String dateSaisie) {
    this.dateSaisie = dateSaisie;
  }

  public DepotCotisation getDepotCotisation() {
    return depotCotisation;
  }

  public void setDepotCotisation(final DepotCotisation depotCotisation) {
    this.depotCotisation = depotCotisation;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(final Famille famille) {
    this.famille = famille;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(final Individu individu) {
    this.individu = individu;
  }

  public Prestation getPrestation() {
    return prestation;
  }

  public void setPrestation(final Prestation prestation) {
    this.prestation = prestation;
  }

  public TypeCotisation getTypeCotisation() {
    return typeCotisation;
  }

  public void setTypeCotisation(final TypeCotisation typeCotisation) {
    this.typeCotisation = typeCotisation;
  }

  public UniteCotisation getUniteCotisation() {
    return uniteCotisation;
  }

  public void setUniteCotisation(final UniteCotisation uniteCotisation) {
    this.uniteCotisation = uniteCotisation;
  }

  public Utilisateur getUtilisateur() {
    return utilisateur;
  }

  public void setUtilisateur(final Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
  }

  public String getNumero() {
    return this.numero;
  }

  public void setNumero(final String numero) {
    this.numero = numero;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(final String observations) {
    this.observations = observations;
  }

}