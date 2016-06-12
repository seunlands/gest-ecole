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
 * The persistent class for the compta_operations database table.
 *
 */
@Entity
@Table(name = "compta_operations")

public class ComptaOperation implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDoperation")
  private int id;

  private String date;

  @ManyToOne
  @JoinColumn(name = "IDcompte_bancaire")
  private CompteBancaire compteBancaire;

  @ManyToOne
  @JoinColumn(name = "IDmode")
  private ModeReglement mode;

  @ManyToOne
  @JoinColumn(name = "IDreleve")
  private ComptaReleve releve;

  @ManyToOne
  @JoinColumn(name = "IDtiers")
  private ComptaTier tiers;

  @ManyToOne
  @JoinColumn(name = "IDvirement")
  private ComptaVirement virement;

  @Lob
  private String libelle;

  private double montant;

  @Column(name = "num_piece")
  private String numPiece;

  @Lob
  private String observations;

  @Column(name = "ref_piece")
  private String refPiece;

  private String type;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(final String date) {
    this.date = date;
  }

  public CompteBancaire getCompteBancaire() {
    return compteBancaire;
  }

  public void setCompteBancaire(final CompteBancaire compteBancaire) {
    this.compteBancaire = compteBancaire;
  }

  public ModeReglement getMode() {
    return mode;
  }

  public void setMode(final ModeReglement mode) {
    this.mode = mode;
  }

  public ComptaReleve getReleve() {
    return releve;
  }

  public void setReleve(final ComptaReleve releve) {
    this.releve = releve;
  }

  public ComptaTier getTiers() {
    return tiers;
  }

  public void setTiers(final ComptaTier tiers) {
    this.tiers = tiers;
  }

  public ComptaVirement getVirement() {
    return virement;
  }

  public void setVirement(final ComptaVirement virement) {
    this.virement = virement;
  }

  public String getLibelle() {
    return this.libelle;
  }

  public void setLibelle(final String libelle) {
    this.libelle = libelle;
  }

  public double getMontant() {
    return this.montant;
  }

  public void setMontant(final double montant) {
    this.montant = montant;
  }

  public String getNumPiece() {
    return this.numPiece;
  }

  public void setNumPiece(final String numPiece) {
    this.numPiece = numPiece;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(final String observations) {
    this.observations = observations;
  }

  public String getRefPiece() {
    return this.refPiece;
  }

  public void setRefPiece(final String refPiece) {
    this.refPiece = refPiece;
  }

  public String getType() {
    return this.type;
  }

  public void setType(final String type) {
    this.type = type;
  }

}