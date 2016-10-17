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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the memo_journee database table.
 * 
 */
@Entity
@Table(name = "memo_journee")
public class MemoJournee implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDmemo")
  private int id;

  private String date;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  private String texte;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

  public String getTexte() {
    return this.texte;
  }

  public void setTexte(String texte) {
    this.texte = texte;
  }

}