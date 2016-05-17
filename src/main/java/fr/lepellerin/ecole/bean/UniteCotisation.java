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
 * The persistent class for the unites_cotisations database table.
 * 
 */
@Entity
@Table(name = "unites_cotisations")

public class UniteCotisation implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDunite_cotisation;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  private int defaut;

  @ManyToOne
  @JoinColumn(name = "IDtype_cotisation")
  private TypeCotisation typeCotisation;

  @Column(name = "label_prestation")
  private String labelPrestation;

  private double montant;

  private String nom;

  public UniteCotisation() {
  }

  public int getIDunite_cotisation() {
    return this.IDunite_cotisation;
  }

  public void setIDunite_cotisation(int IDunite_cotisation) {
    this.IDunite_cotisation = IDunite_cotisation;
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

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(int defaut) {
    this.defaut = defaut;
  }

  public TypeCotisation getTypeCotisation() {
    return typeCotisation;
  }

  public void setTypeCotisation(TypeCotisation typeCotisation) {
    this.typeCotisation = typeCotisation;
  }

  public String getLabelPrestation() {
    return this.labelPrestation;
  }

  public void setLabelPrestation(String labelPrestation) {
    this.labelPrestation = labelPrestation;
  }

  public double getMontant() {
    return this.montant;
  }

  public void setMontant(double montant) {
    this.montant = montant;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}