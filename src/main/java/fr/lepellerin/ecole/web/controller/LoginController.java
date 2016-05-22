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

package fr.lepellerin.ecole.web.controller;

import fr.lepellerin.ecole.service.EmailService;
import fr.lepellerin.ecole.service.UtilisateurService;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.context.Context;

@Controller
public class LoginController {

  private static final Logger LOGGER = LoggerFactory.getLogger(LoginController.class);

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
  public String logoutPage(final HttpServletRequest request, final HttpServletResponse response) {
    final Authentication auth = SecurityContextHolder.getContext().getAuthentication();
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
    final Map<String, List<String>> pwds = this.utilisateurService.resetPasswordForFamille(email);
    final Context ctx = new Context(Locale.ROOT);
    ctx.setVariable("name", "Seun");
    ctx.setVariable("pwd", "motdepasse");
    try {
      this.emailService.sendSimpleMail("test", "test", "test", "forgottenEmail", ctx);
    } catch (final MessagingException e) {
      LOGGER.error("ERROR sending email", e);
    }
    return "accueil/forgottenPwd";
  }
}
