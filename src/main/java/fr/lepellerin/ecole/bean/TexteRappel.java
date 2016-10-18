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
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the textes_rappels database table.
 * 
 */
@Entity
@Table(name = "textes_rappels")

public class TexteRappel implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDtexte")
  private int id;

  private String couleur;

  private String label;

  @Column(name = "retard_max")
  private int retardMax;

  @Column(name = "retard_min")
  private int retardMin;

  @Lob
  @Column(name = "texte_pdf")
  private String textePdf;

  @Lob
  @Column(name = "texte_xml")
  private String texteXml;

  private String titre;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getCouleur() {
    return this.couleur;
  }

  public void setCouleur(String couleur) {
    this.couleur = couleur;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public int getRetardMax() {
    return this.retardMax;
  }

  public void setRetardMax(int retardMax) {
    this.retardMax = retardMax;
  }

  public int getRetardMin() {
    return this.retardMin;
  }

  public void setRetardMin(int retardMin) {
    this.retardMin = retardMin;
  }

  public String getTextePdf() {
    return this.textePdf;
  }

  public void setTextePdf(String textePdf) {
    this.textePdf = textePdf;
  }

  public String getTexteXml() {
    return this.texteXml;
  }

  public void setTexteXml(String texteXml) {
    this.texteXml = texteXml;
  }

  public String getTitre() {
    return this.titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

}