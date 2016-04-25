package fr.lepellerin.ecole.web.controller.cantine;

import fr.lepellerin.ecole.bean.security.CurrentUser;
import fr.lepellerin.ecole.service.CantineService;
import fr.lepellerin.ecole.utils.GeDateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
  @RequestMapping("/init")
  public String init(Model model) {
    CurrentUser user = (CurrentUser) SecurityContextHolder.getContext().getAuthentication()
        .getPrincipal();
    model.addAttribute("user", user);
    YearMonth anneeMois = cantineService.getMoisAnneeReservation();
    if (anneeMois != null || !cantineService.isReservationDoneForFamillyAndMonth(anneeMois,
        user.getUser().getFamille())) {
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
}
