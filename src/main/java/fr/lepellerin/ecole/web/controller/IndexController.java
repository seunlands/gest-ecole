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

import java.util.Collection;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.lepellerin.ecole.service.GererParametreService;
import fr.lepellerin.ecole.service.dto.ParametreDto;

@Controller
public class IndexController {
  
  private static final String MODEL_PARAM_CANT = "paramCantine";

  @Autowired
  private GererParametreService gpService;

  @RequestMapping(value = "/", method = RequestMethod.GET)
  public String welcomePage(final Model model, final HttpServletRequest request, final HttpServletResponse response) throws ServletException {
    final ParametreDto p = this.gpService.getIdActiviteCantine();
    boolean paramCantine = false;
    boolean user = false;
    boolean admin = false;
    if (p == null) {
      Collection<? extends GrantedAuthority> authorities = SecurityContextHolder.getContext().getAuthentication().getAuthorities();
      for (GrantedAuthority grantedAuthority : authorities) {
        if (grantedAuthority.getAuthority().equals("ROLE_ADMIN")) {
          paramCantine = true;
        } else if (grantedAuthority.getAuthority().equals("ROLE_FAMILLE")) {
          user = true;
        }
      }
      if (admin) {
        paramCantine = true;
      } else if (user) {
        request.logout();
        return "redirect:/login?missingParam";
      }
    }   
    model.addAttribute(MODEL_PARAM_CANT, paramCantine);
    return "accueil/home";
  }

}
