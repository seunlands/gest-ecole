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


package fr.lepellerin.ecole.service;

import java.util.List;
import java.util.Map;

public interface UtilisateurService {

  /**
   * creer les compte spring security pour les familles avec enfants.
   */
  void creerUserPourFamille();

  /**
   * reset le mot de passe pour une famille.
   * 
   * @return map avec cle le mot de passe en clair et value la liste d'email
   *         concerné
   */
  Map<String, List<String>> resetPasswordForFamille(String email);

}
