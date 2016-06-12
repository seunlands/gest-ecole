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
 * The persistent class for the droits database table.
 *
 */
@Entity
@Table(name = "droits")

public class Droit implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDdroit")
  private int id;

  private String action;

  private String categorie;

  @Lob
  private String etat;

  @ManyToOne
  @JoinColumn(name = "IDmodele")
  private ModeleDroit modele;

  @ManyToOne
  @JoinColumn(name = "IDutilisateur")
  private Utilisateur utilisateur;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getAction() {
    return this.action;
  }

  public void setAction(final String action) {
    this.action = action;
  }

  public String getCategorie() {
    return this.categorie;
  }

  public void setCategorie(final String categorie) {
    this.categorie = categorie;
  }

  public String getEtat() {
    return this.etat;
  }

  public void setEtat(final String etat) {
    this.etat = etat;
  }

  public ModeleDroit getModele() {
    return modele;
  }

  public void setModele(final ModeleDroit modele) {
    this.modele = modele;
  }

  public Utilisateur getIDutilisateur() {
    return this.utilisateur;
  }

  public void setIDutilisateur(final Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
  }

}