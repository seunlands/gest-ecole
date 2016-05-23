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
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the corrections_villes database table.
 *
 */
@Entity
@Table(name = "corrections_villes")

public class CorrectionVille implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDcorrection")
  private int id;

  private String cp;

  @Column(name = "IDville")
  private int idVille;

  private String mode;

  @Lob
  private String nom;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getCp() {
    return this.cp;
  }

  public void setCp(final String cp) {
    this.cp = cp;
  }

  public int getIdVille() {
    return this.idVille;
  }

  public void setIdVille(final int idVille) {
    this.idVille = idVille;
  }

  public String getMode() {
    return this.mode;
  }

  public void setMode(final String mode) {
    this.mode = mode;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(final String nom) {
    this.nom = nom;
  }

}