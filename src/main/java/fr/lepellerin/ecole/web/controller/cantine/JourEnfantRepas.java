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


package fr.lepellerin.ecole.web.controller.cantine;

import fr.lepellerin.ecole.bean.Individu;

public class JourEnfantRepas {

  private Individu enfant;

  private boolean reservable;

  private boolean reserve;

  public Individu getEnfant() {
    return enfant;
  }

  public void setEnfant(Individu enfant) {
    this.enfant = enfant;
  }

  public boolean isReservable() {
    return reservable;
  }

  public void setReservable(boolean reservable) {
    this.reservable = reservable;
  }

  public boolean isReserve() {
    return reserve;
  }

  public void setReserve(boolean reserve) {
    this.reserve = reserve;
  }

}
