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


package fr.lepellerin.ecole.bean.enums;

public enum EnumEtatReservation {

  RESERVE("reservation"),

  ABS_JUSTIFIE("absentj");

  private final String libelle;

  private EnumEtatReservation(String libelle) {
    this.libelle = libelle;
  }

  public String getLibelle() {
    return libelle;
  }

}
