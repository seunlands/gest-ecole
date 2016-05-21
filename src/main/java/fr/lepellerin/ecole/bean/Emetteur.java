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
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the emetteurs database table.
 * 
 */
@Entity
@Table(name = "emetteurs")

public class Emetteur implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDemetteur;

  @ManyToOne
  @JoinColumn(name = "IDmode")
  private ModeReglement mode;

  @Lob
  private byte[] image;

  private String nom;

  public Emetteur() {
  }

  public int getIDemetteur() {
    return this.IDemetteur;
  }

  public void setIDemetteur(int IDemetteur) {
    this.IDemetteur = IDemetteur;
  }

  public ModeReglement getMode() {
    return mode;
  }

  public void setMode(ModeReglement mode) {
    this.mode = mode;
  }

  public byte[] getImage() {
    return this.image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}