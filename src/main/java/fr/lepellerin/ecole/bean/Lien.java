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
 * The persistent class for the liens database table.
 *
 */
@Entity
@Table(name = "liens")

public class Lien implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDlien")
  private int id;

  @Column(name = "IDautorisation")
  private int idAutorisation;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDindividu_objet")
  private Individu individuObjet;

  @ManyToOne
  @JoinColumn(name = "IDindividu_sujet")
  private Individu individuSujet;

  @Column(name = "IDtype_lien")
  private int idTypeLien;

  private int responsable;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public int getIdAutorisation() {
    return idAutorisation;
  }

  public void setIdAutorisation(final int idAutorisation) {
    this.idAutorisation = idAutorisation;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(final Famille famille) {
    this.famille = famille;
  }

  public Individu getIndividuObjet() {
    return individuObjet;
  }

  public void setIndividuObjet(final Individu individuObjet) {
    this.individuObjet = individuObjet;
  }

  public Individu getIndividuSujet() {
    return individuSujet;
  }

  public void setIndividuSujet(final Individu individuSujet) {
    this.individuSujet = individuSujet;
  }

  public int getIdTypeLien() {
    return idTypeLien;
  }

  public void setIdTypeLien(final int idTypeLien) {
    this.idTypeLien = idTypeLien;
  }

  public int getResponsable() {
    return this.responsable;
  }

  public void setResponsable(final int responsable) {
    this.responsable = responsable;
  }

}