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
import fr.lepellerin.ecole.service.CantineService;
import fr.lepellerin.ecole.utils.GeDateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Set;

@Controller
@RequestMapping("/cantine")
public class ReserverRepasController {

  @Autowired
  private CantineService cantineService;

  /**
   * init la page réserver des repas.
   * 
   * @param model
   *          : le model Spring de la page
   * @return le nom de la vue
   */
  @RequestMapping(value = "/init", method = RequestMethod.GET)
  public String init(Model model) {
    CurrentUser user = (CurrentUser) SecurityContextHolder.getContext().getAuthentication()
        .getPrincipal();
    model.addAttribute("user", user);
    YearMonth anneeMois = cantineService.getMoisAnneeReservation();
    if (anneeMois != null /*
                           * &&
                           * !cantineService.isReservationDoneForFamillyAndMonth
                           * (anneeMois, user.getUser().getFamille())
                           */) {
      Set<Integer> jours = cantineService.getDateOuvert();
      ReserverRepasForm form = new ReserverRepasForm();
      form.setAnneeMois(
          anneeMois.format(DateTimeFormatter.ofPattern(GeDateUtils.DATE_FORMAT_ANNEE_MOIS_FULL)));
      if (jours.contains(Calendar.MONDAY)) {
        form.setPresLundi(true);
      }
      if (jours.contains(Calendar.TUESDAY)) {
        form.setPresMardi(true);
      }
      if (jours.contains(Calendar.THURSDAY)) {
        form.setPresJeudi(true);
      }
      if (jours.contains(Calendar.FRIDAY)) {
        form.setPresVendredi(true);
      }
      model.addAttribute("command", form);
    }
    return "cantine/reserverRepas";
  }

  /**
   * init la page réserver des repas.
   * 
   * @param model
   *          : le model Spring de la page
   * @return le nom de la vue
   */
  @RequestMapping("/submit")
  public String submit(Model model) {
    CurrentUser user = (CurrentUser) SecurityContextHolder.getContext().getAuthentication()
        .getPrincipal();
    model.addAttribute("user", user);
    // YearMonth anneeMois = cantineService.getMoisAnneeReservation();

    return "cantine/reserverRepas";
  }

}
