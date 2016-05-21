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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the etiquettes database table.
 * 
 */
@Entity
@Table(name = "etiquettes")

public class Etiquette implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDetiquette;

  private int active;

  private String couleur;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @Lob
  private String label;

  private int ordre;

  private int parent;

  public Etiquette() {
  }

  public int getIDetiquette() {
    return this.IDetiquette;
  }

  public void setIDetiquette(int IDetiquette) {
    this.IDetiquette = IDetiquette;
  }

  public int getActive() {
    return this.active;
  }

  public void setActive(int active) {
    this.active = active;
  }

  public String getCouleur() {
    return this.couleur;
  }

  public void setCouleur(String couleur) {
    this.couleur = couleur;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public int getOrdre() {
    return this.ordre;
  }

  public void setOrdre(int ordre) {
    this.ordre = ordre;
  }

  public int getParent() {
    return this.parent;
  }

  public void setParent(int parent) {
    this.parent = parent;
  }

}