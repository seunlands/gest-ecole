package fr.lepellerin.ecole.service.security;

import fr.lepellerin.ecole.bean.security.User;

/**
 * Interface Service user.
 * 
 * @author landocore
 *
 */
public interface IUserService {
  User getUserByUsername(String username);
}
