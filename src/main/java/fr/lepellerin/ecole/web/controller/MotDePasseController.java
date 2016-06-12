package fr.lepellerin.ecole.web.controller;

import fr.lepellerin.ecole.bean.security.CurrentUser;
import fr.lepellerin.ecole.exceptions.FunctionalException;
import fr.lepellerin.ecole.service.UtilisateurService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
@RequestMapping("/user/")
public class MotDePasseController {

  private static final Logger LOGGER = LoggerFactory.getLogger(MotDePasseController.class);

  private static final String VUE = "user/changePwd";

  @Autowired
  private UtilisateurService utilisateurService;

  @RequestMapping("changePwd")
  public String initChangePwd() {
    return VUE;
  }

  /**
   * enregistre le nouveau mot de passe.
   *
   * @param form
   *          : le formulaire
   * @param model
   *          : le model
   * @return <code>String</code> nom de la vue
   */
  @RequestMapping(value = "submitNewPwd", method = RequestMethod.POST)
  public String submitNewPassword(@Valid @ModelAttribute("command") final MotDePasseForm form,
      final BindingResult results, final Model model) {
    if (results.hasErrors()) {
      return VUE;
    }
    final CurrentUser user = (CurrentUser) SecurityContextHolder.getContext().getAuthentication()
        .getPrincipal();
    try {
      this.utilisateurService.changePassword(user.getUser(), form.getOldPassword(),
          form.getNewPassword(), form.getConfirmPassword());
    } catch (final FunctionalException e) {
      LOGGER.debug("erreur metier", e);
      model.addAttribute("error", e.getMessage());
      return VUE;
    }
    model.addAttribute("confirm", "Le mot de passe a bien été changé.");
    return VUE;
  }

  @ModelAttribute("command")
  public MotDePasseForm addCommand() {
    return new MotDePasseForm();
  }

}
