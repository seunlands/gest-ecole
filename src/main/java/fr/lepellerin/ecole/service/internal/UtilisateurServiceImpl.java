package fr.lepellerin.ecole.service.internal;

import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.bean.Individu;
import fr.lepellerin.ecole.bean.Rattachement;
import fr.lepellerin.ecole.bean.security.Role;
import fr.lepellerin.ecole.bean.security.User;
import fr.lepellerin.ecole.repo.FamilleRepository;
import fr.lepellerin.ecole.repo.IndividuRepository;
import fr.lepellerin.ecole.repo.RattachementRepository;
import fr.lepellerin.ecole.repo.UserRepository;
import fr.lepellerin.ecole.service.UtilisateurService;
import fr.lepellerin.ecole.utils.PasswordGenerator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

  @Autowired
  private FamilleRepository familleRepository;

  @Autowired
  private IndividuRepository individuRepository;

  @Autowired
  private RattachementRepository rattachementRepository;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PasswordEncoder passwordEncoder;

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
      while (this.userRepository.findOneByUsername(tmpUserName) != null) {
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

  @Override
  @Transactional(readOnly = false)
  public Map<String, List<String>> resetPasswordForFamille(final String email) {
    final Map<String, List<String>> pwds = new HashMap<>();
    final List<Famille> fams = this.familleRepository.findFamilleByEmail(email);
    fams.forEach(fam -> {
      final String pwd = PasswordGenerator.randomString(8);
      final String hashedPwd = this.passwordEncoder.encode(pwd);
      final List<Individu> individus = this.individuRepository.findUserByFamille(fam);
      final User user = this.userRepository.findOneByFamille(fam);
      final List<String> emails = pwds.get(pwd) == null ? new ArrayList<>() : pwds.get(pwd);
      if (user != null) {
        user.setPassword(hashedPwd);
        individus.forEach(i -> {
          if (i.getMail() != null) {
            emails.add(i.getMail());
          }
        });
        this.userRepository.save(user);
        pwds.put(pwd, emails);
      }
    });
    return pwds;
  }

}
