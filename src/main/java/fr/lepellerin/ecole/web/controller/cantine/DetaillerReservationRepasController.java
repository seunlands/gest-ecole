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

import fr.lepellerin.ecole.bean.security.CurrentUser;
import fr.lepellerin.ecole.exceptions.FunctionalException;
import fr.lepellerin.ecole.exceptions.TechnicalException;
import fr.lepellerin.ecole.service.CantineService;
import fr.lepellerin.ecole.service.dto.PlanningDto;
import fr.lepellerin.ecole.utils.GeDateUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

@Controller
@RequestMapping("/cantine/details")
public class DetaillerReservationRepasController {

  private static final String VUE = "cantine/detaillerRepas";

  @Autowired
  private CantineService cantineService;

  /**
   * init le model de la page details des reservations.
   *
   * @param model
   *          : model spring
   * @return le nom de la vue
   * @throws TechnicalException 
   */
  @RequestMapping("/init")
  public String init(final Model model) throws TechnicalException {
    final CurrentUser user = (CurrentUser) SecurityContextHolder.getContext().getAuthentication()
        .getPrincipal();

    final YearMonth moisActuel = YearMonth.now();

    final PlanningDto planning = this.cantineService.getDateOuvert(moisActuel,
        user.getUser().getFamille());

    model.addAttribute("planning", planning);

    return VUE;
  }

  @RequestMapping(value = "/reserver")
  @ResponseBody
  public ResponseEntity<String> reserver(@RequestParam final String date, @RequestParam final int individuId) throws TechnicalException {
    final CurrentUser user = (CurrentUser) SecurityContextHolder.getContext().getAuthentication()
        .getPrincipal();
    final LocalDate localDate = LocalDate.parse(date,
        DateTimeFormatter.ofPattern(GeDateUtils.DATE_FORMAT_YYYYMMDD, Locale.ROOT));
    String result;
    try {
      result = this.cantineService.reserver(localDate, individuId, user.getUser().getFamille());
      return ResponseEntity.ok(result);
    } catch (FunctionalException e) {
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
  }

  /**
   * initialise le form.
   *
   * @return <code>DetaillerReservationRepasForm</code>
   */
  @ModelAttribute("command")
  public DetaillerReservationRepasForm addCommand() {
    final DetaillerReservationRepasForm form = new DetaillerReservationRepasForm();
    final YearMonth moisActuel = YearMonth.now();
    form.setAnneeMois(
        moisActuel.format(DateTimeFormatter.ofPattern(GeDateUtils.DATE_FORMAT_ANNEE_MOIS_FULL)));
    return form;
  }

}
