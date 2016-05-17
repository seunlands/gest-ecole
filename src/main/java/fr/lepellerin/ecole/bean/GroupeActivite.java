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
 * The persistent class for the groupes_activites database table.
 * 
 */
@Entity
@Table(name = "groupes_activites")

public class GroupeActivite implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDgroupe_activite;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDtype_groupe_activite")
  private TypeGroupeActivite typeGroupeActivite;

  public GroupeActivite() {
  }

  public int getIDgroupe_activite() {
    return this.IDgroupe_activite;
  }

  public void setIDgroupe_activite(int IDgroupe_activite) {
    this.IDgroupe_activite = IDgroupe_activite;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public TypeGroupeActivite getTypeGroupeActivite() {
    return typeGroupeActivite;
  }

  public void setTypeGroupeActivite(TypeGroupeActivite typeGroupeActivite) {
    this.typeGroupeActivite = typeGroupeActivite;
  }

}