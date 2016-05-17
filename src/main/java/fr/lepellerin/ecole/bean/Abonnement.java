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
 * The persistent class for the abonnements database table.
 * 
 */
@Entity
@Table(name = "abonnements")

public class Abonnement implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDabonnement;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  @ManyToOne
  @JoinColumn(name = "IDliste")
  private ListeDiffusion liste;

  public Abonnement() {
  }

  public int getIDabonnement() {
    return this.IDabonnement;
  }

  public void setIDabonnement(int IDabonnement) {
    this.IDabonnement = IDabonnement;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

  public ListeDiffusion getListe() {
    return liste;
  }

  public void setListe(ListeDiffusion liste) {
    this.liste = liste;
  }
}