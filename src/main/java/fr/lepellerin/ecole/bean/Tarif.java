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
 * The persistent class for the tarifs database table.
 * 
 */
@Entity
@Table(name = "tarifs")

public class Tarif implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDtarif")
  private int id;

  @Lob
  private String caisses;

  @Lob
  @Column(name = "categories_tarifs")
  private String categoriesTarifs;

  @Column(name = "code_compta")
  private String codeCompta;

  @Column(name = "condition_conso_facturees")
  private Integer conditionConsoFacturees;

  @Column(name = "condition_dates_continues")
  private Integer conditionDatesContinues;

  @Column(name = "condition_nbre_combi")
  private Integer conditionNbreCombi;

  @Column(name = "condition_nbre_jours")
  private Integer conditionNbreJours;

  @Column(name = "condition_periode")
  private String conditionPeriode;

  @Lob
  private String cotisations;

  @Column(name = "date_debut")
  private String dateDebut;

  @Lob
  @Column(name = "date_facturation")
  private String dateFacturation;

  @Column(name = "date_fin")
  private String dateFin;

  @Lob
  private String description;

  private String etats;

  @Lob
  private String etiquettes;

  @Column(name = "forfait_beneficiaire")
  private String forfaitBeneficiaire;

  @Column(name = "forfait_duree")
  private String forfaitDuree;

  @Column(name = "forfait_saisie_auto")
  private Integer forfaitSaisieAuto;

  @Column(name = "forfait_saisie_manuelle")
  private Integer forfaitSaisieManuelle;

  @Column(name = "forfait_suppression_auto")
  private Integer forfaitSuppressionAuto;

  @Lob
  private String groupes;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDcategorie_tarif")
  private CategoriesTarif categorieTarif;

  @ManyToOne
  @JoinColumn(name = "IDnom_tarif")
  private NomTarif nomTarif;

  @Column(name = "jours_scolaires")
  private String joursScolaires;

  @Column(name = "jours_vacances")
  private String joursVacances;

  private String methode;

  @Lob
  private String observations;

  @Lob
  private String options;

  private double tva;

  private String type;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCaisses() {
    return this.caisses;
  }

  public void setCaisses(String caisses) {
    this.caisses = caisses;
  }

  public String getCategoriesTarifs() {
    return this.categoriesTarifs;
  }

  public void setCategoriesTarifs(String categoriesTarifs) {
    this.categoriesTarifs = categoriesTarifs;
  }

  public String getCodeCompta() {
    return this.codeCompta;
  }

  public void setCodeCompta(String codeCompta) {
    this.codeCompta = codeCompta;
  }

  public Integer getConditionConsoFacturees() {
    return this.conditionConsoFacturees;
  }

  public void setConditionConsoFacturees(Integer conditionConsoFacturees) {
    this.conditionConsoFacturees = conditionConsoFacturees;
  }

  public Integer getConditionDatesContinues() {
    return this.conditionDatesContinues;
  }

  public void setConditionDatesContinues(Integer conditionDatesContinues) {
    this.conditionDatesContinues = conditionDatesContinues;
  }

  public Integer getConditionNbreCombi() {
    return this.conditionNbreCombi;
  }

  public void setConditionNbreCombi(Integer conditionNbreCombi) {
    this.conditionNbreCombi = conditionNbreCombi;
  }

  public Integer getConditionNbreJours() {
    return this.conditionNbreJours;
  }

  public void setConditionNbreJours(Integer conditionNbreJours) {
    this.conditionNbreJours = conditionNbreJours;
  }

  public String getConditionPeriode() {
    return this.conditionPeriode;
  }

  public void setConditionPeriode(String conditionPeriode) {
    this.conditionPeriode = conditionPeriode;
  }

  public String getCotisations() {
    return this.cotisations;
  }

  public void setCotisations(String cotisations) {
    this.cotisations = cotisations;
  }

  public String getDateDebut() {
    return this.dateDebut;
  }

  public void setDateDebut(String dateDebut) {
    this.dateDebut = dateDebut;
  }

  public String getDateFacturation() {
    return this.dateFacturation;
  }

  public void setDateFacturation(String dateFacturation) {
    this.dateFacturation = dateFacturation;
  }

  public String getDateFin() {
    return this.dateFin;
  }

  public void setDateFin(String dateFin) {
    this.dateFin = dateFin;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getEtats() {
    return this.etats;
  }

  public void setEtats(String etats) {
    this.etats = etats;
  }

  public String getEtiquettes() {
    return this.etiquettes;
  }

  public void setEtiquettes(String etiquettes) {
    this.etiquettes = etiquettes;
  }

  public String getForfaitBeneficiaire() {
    return this.forfaitBeneficiaire;
  }

  public void setForfaitBeneficiaire(String forfaitBeneficiaire) {
    this.forfaitBeneficiaire = forfaitBeneficiaire;
  }

  public String getForfaitDuree() {
    return this.forfaitDuree;
  }

  public void setForfaitDuree(String forfaitDuree) {
    this.forfaitDuree = forfaitDuree;
  }

  public Integer getForfaitSaisieAuto() {
    return this.forfaitSaisieAuto;
  }

  public void setForfaitSaisieAuto(Integer forfaitSaisieAuto) {
    this.forfaitSaisieAuto = forfaitSaisieAuto;
  }

  public Integer getForfaitSaisieManuelle() {
    return this.forfaitSaisieManuelle;
  }

  public void setForfaitSaisieManuelle(Integer forfaitSaisieManuelle) {
    this.forfaitSaisieManuelle = forfaitSaisieManuelle;
  }

  public Integer getForfaitSuppressionAuto() {
    return this.forfaitSuppressionAuto;
  }

  public void setForfaitSuppressionAuto(Integer forfaitSuppressionAuto) {
    this.forfaitSuppressionAuto = forfaitSuppressionAuto;
  }

  public String getGroupes() {
    return this.groupes;
  }

  public void setGroupes(String groupes) {
    this.groupes = groupes;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public CategoriesTarif getCategorieTarif() {
    return categorieTarif;
  }

  public void setCategorieTarif(CategoriesTarif categorieTarif) {
    this.categorieTarif = categorieTarif;
  }

  public NomTarif getNomTarif() {
    return nomTarif;
  }

  public void setNomTarif(NomTarif nomTarif) {
    this.nomTarif = nomTarif;
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

  public String getMethode() {
    return this.methode;
  }

  public void setMethode(String methode) {
    this.methode = methode;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

  public String getOptions() {
    return this.options;
  }

  public void setOptions(String options) {
    this.options = options;
  }

  public double getTva() {
    return this.tva;
  }

  public void setTva(double tva) {
    this.tva = tva;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}