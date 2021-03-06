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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the badgeage_journal database table.
 *
 */
@Entity
@Table(name = "badgeage_journal")
public class BadgeageJournal implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDaction")
  private int id;

  @Lob
  private String action;

  private String date;

  private String heure;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individus;

  @Lob
  private String individu;

  @Lob
  private String resultat;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getAction() {
    return this.action;
  }

  public void setAction(final String action) {
    this.action = action;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(final String date) {
    this.date = date;
  }

  public String getHeure() {
    return this.heure;
  }

  public void setHeure(final String heure) {
    this.heure = heure;
  }

  public Individu getIndividus() {
    return individus;
  }

  public void setIndividus(final Individu individus) {
    this.individus = individus;
  }

  public String getIndividu() {
    return this.individu;
  }

  public void setIndividu(final String individu) {
    this.individu = individu;
  }

  public String getResultat() {
    return this.resultat;
  }

  public void setResultat(final String resultat) {
    this.resultat = resultat;
  }

}