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
 * The persistent class for the individus database table.
 *
 */
@Table(name = "individus")
@Entity

public class Individu implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDindividu")
  private int id;

  @Column(name = "adresse_auto")
  private Integer adresseAuto;

  @Column(name = "annee_deces")
  private Integer anneeDeces;

  @Column(name = "cp_naiss")
  private String cpNaiss;

  @Column(name = "cp_resid")
  private String cpResid;

  @Column(name = "date_creation")
  private String dateCreation;

  @Column(name = "date_naiss")
  private String dateNaiss;

  private Integer deces;

  private String employeur;

  @ManyToOne
  @JoinColumn(name = "IDcategorie_travail")
  private CategoriesTravail categorieTravail;

  @Column(name = "IDcivilite")
  private int idCivilite;

  @ManyToOne
  @JoinColumn(name = "IDmedecin")
  private Medecin medecin;

  @Column(name = "IDnationalite")
  private int idNationalite;

  @Column(name = "IDpays_naiss")
  private int idPaysNaiss;

  @ManyToOne
  @JoinColumn(name = "IDsecteur")
  private Secteur secteur;

  @ManyToOne
  @JoinColumn(name = "IDtype_sieste")
  private TypeSieste typeSieste;

  private String mail;

  @Lob
  private String memo;

  private String nom;

  @Column(name = "nom_jfille")
  private String nomJfille;

  @Column(name = "num_secu")
  private String numSecu;

  private String prenom;

  private String profession;

  @Column(name = "rue_resid")
  private String rueResid;

  @Column(name = "tel_domicile")
  private String telDomicile;

  @Column(name = "tel_fax")
  private String telFax;

  @Column(name = "tel_mobile")
  private String telMobile;

  @Column(name = "travail_fax")
  private String travailFax;

  @Column(name = "travail_mail")
  private String travailMail;

  @Column(name = "travail_tel")
  private String travailTel;

  @Column(name = "ville_naiss")
  private String villeNaiss;

  @Column(name = "ville_resid")
  private String villeResid;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public Integer getAdresseAuto() {
    return this.adresseAuto;
  }

  public void setAdresseAuto(final Integer adresseAuto) {
    this.adresseAuto = adresseAuto;
  }

  public Integer getAnneeDeces() {
    return this.anneeDeces;
  }

  public void setAnneeDeces(final Integer anneeDeces) {
    this.anneeDeces = anneeDeces;
  }

  public String getCpNaiss() {
    return this.cpNaiss;
  }

  public void setCpNaiss(final String cpNaiss) {
    this.cpNaiss = cpNaiss;
  }

  public String getCpResid() {
    return this.cpResid;
  }

  public void setCpResid(final String cpResid) {
    this.cpResid = cpResid;
  }

  public String getDateCreation() {
    return this.dateCreation;
  }

  public void setDateCreation(final String dateCreation) {
    this.dateCreation = dateCreation;
  }

  public String getDateNaiss() {
    return this.dateNaiss;
  }

  public void setDateNaiss(final String dateNaiss) {
    this.dateNaiss = dateNaiss;
  }

  public Integer getDeces() {
    return this.deces;
  }

  public void setDeces(final Integer deces) {
    this.deces = deces;
  }

  public String getEmployeur() {
    return this.employeur;
  }

  public void setEmployeur(final String employeur) {
    this.employeur = employeur;
  }

  public CategoriesTravail getCategorieTravail() {
    return categorieTravail;
  }

  public void setCategorieTravail(final CategoriesTravail categorieTravail) {
    this.categorieTravail = categorieTravail;
  }

  public int getIdCivilite() {
    return this.idCivilite;
  }

  public void setIdCivilite(final int idCivilite) {
    this.idCivilite = idCivilite;
  }

  public Medecin getMedecin() {
    return medecin;
  }

  public void setMedecin(final Medecin medecin) {
    this.medecin = medecin;
  }

  public int getIdNationalite() {
    return this.idNationalite;
  }

  public void setIdNationalite(final int idNationalite) {
    this.idNationalite = idNationalite;
  }

  public int getIdPaysNaiss() {
    return this.idPaysNaiss;
  }

  public void setIdPaysNaiss(final int idPaysNaiss) {
    this.idPaysNaiss = idPaysNaiss;
  }

  public Secteur getSecteur() {
    return secteur;
  }

  public void setSecteur(final Secteur secteur) {
    this.secteur = secteur;
  }

  public TypeSieste getTypeSieste() {
    return typeSieste;
  }

  public void setTypeSieste(final TypeSieste typeSieste) {
    this.typeSieste = typeSieste;
  }

  public String getMail() {
    return this.mail;
  }

  public void setMail(final String mail) {
    this.mail = mail;
  }

  public String getMemo() {
    return this.memo;
  }

  public void setMemo(final String memo) {
    this.memo = memo;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(final String nom) {
    this.nom = nom;
  }

  public String getNomJfille() {
    return this.nomJfille;
  }

  public void setNomJfille(final String nomJfille) {
    this.nomJfille = nomJfille;
  }

  public String getNumSecu() {
    return this.numSecu;
  }

  public void setNumSecu(final String numSecu) {
    this.numSecu = numSecu;
  }

  public String getPrenom() {
    return this.prenom;
  }

  public void setPrenom(final String prenom) {
    this.prenom = prenom;
  }

  public String getProfession() {
    return this.profession;
  }

  public void setProfession(final String profession) {
    this.profession = profession;
  }

  public String getRueResid() {
    return this.rueResid;
  }

  public void setRueResid(final String rueResid) {
    this.rueResid = rueResid;
  }

  public String getTelDomicile() {
    return this.telDomicile;
  }

  public void setTelDomicile(final String telDomicile) {
    this.telDomicile = telDomicile;
  }

  public String getTelFax() {
    return this.telFax;
  }

  public void setTelFax(final String telFax) {
    this.telFax = telFax;
  }

  public String getTelMobile() {
    return this.telMobile;
  }

  public void setTelMobile(final String telMobile) {
    this.telMobile = telMobile;
  }

  public String getTravailFax() {
    return this.travailFax;
  }

  public void setTravailFax(final String travailFax) {
    this.travailFax = travailFax;
  }

  public String getTravailMail() {
    return this.travailMail;
  }

  public void setTravailMail(final String travailMail) {
    this.travailMail = travailMail;
  }

  public String getTravailTel() {
    return this.travailTel;
  }

  public void setTravailTel(final String travailTel) {
    this.travailTel = travailTel;
  }

  public String getVilleNaiss() {
    return this.villeNaiss;
  }

  public void setVilleNaiss(final String villeNaiss) {
    this.villeNaiss = villeNaiss;
  }

  public String getVilleResid() {
    return this.villeResid;
  }

  public void setVilleResid(final String villeResid) {
    this.villeResid = villeResid;
  }

}
