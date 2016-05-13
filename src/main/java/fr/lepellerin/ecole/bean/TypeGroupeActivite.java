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
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the types_groupes_activites database table.
 * 
 */
@Entity
@Table(name = "types_groupes_activites")

public class TypeGroupeActivite implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDtype_groupe_activite;

  private String nom;

  @Lob
  private String observations;

  public TypeGroupeActivite() {
  }

  public int getIDtype_groupe_activite() {
    return this.IDtype_groupe_activite;
  }

  public void setIDtype_groupe_activite(int IDtype_groupe_activite) {
    this.IDtype_groupe_activite = IDtype_groupe_activite;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

}