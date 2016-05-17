package fr.lepellerin.ecole.web.controller;

import fr.lepellerin.ecole.service.EmailService;
import fr.lepellerin.ecole.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.context.Context;

import java.util.List;
import java.util.Locale;
import java.util.Map;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller
public class LoginController {

  @Autowired
  private EmailService emailService;

  @Autowired
  private UtilisateurService utilisateurService;

  @RequestMapping(value = "/login", method = RequestMethod.GET)
  public String login() {
    return "accueil/login";
  }

  /**
   * deconnecte l'utilisateur du système.
   * 
   * @param request
   *          : la requete
   * @param response
   *          : la reponse
   * @return nom de la vue
   */
  @RequestMapping(value = "/logout", method = RequestMethod.GET)
  public String logoutPage(HttpServletRequest request, HttpServletResponse response) {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    if (auth != null) {
      new SecurityContextLogoutHandler().logout(request, response, auth);
    }
    return "redirect:/login?error";
  }

  /**
   * reset le mot de passe.
   * 
   * @return nom de la vue
   */
  @RequestMapping(value = "/forgottenPassword", method = RequestMethod.GET)
  public String forgottenPwdPage() {
    return "accueil/forgottenPwd";
  }

  /**
   * reset le mot de passe.
   * 
   * @return nom de la vue
   */
  @RequestMapping(value = "/forgottenPassword", method = RequestMethod.POST)
  public String resetPwdPage(@RequestParam final String email) {
    // find family by email.
    Map<String, List<String>> pwds = this.utilisateurService.resetPasswordForFamille(email);
    final Context ctx = new Context(Locale.ROOT);
    ctx.setVariable("name", "Seun");
    ctx.setVariable("pwd", "motdepasse");
    try {
      this.emailService.sendSimpleMail("test", "test", "test", "forgottenEmail", ctx);
    } catch (MessagingException e) {
      // TODO Auto-generated catch block
      e.printStackTrace();
    }
    return "accueil/forgottenPwd";
  }
}
