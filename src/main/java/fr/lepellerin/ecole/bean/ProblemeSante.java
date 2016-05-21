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
 * The persistent class for the problemes_sante database table.
 * 
 */
@Entity
@Table(name = "problemes_sante")

public class ProblemeSante implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDprobleme;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_debut_eviction")
  private String dateDebutEviction;

  @Column(name = "date_debut_traitement")
  private String dateDebutTraitement;

  @Column(name = "date_fin")
  private String dateFin;

  @Column(name = "date_fin_eviction")
  private String dateFinEviction;

  @Column(name = "date_fin_traitement")
  private String dateFinTraitement;

  @Lob
  private String description;

  @Lob
  @Column(name = "description_traitement")
  private String descriptionTraitement;

  @Column(name = "diffusion_listing_conso")
  private int diffusionListingConso;

  @Column(name = "diffusion_listing_enfants")
  private int diffusionListingEnfants;

  @Column(name = "diffusion_listing_repas")
  private int diffusionListingRepas;

  private int eviction;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  private int IDtype;

  private String intitule;

  @Column(name = "traitement_medical")
  private int traitementMedical;

  public ProblemeSante() {
  }

  public int getIDprobleme() {
    return this.IDprobleme;
  }

  public void setIDprobleme(int IDprobleme) {
    this.IDprobleme = IDprobleme;
  }

  public String getDateDebut() {
    return this.dateDebut;
  }

  public void setDateDebut(String dateDebut) {
    this.dateDebut = dateDebut;
  }

  public String getDateDebutEviction() {
    return this.dateDebutEviction;
  }

  public void setDateDebutEviction(String dateDebutEviction) {
    this.dateDebutEviction = dateDebutEviction;
  }

  public String getDateDebutTraitement() {
    return this.dateDebutTraitement;
  }

  public void setDateDebutTraitement(String dateDebutTraitement) {
    this.dateDebutTraitement = dateDebutTraitement;
  }

  public String getDateFin() {
    return this.dateFin;
  }

  public void setDateFin(String dateFin) {
    this.dateFin = dateFin;
  }

  public String getDateFinEviction() {
    return this.dateFinEviction;
  }

  public void setDateFinEviction(String dateFinEviction) {
    this.dateFinEviction = dateFinEviction;
  }

  public String getDateFinTraitement() {
    return this.dateFinTraitement;
  }

  public void setDateFinTraitement(String dateFinTraitement) {
    this.dateFinTraitement = dateFinTraitement;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getDescriptionTraitement() {
    return this.descriptionTraitement;
  }

  public void setDescriptionTraitement(String descriptionTraitement) {
    this.descriptionTraitement = descriptionTraitement;
  }

  public int getDiffusionListingConso() {
    return this.diffusionListingConso;
  }

  public void setDiffusionListingConso(int diffusionListingConso) {
    this.diffusionListingConso = diffusionListingConso;
  }

  public int getDiffusionListingEnfants() {
    return this.diffusionListingEnfants;
  }

  public void setDiffusionListingEnfants(int diffusionListingEnfants) {
    this.diffusionListingEnfants = diffusionListingEnfants;
  }

  public int getDiffusionListingRepas() {
    return this.diffusionListingRepas;
  }

  public void setDiffusionListingRepas(int diffusionListingRepas) {
    this.diffusionListingRepas = diffusionListingRepas;
  }

  public int getEviction() {
    return this.eviction;
  }

  public void setEviction(int eviction) {
    this.eviction = eviction;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

  public int getIDtype() {
    return this.IDtype;
  }

  public void setIDtype(int IDtype) {
    this.IDtype = IDtype;
  }

  public String getIntitule() {
    return this.intitule;
  }

  public void setIntitule(String intitule) {
    this.intitule = intitule;
  }

  public int getTraitementMedical() {
    return this.traitementMedical;
  }

  public void setTraitementMedical(int traitementMedical) {
    this.traitementMedical = traitementMedical;
  }

}