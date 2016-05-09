package fr.lepellerin.ecole.service.security.internal;

import fr.lepellerin.ecole.bean.security.User;
import fr.lepellerin.ecole.repo.UserRepository;
import fr.lepellerin.ecole.service.security.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * service user.
 * 
 * @author landocore
 *
 */
@Service
public class UserServiceImpl implements IUserService {

  private final UserRepository userRepository;

  @Autowired
  public UserServiceImpl(UserRepository userRepository) {
    this.userRepository = userRepository;
  }

  @Override
  public User getUserByUsername(String username) {
    return this.userRepository.findOneByUsername(username);
  }

}
