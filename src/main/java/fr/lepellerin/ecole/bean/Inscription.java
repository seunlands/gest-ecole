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
 * The persistent class for the inscriptions database table.
 *
 */
@Entity
@Table(name = "inscriptions")

public class Inscription implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDinscription")
  private int id;

  @Column(name = "date_inscription")
  private String dateInscription;

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
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDgroupe")
  private Groupe groupe;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  private int parti;

  public int getIDinscription() {
    return this.id;
  }

  public void setIDinscription(final int id) {
    this.id = id;
  }

  public String getDateInscription() {
    return this.dateInscription;
  }

  public void setDateInscription(final String dateInscription) {
    this.dateInscription = dateInscription;
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

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(final Famille famille) {
    this.famille = famille;
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

  public int getParti() {
    return this.parti;
  }

  public void setParti(final int parti) {
    this.parti = parti;
  }

}