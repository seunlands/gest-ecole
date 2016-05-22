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
 * The persistent class for the combi_tarifs database table.
 *
 */
@Entity
@Table(name = "combi_tarifs")

public class CombiTarif implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDcombi_tarif")
  private int id;

  private String date;

  @ManyToOne
  @JoinColumn(name = "IDgroupe")
  private Groupe groupe;

  @ManyToOne
  @JoinColumn(name = "IDtarif")
  private Tarif tarif;

  @Column(name = "quantite_max")
  private int quantiteMax;

  private String type;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(final String date) {
    this.date = date;
  }

  public Groupe getGroupe() {
    return groupe;
  }

  public void setGroupe(final Groupe groupe) {
    this.groupe = groupe;
  }

  public Tarif getTarif() {
    return tarif;
  }

  public void setTarif(final Tarif tarif) {
    this.tarif = tarif;
  }

  public int getQuantiteMax() {
    return this.quantiteMax;
  }

  public void setQuantiteMax(final int quantiteMax) {
    this.quantiteMax = quantiteMax;
  }

  public String getType() {
    return this.type;
  }

  public void setType(final String type) {
    this.type = type;
  }

}