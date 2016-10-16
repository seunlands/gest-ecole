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

import java.time.DayOfWeek;
import java.util.ArrayList;
import java.util.List;

public class ReserverRepasForm {

  private String anneeMois;

  private boolean lundi;
  private boolean mardi;
  private boolean mercredi;
  private boolean jeudi;
  private boolean vendredi;
  private boolean samedi;
  private boolean dimanche;

  private boolean presLundi;
  private boolean presMardi;
  private boolean presMercredi;
  private boolean presJeudi;
  private boolean presVendredi;
  private boolean presSamedi;
  private boolean presDimanche;


  public boolean isPresLundi() {
    return presLundi;
  }

  public void setPresLundi(boolean presLundi) {
    this.presLundi = presLundi;
  }

  public boolean isPresMardi() {
    return presMardi;
  }

  public void setPresMardi(boolean presMardi) {
    this.presMardi = presMardi;
  }

  public boolean isPresMercredi() {
    return presMercredi;
  }

  public void setPresMercredi(boolean presMercredi) {
    this.presMercredi = presMercredi;
  }

  public boolean isPresJeudi() {
    return presJeudi;
  }

  public void setPresJeudi(boolean presJeudi) {
    this.presJeudi = presJeudi;
  }

  public boolean isPresVendredi() {
    return presVendredi;
  }

  public void setPresVendredi(boolean presVendredi) {
    this.presVendredi = presVendredi;
  }

  public boolean isPresSamedi() {
    return presSamedi;
  }

  public void setPresSamedi(boolean presSamedi) {
    this.presSamedi = presSamedi;
  }

  public boolean isPresDimanche() {
    return presDimanche;
  }

  public void setPresDimanche(boolean presDimanche) {
    this.presDimanche = presDimanche;
  }

  public boolean isLundi() {
    return lundi;
  }

  public void setLundi(boolean lundi) {
    this.lundi = lundi;
  }

  public boolean isMardi() {
    return mardi;
  }

  public void setMardi(boolean mardi) {
    this.mardi = mardi;
  }

  public boolean isJeudi() {
    return jeudi;
  }

  public void setJeudi(boolean jeudi) {
    this.jeudi = jeudi;
  }

  public boolean isVendredi() {
    return vendredi;
  }

  public void setVendredi(boolean vendredi) {
    this.vendredi = vendredi;
  }

  public String getAnneeMois() {
    return anneeMois;
  }

  public void setAnneeMois(String anneeMois) {
    this.anneeMois = anneeMois;
  }

  /**
   * @return the mercredi
   */
  public boolean isMercredi() {
    return mercredi;
  }

  /**
   * @param mercredi the mercredi to set
   */
  public void setMercredi(boolean mercredi) {
    this.mercredi = mercredi;
  }

  /**
   * @return the dimanche
   */
  public boolean isDimanche() {
    return dimanche;
  }

  /**
   * @param dimanche the dimanche to set
   */
  public void setDimanche(boolean dimanche) {
    this.dimanche = dimanche;
  }

  /**
   * @return the samedi
   */
  public boolean isSamedi() {
    return samedi;
  }

  /**
   * @param samedi the samedi to set
   */
  public void setSamedi(boolean samedi) {
    this.samedi = samedi;
  }
  
  
  public List<DayOfWeek> getJoursCoches() {
    final List<DayOfWeek> joursCoches = new ArrayList<>();
    
    if (lundi) {
      joursCoches.add(DayOfWeek.MONDAY);
    }
    if (mardi) {
      joursCoches.add(DayOfWeek.TUESDAY);
    }
    if (mercredi) {
      joursCoches.add(DayOfWeek.WEDNESDAY);
    }
    if (jeudi) {
      joursCoches.add(DayOfWeek.THURSDAY);
    }
    if (vendredi) {
      joursCoches.add(DayOfWeek.FRIDAY);
    }
    if (samedi) {
      joursCoches.add(DayOfWeek.SATURDAY);
    }
    if (dimanche) {
      joursCoches.add(DayOfWeek.SUNDAY);
    }
    
    return joursCoches;
  }
}
