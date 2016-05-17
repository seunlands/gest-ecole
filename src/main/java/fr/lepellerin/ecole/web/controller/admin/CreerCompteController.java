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
