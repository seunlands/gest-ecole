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
 * The persistent class for the pieces_activites database table.
 * 
 */
@Entity
@Table(name = "pieces_activites")

public class PiecesActivite implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDpiece_activite")
  private int id;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDtype_piece")
  private TypePiece typePiece;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }
  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public TypePiece getTypePiece() {
    return typePiece;
  }

  public void setTypePiece(TypePiece typePiece) {
    this.typePiece = typePiece;
  }

}