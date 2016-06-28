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

package fr.lepellerin.ecole.service.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class PlanningDto implements Serializable {

  /**
   * serial UID.
   */
  private static final long serialVersionUID = 1L;

  private List<String> headers;

  private List<LigneDto> lignes;

  public PlanningDto() {
    this.lignes = new ArrayList<>();
    this.headers = new ArrayList<>();
    this.headers.add("Date");
  }

  /**
   * retourne la ligne pour une date, si elle n'existe la crée et la retourne.
   *
   * @param date
   *          : date
   * @return <code>LigneDto</code>
   */
  public LigneDto getOrCreateLigne(final LocalDate date) {
    final Optional<LigneDto> ligneOpt = lignes.stream()
        .filter(ligne -> ligne.getDate().equals(date)).findAny();
    if (ligneOpt.isPresent()) {
      return ligneOpt.get();
    } else {
      final LigneDto ligne = new LigneDto(date);
      lignes.add(ligne);
      return ligne;
    }
  }

  public List<LigneDto> getLignes() {
    return lignes;
  }

  public void setLignes(final List<LigneDto> lignes) {
    this.lignes = lignes;
  }

  public List<String> getHeaders() {
    return headers;
  }

  public void setHeaders(final List<String> headers) {
    this.headers = headers;
  }

}
