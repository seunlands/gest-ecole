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
 * The persistent class for the pes_pieces database table.
 * 
 */
@Entity
@Table(name = "pes_pieces")

public class PesPiece implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDpiece")
  private int id;

  @ManyToOne
  @JoinColumn(name = "IDfacture")
  private Facture facture;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDlot")
  private PesLot lot;

  @Lob
  private String libelle;

  private double montant;

  private int numero;

  private int prelevement;

  @Column(name = "prelevement_bic")
  private String prelevementBic;

  @Column(name = "prelevement_date_mandat")
  private String prelevementDateMandat;

  @Column(name = "prelevement_iban")
  private String prelevementIban;

  @Column(name = "prelevement_IDmandat")
  private int prelevementIdMandat;

  @Lob
  @Column(name = "prelevement_rum")
  private String prelevementRum;

  @Column(name = "prelevement_sequence")
  private String prelevementSequence;

  @Column(name = "prelevement_statut")
  private String prelevementStatut;

  @Lob
  @Column(name = "prelevement_titulaire")
  private String prelevementTitulaire;

  @Column(name = "titulaire_helios")
  private int titulaireHelios;

  @Lob
  private String type;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Facture getFacture() {
    return facture;
  }

  public void setFacture(Facture facture) {
    this.facture = facture;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(Famille famille) {
    this.famille = famille;
  }

  public PesLot getLot() {
    return lot;
  }

  public void setLot(PesLot lot) {
    this.lot = lot;
  }

  public String getLibelle() {
    return this.libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }

  public double getMontant() {
    return this.montant;
  }

  public void setMontant(double montant) {
    this.montant = montant;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getPrelevement() {
    return this.prelevement;
  }

  public void setPrelevement(int prelevement) {
    this.prelevement = prelevement;
  }

  public String getPrelevementBic() {
    return this.prelevementBic;
  }

  public void setPrelevementBic(String prelevementBic) {
    this.prelevementBic = prelevementBic;
  }

  public String getPrelevementDateMandat() {
    return this.prelevementDateMandat;
  }

  public void setPrelevementDateMandat(String prelevementDateMandat) {
    this.prelevementDateMandat = prelevementDateMandat;
  }

  public String getPrelevementIban() {
    return this.prelevementIban;
  }

  public void setPrelevementIban(String prelevementIban) {
    this.prelevementIban = prelevementIban;
  }

  public int getPrelevementIdMandat() {
    return this.prelevementIdMandat;
  }

  public void setPrelevementIdMandat(int prelevementIdMandat) {
    this.prelevementIdMandat = prelevementIdMandat;
  }

  public String getPrelevementRum() {
    return this.prelevementRum;
  }

  public void setPrelevementRum(String prelevementRum) {
    this.prelevementRum = prelevementRum;
  }

  public String getPrelevementSequence() {
    return this.prelevementSequence;
  }

  public void setPrelevementSequence(String prelevementSequence) {
    this.prelevementSequence = prelevementSequence;
  }

  public String getPrelevementStatut() {
    return this.prelevementStatut;
  }

  public void setPrelevementStatut(String prelevementStatut) {
    this.prelevementStatut = prelevementStatut;
  }

  public String getPrelevementTitulaire() {
    return this.prelevementTitulaire;
  }

  public void setPrelevementTitulaire(String prelevementTitulaire) {
    this.prelevementTitulaire = prelevementTitulaire;
  }

  public int getTitulaireHelios() {
    return this.titulaireHelios;
  }

  public void setTitulaireHelios(int titulaireHelios) {
    this.titulaireHelios = titulaireHelios;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}