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
 * The persistent class for the messages database table.
 * 
 */
@Entity
@Table(name = "messages")

public class Message implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDmemo")
  private int id;

  @Column(name = "afficher_accueil")
  private int afficherAccueil;

  @Column(name = "afficher_facture")
  private int afficherFacture;

  @Column(name = "afficher_liste")
  private int afficherListe;

  @Column(name = "date_parution")
  private String dateParution;

  @Column(name = "date_saisie")
  private String dateSaisie;

  @ManyToOne
  @JoinColumn(name = "IDcategorie")
  private MessageCategorie categorie;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  @ManyToOne
  @JoinColumn(name = "IDutilisateur")
  private Utilisateur utilisateur;

  private String nom;

  private String priorite;

  private int rappel;

  @Lob
  private String texte;

  private String type;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getAfficherAccueil() {
    return this.afficherAccueil;
  }

  public void setAfficherAccueil(int afficherAccueil) {
    this.afficherAccueil = afficherAccueil;
  }

  public int getAfficherFacture() {
    return this.afficherFacture;
  }

  public void setAfficherFacture(int afficherFacture) {
    this.afficherFacture = afficherFacture;
  }

  public int getAfficherListe() {
    return this.afficherListe;
  }

  public void setAfficherListe(int afficherListe) {
    this.afficherListe = afficherListe;
  }

  public String getDateParution() {
    return this.dateParution;
  }

  public void setDateParution(String dateParution) {
    this.dateParution = dateParution;
  }

  public String getDateSaisie() {
    return this.dateSaisie;
  }

  public void setDateSaisie(String dateSaisie) {
    this.dateSaisie = dateSaisie;
  }

  public MessageCategorie getCategorie() {
    return categorie;
  }

  public void setCategorie(MessageCategorie categorie) {
    this.categorie = categorie;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(Famille famille) {
    this.famille = famille;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

  public Utilisateur getUtilisateur() {
    return utilisateur;
  }

  public void setUtilisateur(Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPriorite() {
    return this.priorite;
  }

  public void setPriorite(String priorite) {
    this.priorite = priorite;
  }

  public int getRappel() {
    return this.rappel;
  }

  public void setRappel(int rappel) {
    this.rappel = rappel;
  }

  public String getTexte() {
    return this.texte;
  }

  public void setTexte(String texte) {
    this.texte = texte;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}