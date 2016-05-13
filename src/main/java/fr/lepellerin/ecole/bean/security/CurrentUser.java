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


package fr.lepellerin.ecole.bean.security;

import org.springframework.security.core.authority.AuthorityUtils;

public class CurrentUser extends org.springframework.security.core.userdetails.User {

  private static final long serialVersionUID = 20160314L;
  private User user;

  /**
   * Constructeur.
   * @param user : l'utilisateur
   */
  public CurrentUser(User user) {
    super(user.getUsername(), user.getPassword(),
        AuthorityUtils.createAuthorityList(user.getRole().toString()));
    this.user = user;
  }
  
  public User getUser() {
    return this.user;
  }
  
  public Role getRole() {
    return this.user.getRole();
  }

}
