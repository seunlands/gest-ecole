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
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the consommations database table.
 *
 */
@Entity
@Table(name = "consommations")

public class Consommation implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDconso")
  private int id;

  @Temporal(TemporalType.DATE)
  private Date date;

  @Column(name = "date_saisie")
  private Date dateSaisie;

  private String etat;

  private String etiquettes;

  private Integer forfait;

  @Column(name = "heure_debut")
  private String heureDebut;

  @Column(name = "heure_fin")
  private String heureFin;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDcategorie_tarif")
  private CategoriesTarif categorieTarif;

  @ManyToOne
  @JoinColumn(name = "IDcompte_payeur")
  private ComptePayeur comptePayeur;

  @ManyToOne
  @JoinColumn(name = "IDgroupe")
  private Groupe groupe;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  @ManyToOne
  @JoinColumn(name = "IDinscription")
  private Inscription inscription;

  @ManyToOne
  @JoinColumn(name = "IDprestation")
  private Prestation prestation;

  @ManyToOne
  @JoinColumn(name = "IDunite")
  private Unite unite;

  @ManyToOne
  @JoinColumn(name = "IDutilisateur")
  private Utilisateur utilisateur;

  private Integer quantite;

  private int verrouillage;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(final Date date) {
    this.date = date;
  }

  public Date getDateSaisie() {
    return this.dateSaisie;
  }

  public void setDateSaisie(final Date dateSaisie) {
    this.dateSaisie = dateSaisie;
  }

  public String getEtat() {
    return this.etat;
  }

  public void setEtat(final String etat) {
    this.etat = etat;
  }

  public String getEtiquettes() {
    return this.etiquettes;
  }

  public void setEtiquettes(final String etiquettes) {
    this.etiquettes = etiquettes;
  }

  public Integer getForfait() {
    return this.forfait;
  }

  public void setForfait(final Integer forfait) {
    this.forfait = forfait;
  }

  public String getHeureDebut() {
    return this.heureDebut;
  }

  public void setHeureDebut(final String heureDebut) {
    this.heureDebut = heureDebut;
  }

  public String getHeureFin() {
    return this.heureFin;
  }

  public void setHeureFin(final String heureFin) {
    this.heureFin = heureFin;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(final Activite activite) {
    this.activite = activite;
  }

  public CategoriesTarif getCategorieTarif() {
    return categorieTarif;
  }

  public void setCategorieTarif(final CategoriesTarif categorieTarif) {
    this.categorieTarif = categorieTarif;
  }

  public ComptePayeur getComptePayeur() {
    return comptePayeur;
  }

  public void setComptePayeur(final ComptePayeur comptePayeur) {
    this.comptePayeur = comptePayeur;
  }

  public Groupe getGroupe() {
    return groupe;
  }

  public void setGroupe(final Groupe groupe) {
    this.groupe = groupe;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(final Individu individu) {
    this.individu = individu;
  }

  public Inscription getInscription() {
    return inscription;
  }

  public void setInscription(final Inscription inscription) {
    this.inscription = inscription;
  }

  public Prestation getPrestation() {
    return prestation;
  }

  public void setPrestation(final Prestation prestation) {
    this.prestation = prestation;
  }

  public Unite getUnite() {
    return unite;
  }

  public void setUnite(final Unite unite) {
    this.unite = unite;
  }

  public Utilisateur getUtilisateur() {
    return utilisateur;
  }

  public void setUtilisateur(final Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
  }

  public Integer getQuantite() {
    return this.quantite;
  }

  public void setQuantite(final Integer quantite) {
    this.quantite = quantite;
  }

  public int getVerrouillage() {
    return this.verrouillage;
  }

  public void setVerrouillage(final int verrouillage) {
    this.verrouillage = verrouillage;
  }

}