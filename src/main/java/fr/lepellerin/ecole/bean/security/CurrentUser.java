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
