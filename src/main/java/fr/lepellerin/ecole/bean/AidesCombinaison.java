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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the aides_combinaisons database table.
 *
 */
@Entity
@Table(name = "aides_combinaisons")
public class AidesCombinaison implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDaide_combi")
  private int id;

  @ManyToOne
  @JoinColumn(name = "IDaide")
  private Aide aide;

  @Column(name = "IDaide_montant")
  private int idAideMontant;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public Aide getAide() {
    return aide;
  }

  public void setAide(final Aide aide) {
    this.aide = aide;
  }

  public int getIdAideMontant() {
    return this.idAideMontant;
  }

  public void setIdAideMontant(final int idAideMontant) {
    this.idAideMontant = idAideMontant;
  }

}