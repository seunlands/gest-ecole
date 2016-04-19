package fr.lepellerin.ecole.web.controller.cantine;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.security.CurrentUser;
import fr.lepellerin.ecole.service.InscriptionService;
import fr.lepellerin.ecole.service.dto.PlanningDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cantine")
public class ReserverRepasController {

  @Autowired
  private InscriptionService inscriptionService;

  @RequestMapping("/init")
  public String init(Model model) {
    CurrentUser user = (CurrentUser) SecurityContextHolder.getContext().getAuthentication()
        .getPrincipal();
    model.addAttribute("user", user);
    Activite activite = new Activite();
    activite.setIDactivite(1);
    PlanningDto planning = inscriptionService.findByActiviteAndFamille(activite,
        user.getUser().getFamille());
    model.addAttribute("command", new ReserverRepasForm());
    model.addAttribute("planning", planning);
    return "cantine/reserverRepas";
  }

}
