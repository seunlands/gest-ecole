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
 * The persistent class for the prelevements database table.
 * 
 */
@Entity
@Table(name = "prelevements")

public class Prelevement implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDprelevement")
  private int id;

  @ManyToOne
  @JoinColumn(name = "IDfacture")
  private Facture facture;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  private int idLot;

  @ManyToOne
  @JoinColumn(name = "IDmandat")
  private Mandat mandat;

  @Lob
  private String libelle;

  private double montant;

  @Column(name = "prelevement_banque")
  private int prelevementBanque;

  @Column(name = "prelevement_bic")
  private String prelevementBic;

  @Column(name = "prelevement_cle")
  private String prelevementCle;

  @Column(name = "prelevement_date_mandat")
  private String prelevementDateMandat;

  @Column(name = "prelevement_etab")
  private String prelevementEtab;

  @Column(name = "prelevement_guichet")
  private String prelevementGuichet;

  @Column(name = "prelevement_iban")
  private String prelevementIban;

  @Column(name = "prelevement_numero")
  private String prelevementNumero;

  @Lob
  @Column(name = "prelevement_reference_mandat")
  private String prelevementReferenceMandat;

  private String sequence;

  private String statut;

  @Lob
  private String titulaire;

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

  public int getIdLot() {
    return this.idLot;
  }

  public void setIdLot(int idLot) {
    this.idLot = idLot;
  }

  public Mandat getMandat() {
    return mandat;
  }

  public void setMandat(Mandat mandat) {
    this.mandat = mandat;
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

  public int getPrelevementBanque() {
    return this.prelevementBanque;
  }

  public void setPrelevementBanque(int prelevementBanque) {
    this.prelevementBanque = prelevementBanque;
  }

  public String getPrelevementBic() {
    return this.prelevementBic;
  }

  public void setPrelevementBic(String prelevementBic) {
    this.prelevementBic = prelevementBic;
  }

  public String getPrelevementCle() {
    return this.prelevementCle;
  }

  public void setPrelevementCle(String prelevementCle) {
    this.prelevementCle = prelevementCle;
  }

  public String getPrelevementDateMandat() {
    return this.prelevementDateMandat;
  }

  public void setPrelevementDateMandat(String prelevementDateMandat) {
    this.prelevementDateMandat = prelevementDateMandat;
  }

  public String getPrelevementEtab() {
    return this.prelevementEtab;
  }

  public void setPrelevementEtab(String prelevementEtab) {
    this.prelevementEtab = prelevementEtab;
  }

  public String getPrelevementGuichet() {
    return this.prelevementGuichet;
  }

  public void setPrelevementGuichet(String prelevementGuichet) {
    this.prelevementGuichet = prelevementGuichet;
  }

  public String getPrelevementIban() {
    return this.prelevementIban;
  }

  public void setPrelevementIban(String prelevementIban) {
    this.prelevementIban = prelevementIban;
  }

  public String getPrelevementNumero() {
    return this.prelevementNumero;
  }

  public void setPrelevementNumero(String prelevementNumero) {
    this.prelevementNumero = prelevementNumero;
  }

  public String getPrelevementReferenceMandat() {
    return this.prelevementReferenceMandat;
  }

  public void setPrelevementReferenceMandat(String prelevementReferenceMandat) {
    this.prelevementReferenceMandat = prelevementReferenceMandat;
  }

  public String getSequence() {
    return this.sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  public String getStatut() {
    return this.statut;
  }

  public void setStatut(String statut) {
    this.statut = statut;
  }

  public String getTitulaire() {
    return this.titulaire;
  }

  public void setTitulaire(String titulaire) {
    this.titulaire = titulaire;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}