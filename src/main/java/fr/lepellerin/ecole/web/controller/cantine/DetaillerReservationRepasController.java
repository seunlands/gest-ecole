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

import java.time.LocalDate;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

import fr.lepellerin.ecole.bean.security.CurrentUser;
import fr.lepellerin.ecole.exceptions.FunctionalException;
import fr.lepellerin.ecole.exceptions.TechnicalException;
import fr.lepellerin.ecole.logging.LogMe;
import fr.lepellerin.ecole.service.CantineService;
import fr.lepellerin.ecole.service.dto.ComboItemDto;
import fr.lepellerin.ecole.service.dto.PlanningDto;
import fr.lepellerin.ecole.utils.GeDateUtils;

@Controller
@RequestMapping("/cantine/details")
public class DetaillerReservationRepasController {
  
  private static final Logger LOGGER = LoggerFactory.getLogger(DetaillerReservationRepasController.class);

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
  @LogMe(logExit = true)
  public String init(final Model model, @ModelAttribute("command") DetaillerReservationRepasForm form) throws TechnicalException {
    final CurrentUser user = (CurrentUser) SecurityContextHolder.getContext().getAuthentication()
        .getPrincipal();

    final YearMonth moisActuel = YearMonth.parse(form.getAnneeMois().toString(), DateTimeFormatter.ofPattern(GeDateUtils.DATE_FORMAT_YYYYMM));
        
    final PlanningDto planning = this.cantineService.getDateOuvert(moisActuel,
        user.getUser().getFamille());

    model.addAttribute("planning", planning);

    return VUE;
  }

  @RequestMapping(value = "/reserver")
  @ResponseBody
  @LogMe(logExit = true)
  public ResponseEntity<String> reserver(@RequestParam final String date, @RequestParam final int individuId) throws TechnicalException {
    final CurrentUser user = (CurrentUser) SecurityContextHolder.getContext().getAuthentication()
        .getPrincipal();
    final LocalDate localDate = LocalDate.parse(date,
        DateTimeFormatter.ofPattern(GeDateUtils.DATE_FORMAT_YYYYMMDD, Locale.ROOT));
    String result;
    try {
      result = this.cantineService.reserver(localDate, individuId, user.getUser().getFamille(), null);
      return ResponseEntity.ok(result);
    } catch (FunctionalException e) {
      LOGGER.error("Une erreur fonctionnelle s'est produite : " + e.getMessage(), e);
      return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
    }
  }

  /**
   * initialise le form.
   *
   * @return <code>DetaillerReservationRepasForm</code>
   */
  @ModelAttribute("command")
  @LogMe(logExit = true)
  public DetaillerReservationRepasForm addCommand() {
    final DetaillerReservationRepasForm form = new DetaillerReservationRepasForm();
    final YearMonth moisActuel = YearMonth.now();
    final Integer intMois = Integer.valueOf(moisActuel.format(DateTimeFormatter.ofPattern(GeDateUtils.DATE_FORMAT_YYYYMM)));
    form.setAnneeMois(intMois);
    return form;
  }
  
  @ModelAttribute("moisActivites")
  public List<ComboItemDto> addMoisToModel() throws TechnicalException {
    return this.cantineService.getMoisOuvertCantine();
  }

}
