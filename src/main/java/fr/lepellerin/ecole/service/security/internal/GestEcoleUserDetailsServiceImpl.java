package fr.lepellerin.ecole.service.security.internal;

import fr.lepellerin.ecole.bean.security.CurrentUser;
import fr.lepellerin.ecole.bean.security.User;
import fr.lepellerin.ecole.service.security.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class GestEcoleUserDetailsServiceImpl implements UserDetailsService {

  private final IUserService userService;

  @Autowired
  public GestEcoleUserDetailsServiceImpl(IUserService userService) {
    this.userService = userService;
  }

  @Override
  public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    User user = userService.getUserByUsername(username);
    return new CurrentUser(user);
  }

}
