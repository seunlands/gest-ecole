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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the responsables_activite database table.
 * 
 */
@Entity
@Table(name = "responsables_activite")

public class ResponsablesActivite implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDresponsable;

  private int defaut;

  private String fonction;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  private String nom;

  private String sexe;

  public ResponsablesActivite() {
  }

  public int getIDresponsable() {
    return this.IDresponsable;
  }

  public void setIDresponsable(int IDresponsable) {
    this.IDresponsable = IDresponsable;
  }

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(int defaut) {
    this.defaut = defaut;
  }

  public String getFonction() {
    return this.fonction;
  }

  public void setFonction(String fonction) {
    this.fonction = fonction;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getSexe() {
    return this.sexe;
  }

  public void setSexe(String sexe) {
    this.sexe = sexe;
  }

}