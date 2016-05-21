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
 * The persistent class for the cotisations database table.
 * 
 */
@Entity
@Table(name = "cotisations")

public class Cotisation implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDcotisation;

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
  private TypeCotisation type_cotisation;

  @ManyToOne
  @JoinColumn(name = "IDunite_cotisation")
  private UniteCotisation unite_cotisation;

  @ManyToOne
  @JoinColumn(name = "IDutilisateur")
  private Utilisateur utilisateur;

  private String numero;

  @Lob
  private String observations;

  public Cotisation() {
  }

  public int getIDcotisation() {
    return this.IDcotisation;
  }

  public void setIDcotisation(int IDcotisation) {
    this.IDcotisation = IDcotisation;
  }

  public String getActivites() {
    return this.activites;
  }

  public void setActivites(String activites) {
    this.activites = activites;
  }

  public String getDateCreationCarte() {
    return this.dateCreationCarte;
  }

  public void setDateCreationCarte(String dateCreationCarte) {
    this.dateCreationCarte = dateCreationCarte;
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

  public String getDateSaisie() {
    return this.dateSaisie;
  }

  public void setDateSaisie(String dateSaisie) {
    this.dateSaisie = dateSaisie;
  }

  public DepotCotisation getDepotCotisation() {
    return depotCotisation;
  }

  public void setDepotCotisation(DepotCotisation depotCotisation) {
    this.depotCotisation = depotCotisation;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(Famille famille) {
    this.famille = famille;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

  public Prestation getPrestation() {
    return prestation;
  }

  public void setPrestation(Prestation prestation) {
    this.prestation = prestation;
  }

  public TypeCotisation getType_cotisation() {
    return type_cotisation;
  }

  public void setType_cotisation(TypeCotisation type_cotisation) {
    this.type_cotisation = type_cotisation;
  }

  public UniteCotisation getUnite_cotisation() {
    return unite_cotisation;
  }

  public void setUnite_cotisation(UniteCotisation unite_cotisation) {
    this.unite_cotisation = unite_cotisation;
  }

  public Utilisateur getUtilisateur() {
    return utilisateur;
  }

  public void setUtilisateur(Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
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

}