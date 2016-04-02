package fr.lepellerin.ecole.repo;

import fr.lepellerin.ecole.bean.security.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * users repository.
 * 
 * @author landocore
 *
 */
public interface UserRepository extends JpaRepository<User, String> {

  User findByUsername(String username);
}
