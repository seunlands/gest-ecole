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
 * The persistent class for the attestations database table.
 *
 */
@Entity
@Table(name = "attestations")
public class Attestation implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDattestation")
  private int id;

  @Lob
  private String activites;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_edition")
  private String dateEdition;

  @Column(name = "date_fin")
  private String dateFin;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDutilisateur")
  private Utilisateur utilisateur;

  @Lob
  private String individus;

  private int numero;

  private double regle;

  private double solde;

  private double total;

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

  public String getDateDebut() {
    return this.dateDebut;
  }

  public void setDateDebut(final String dateDebut) {
    this.dateDebut = dateDebut;
  }

  public String getDateEdition() {
    return this.dateEdition;
  }

  public void setDateEdition(final String dateEdition) {
    this.dateEdition = dateEdition;
  }

  public String getDateFin() {
    return this.dateFin;
  }

  public void setDateFin(final String dateFin) {
    this.dateFin = dateFin;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(final Famille famille) {
    this.famille = famille;
  }

  public Utilisateur getUtilisateur() {
    return utilisateur;
  }

  public void setUtilisateur(final Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
  }

  public String getIndividus() {
    return this.individus;
  }

  public void setIndividus(final String individus) {
    this.individus = individus;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(final int numero) {
    this.numero = numero;
  }

  public double getRegle() {
    return this.regle;
  }

  public void setRegle(final double regle) {
    this.regle = regle;
  }

  public double getSolde() {
    return this.solde;
  }

  public void setSolde(final double solde) {
    this.solde = solde;
  }

  public double getTotal() {
    return this.total;
  }

  public void setTotal(final double total) {
    this.total = total;
  }

}