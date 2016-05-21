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
import javax.persistence.Table;

/**
 * The persistent class for the badgeage_archives database table.
 * 
 */
@Entity
@Table(name = "badgeage_archives")
public class BadgeageArchive implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDarchive;

  private String codebarres;

  private String date;

  @Column(name = "date_archivage")
  private String dateArchivage;

  private String heure;

  public BadgeageArchive() {
  }

  public int getIDarchive() {
    return this.IDarchive;
  }

  public void setIDarchive(int IDarchive) {
    this.IDarchive = IDarchive;
  }

  public String getCodebarres() {
    return this.codebarres;
  }

  public void setCodebarres(String codebarres) {
    this.codebarres = codebarres;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDateArchivage() {
    return this.dateArchivage;
  }

  public void setDateArchivage(String dateArchivage) {
    this.dateArchivage = dateArchivage;
  }

  public String getHeure() {
    return this.heure;
  }

  public void setHeure(String heure) {
    this.heure = heure;
  }

}