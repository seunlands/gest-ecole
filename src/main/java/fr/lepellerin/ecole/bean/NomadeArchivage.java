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
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the nomade_archivage database table.
 * 
 */
@Entity
@Table(name = "nomade_archivage")

public class NomadeArchivage implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDarchive;

  private String date;

  private String ID_appareil;

  @Lob
  @Column(name = "nom_fichier")
  private String nomFichier;

  public NomadeArchivage() {
  }

  public int getIDarchive() {
    return this.IDarchive;
  }

  public void setIDarchive(int IDarchive) {
    this.IDarchive = IDarchive;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getID_appareil() {
    return this.ID_appareil;
  }

  public void setID_appareil(String ID_appareil) {
    this.ID_appareil = ID_appareil;
  }

  public String getNomFichier() {
    return this.nomFichier;
  }

  public void setNomFichier(String nomFichier) {
    this.nomFichier = nomFichier;
  }

}