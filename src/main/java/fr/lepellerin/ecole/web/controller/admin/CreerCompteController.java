package fr.lepellerin.ecole.web.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/admin/creerCompte/")
public class CreerCompteController {

  /**
   * nom de la vue.
   */
  private static final String VUE = "admin/creerCompte";

  @RequestMapping(value = "/init", method = RequestMethod.GET)
  public String init() {
    return VUE;
  }
}
