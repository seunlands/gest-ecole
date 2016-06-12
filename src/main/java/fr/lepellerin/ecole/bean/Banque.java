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
import javax.persistence.Table;

/**
 * The persistent class for the banques database table.
 *
 */
@Entity
@Table(name = "banques")
public class Banque implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDbanque")
  private int id;

  @Column(name = "cp_resid")
  private String cpResid;

  private String nom;

  @Column(name = "rue_resid")
  private String rueResid;

  @Column(name = "ville_resid")
  private String villeResid;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getCpResid() {
    return this.cpResid;
  }

  public void setCpResid(final String cpResid) {
    this.cpResid = cpResid;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(final String nom) {
    this.nom = nom;
  }

  public String getRueResid() {
    return this.rueResid;
  }

  public void setRueResid(final String rueResid) {
    this.rueResid = rueResid;
  }

  public String getVilleResid() {
    return this.villeResid;
  }

  public void setVilleResid(final String villeResid) {
    this.villeResid = villeResid;
  }

}