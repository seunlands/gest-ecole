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
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the activites database table.
 * 
 */
@Entity
@Table(name = "activites")

public class Activite implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDactivite")
  private int id;

  private String abrege;

  @Lob
  @Column(name = "code_comptable")
  private String codeComptable;

  @Column(name = "coords_org")
  private int coordsOrg;

  private String cp;

  @Column(name = "date_creation")
  private String dateCreation;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  private String fax;

  @Lob
  private byte[] logo;

  @Column(name = "logo_org")
  private int logoOrg;

  private String mail;

  @Column(name = "nbre_inscrits_max")
  private Integer nbreInscritsMax;

  private String nom;

  @Column(name = "psu_activation")
  private Integer psuActivation;

  @Column(name = "psu_etiquette_rtt")
  private Integer psuEtiquetteRtt;

  @Column(name = "psu_tarif_forfait")
  private Integer psuTarifForfait;

  @Column(name = "psu_unite_presence")
  private Integer psuUnitePresence;

  @Column(name = "psu_unite_prevision")
  private Integer psuUnitePrevision;

  @Column(name = "public")
  private String publique;

  private String rue;

  private String site;

  private String tel;

  @Column(name = "vaccins_obligatoires")
  private Integer vaccinsObligatoires;

  private String ville;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getAbrege() {
    return this.abrege;
  }

  public void setAbrege(String abrege) {
    this.abrege = abrege;
  }

  public String getCodeComptable() {
    return this.codeComptable;
  }

  public void setCodeComptable(String codeComptable) {
    this.codeComptable = codeComptable;
  }

  public int getCoordsOrg() {
    return this.coordsOrg;
  }

  public void setCoordsOrg(int coordsOrg) {
    this.coordsOrg = coordsOrg;
  }

  public String getCp() {
    return this.cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public String getDateCreation() {
    return this.dateCreation;
  }

  public void setDateCreation(String dateCreation) {
    this.dateCreation = dateCreation;
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

  public String getFax() {
    return this.fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public byte[] getLogo() {
    return this.logo;
  }

  public void setLogo(byte[] logo) {
    this.logo = logo;
  }

  public int getLogoOrg() {
    return this.logoOrg;
  }

  public void setLogoOrg(int logoOrg) {
    this.logoOrg = logoOrg;
  }

  public String getMail() {
    return this.mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public Integer getNbreInscritsMax() {
    return this.nbreInscritsMax;
  }

  public void setNbreInscritsMax(Integer nbreInscritsMax) {
    this.nbreInscritsMax = nbreInscritsMax;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public Integer getPsuActivation() {
    return this.psuActivation;
  }

  public void setPsuActivation(Integer psuActivation) {
    this.psuActivation = psuActivation;
  }

  public Integer getPsuEtiquetteRtt() {
    return this.psuEtiquetteRtt;
  }

  public void setPsuEtiquetteRtt(Integer psuEtiquetteRtt) {
    this.psuEtiquetteRtt = psuEtiquetteRtt;
  }

  public Integer getPsuTarifForfait() {
    return this.psuTarifForfait;
  }

  public void setPsuTarifForfait(Integer psuTarifForfait) {
    this.psuTarifForfait = psuTarifForfait;
  }

  public Integer getPsuUnitePresence() {
    return this.psuUnitePresence;
  }

  public void setPsuUnitePresence(Integer psuUnitePresence) {
    this.psuUnitePresence = psuUnitePresence;
  }

  public Integer getPsuUnitePrevision() {
    return this.psuUnitePrevision;
  }

  public void setPsuUnitePrevision(Integer psuUnitePrevision) {
    this.psuUnitePrevision = psuUnitePrevision;
  }

  public String getPublique() {
    return this.publique;
  }

  public void setPublique(String publique) {
    this.publique = publique;
  }

  public String getRue() {
    return this.rue;
  }

  public void setRue(String rue) {
    this.rue = rue;
  }

  public String getSite() {
    return this.site;
  }

  public void setSite(String site) {
    this.site = site;
  }

  public String getTel() {
    return this.tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public Integer getVaccinsObligatoires() {
    return this.vaccinsObligatoires;
  }

  public void setVaccinsObligatoires(Integer vaccinsObligatoires) {
    this.vaccinsObligatoires = vaccinsObligatoires;
  }

  public String getVille() {
    return this.ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

}