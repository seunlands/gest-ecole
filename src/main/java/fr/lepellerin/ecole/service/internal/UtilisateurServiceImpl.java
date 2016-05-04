package fr.lepellerin.ecole.service.internal;

import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.bean.Rattachement;
import fr.lepellerin.ecole.bean.security.Role;
import fr.lepellerin.ecole.bean.security.User;
import fr.lepellerin.ecole.repo.FamilleRepository;
import fr.lepellerin.ecole.repo.RattachementRepository;
import fr.lepellerin.ecole.repo.UserRepository;
import fr.lepellerin.ecole.service.UtilisateurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

  @Autowired
  private FamilleRepository familleRepository;

  @Autowired
  private RattachementRepository rattachementRepository;

  @Autowired
  private UserRepository userRepository;

  @Override
  @Transactional(readOnly = false)
  public void creerUserPourFamille() {
    final List<Famille> familles = this.familleRepository.findWithoutUserAccount();
    familles.forEach(fam -> {
      List<Rattachement> rattachements = this.rattachementRepository.findByFamille(fam);
      Set<String> noms = new HashSet<>();
      rattachements.forEach(r -> {
        if (r.getIdCategorie() == 1) {
          noms.add(r.getIndividu().getNom());
        }
      });
      final StringBuilder strBuilder = new StringBuilder();
      String separator = "";
      for (final String nom : noms) {
        strBuilder.append(separator);
        strBuilder.append(nom);
        separator = "-";
      }

      int inc = 2;
      String tmpUserName = strBuilder.toString();
      while (this.userRepository.findByUsername(tmpUserName) != null) {
        tmpUserName = strBuilder.toString() + "-" + String.valueOf(inc);
        inc++;
      }

      User user = new User();
      user.setFamille(fam);
      user.setEnabled(true);
      user.setRole(Role.ROLE_FAMILLE);
      user.setUsername(tmpUserName);
      user.setPassword(tmpUserName);
      this.userRepository.save(user);
    });

  }

}
