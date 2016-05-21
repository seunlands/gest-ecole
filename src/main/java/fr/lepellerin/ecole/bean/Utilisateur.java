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

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the utilisateurs database table.
 * 
 */
@Entity
@Table(name = "utilisateurs")

public class Utilisateur implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDutilisateur;

  private int actif;

  private String image;

  private String mdp;

  private String nom;

  private String prenom;

  private String profil;

  private String sexe;

  public Utilisateur() {
  }

  public int getIDutilisateur() {
    return this.IDutilisateur;
  }

  public void setIDutilisateur(int IDutilisateur) {
    this.IDutilisateur = IDutilisateur;
  }

  public int getActif() {
    return this.actif;
  }

  public void setActif(int actif) {
    this.actif = actif;
  }

  public String getImage() {
    return this.image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getMdp() {
    return this.mdp;
  }

  public void setMdp(String mdp) {
    this.mdp = mdp;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return this.prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getProfil() {
    return this.profil;
  }

  public void setProfil(String profil) {
    this.profil = profil;
  }

  public String getSexe() {
    return this.sexe;
  }

  public void setSexe(String sexe) {
    this.sexe = sexe;
  }

}