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
 * The persistent class for the etat_nomin_champs database table.
 * 
 */
@Entity
@Table(name = "etat_nomin_champs")

public class EtatNominChamp implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDchamp;

  @Lob
  private String code;

  @Lob
  private String formule;

  @Lob
  private String label;

  @Lob
  private String titre;

  public EtatNominChamp() {
  }

  public int getIDchamp() {
    return this.IDchamp;
  }

  public void setIDchamp(int IDchamp) {
    this.IDchamp = IDchamp;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getFormule() {
    return this.formule;
  }

  public void setFormule(String formule) {
    this.formule = formule;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getTitre() {
    return this.titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

}