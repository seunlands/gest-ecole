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
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import fr.lepellerin.ecole.bean.security.CurrentUser;
import fr.lepellerin.ecole.exceptions.TechnicalException;
import fr.lepellerin.ecole.service.CantineService;

@Controller
@RequestMapping("/cantine/annee")
public class ReservationRepasAnneeController {

  private static final String VUE = "cantine/anneeRepas";

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
  public String init(final Model model, @ModelAttribute("command") ReserverRepasForm form) throws TechnicalException {
    return VUE;
  }

  /**
   * init le model de la page details des reservations.
   *
   * @param model
   *          : model spring
   * @return le nom de la vue
   * @throws TechnicalException 
   */
  @RequestMapping("/submit")
  public String reserver(final Model model, @ModelAttribute("command") ReserverRepasForm form) throws TechnicalException {
    final CurrentUser user = (CurrentUser) SecurityContextHolder.getContext().getAuthentication()
        .getPrincipal();
    this.cantineService.reserver(LocalDate.now(), user.getUser().getFamille(), form.getJoursCoches());
    model.addAttribute("confirm", "Les modifications ont été enregistrées.");
    return VUE;
  }


  /**
   * initialise le form.
   *
   * @return <code>DetaillerReservationRepasForm</code>
   * @throws TechnicalException 
   */
  @ModelAttribute("command")
  public ReserverRepasForm addCommand() throws TechnicalException {
    final CurrentUser user = (CurrentUser) SecurityContextHolder.getContext().getAuthentication()
        .getPrincipal();
    final ReserverRepasForm form = new ReserverRepasForm();
    final List<DayOfWeek> jours = this.cantineService.getJourOuvertCantine(LocalDate.now(), user.getUser().getFamille());
    jours.forEach(j -> {
      switch(j) {
      case MONDAY :
        form.setPresLundi(true);
        break;
      case TUESDAY :
        form.setPresMardi(true);
        break;
      case WEDNESDAY :
        form.setPresMercredi(true);
        break;
      case THURSDAY :
        form.setPresJeudi(true);
        break;
      case FRIDAY :
        form.setPresVendredi(true);
        break;
      case SATURDAY :
        form.setPresSamedi(true);
        break;
      case SUNDAY :
        form.setPresDimanche(true);
        break;
     default :
       break;
      }
    });
    return form;
  }
  
}
