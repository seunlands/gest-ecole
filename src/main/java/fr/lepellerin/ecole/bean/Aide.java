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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the aides database table.
 *
 */
@Entity
@Table(name = "aides")

public class Aide implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDaide")
  private int id;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDcaisse")
  private Caisse caisse;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @Column(name = "montant_max")
  private double montantMax;

  @Column(name = "nbre_dates_max")
  private int nbreDatesMax;

  private String nom;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
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

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(final Activite activite) {
    this.activite = activite;
  }

  public Caisse getCaisse() {
    return caisse;
  }

  public void setCaisse(final Caisse caisse) {
    this.caisse = caisse;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(final Famille famille) {
    this.famille = famille;
  }

  public double getMontantMax() {
    return this.montantMax;
  }

  public void setMontantMax(final double montantMax) {
    this.montantMax = montantMax;
  }

  public int getNbreDatesMax() {
    return this.nbreDatesMax;
  }

  public void setNbreDatesMax(final int nbreDatesMax) {
    this.nbreDatesMax = nbreDatesMax;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(final String nom) {
    this.nom = nom;
  }

}