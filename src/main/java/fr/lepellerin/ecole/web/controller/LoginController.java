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
import fr.lepellerin.ecole.service.dto.ForgottenPwdDto;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.context.Context;

import java.util.List;
import java.util.Locale;

import javax.mail.MessagingException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
    return "redirect:/login?logout";
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
  public String resetPwdPage(@RequestParam final String email, final Model model) {
    // find family by email.
    final List<ForgottenPwdDto> pwds = this.utilisateurService.resetPasswordForFamille(email);
    pwds.forEach(pwd -> {
      final Context ctx = new Context(Locale.ROOT);
      ctx.setVariable("name", pwd.getAccount());
      ctx.setVariable("pwd", pwd.getPassword());
      try {
        this.emailService.sendSimpleMail("[Ecole notre dame] - Changement du mot de passe",
            pwd.getEmails(), "no-reply@ecole-lepellerin.com", "forgottenEmail", ctx);
      } catch (final MessagingException e) {
        LOGGER.error("ERROR sending email", e);
      }
      model.addAttribute("confirm", "Email avec nouveau mot de passe envoyé.");
    });

    return "accueil/forgottenPwd";
  }

  /**
   * init oubli username.
   *
   * @return nom de la vue
   */
  @RequestMapping(value = "/forgottenUsername", method = RequestMethod.GET)
  public String forgottenUsernamePage() {
    return "accueil/forgottenUsername";
  }

  /**
   * traitement username oublié.
   *
   * @param email
   *          email
   * @param model
   *          le model spring
   * @return <code>String</code> nom de la vue
   */
  @RequestMapping(value = "/forgottenUsername", method = RequestMethod.POST)
  public String sendUsernamePage(@RequestParam final String email, final Model model) {
    // find family by email.
    final List<String> accounts = this.utilisateurService.getUserNameByEmail(email);
    final Context ctx = new Context(Locale.ROOT);
    ctx.setVariable("accounts", accounts);
    try {
      this.emailService.sendSimpleMail("[Ecole notre dame] - Identifiant", email,
          "no-reply@ecole-lepellerin.com", "forgottenUsername", ctx);
    } catch (final MessagingException e) {
      LOGGER.error("ERROR sending email", e);
    }
    model.addAttribute("confirm", "Email avec identifiant envoyé.");

    return "accueil/forgottenUsername";
  }

}
