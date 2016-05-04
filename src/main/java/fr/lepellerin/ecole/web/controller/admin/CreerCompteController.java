package fr.lepellerin.ecole.web.controller.admin;

import fr.lepellerin.ecole.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/creerCompte")
public class CreerCompteController {

  @Autowired
  private UtilisateurService utilisateurService;

  /**
   * nom de la vue.
   */
  private static final String VUE = "admin/creerCompte";

  @RequestMapping(value = "/init", method = RequestMethod.GET)
  public String init() {
    return VUE;
  }

  @RequestMapping(value = "/submit", method = RequestMethod.POST)
  public String creerComptes() {
    this.utilisateurService.creerUserPourFamille();
    return VUE;
  }
}
