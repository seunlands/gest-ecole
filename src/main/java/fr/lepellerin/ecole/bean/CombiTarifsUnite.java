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
 * The persistent class for the combi_tarifs_unites database table.
 *
 */
@Entity
@Table(name = "combi_tarifs_unites")

public class CombiTarifsUnite implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDcombi_tarif_unite")
  private int id;

  @ManyToOne
  @JoinColumn(name = "IDcombi_tarif")
  private CombiTarif combiTarif;

  @ManyToOne
  @JoinColumn(name = "IDtarif")
  private Tarif tarif;

  @ManyToOne
  @JoinColumn(name = "IDunite")
  private Unite unite;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public CombiTarif getCombiTarif() {
    return combiTarif;
  }

  public void setCombiTarif(final CombiTarif combiTarif) {
    this.combiTarif = combiTarif;
  }

  public Tarif getTarif() {
    return this.tarif;
  }

  public void setTarif(final Tarif tarif) {
    this.tarif = tarif;
  }

  public Unite getUnite() {
    return unite;
  }

  public void setUnite(final Unite unite) {
    this.unite = unite;
  }

}