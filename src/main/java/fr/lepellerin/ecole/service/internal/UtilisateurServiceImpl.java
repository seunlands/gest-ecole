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

package fr.lepellerin.ecole.service.internal;

import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.bean.Individu;
import fr.lepellerin.ecole.bean.security.Role;
import fr.lepellerin.ecole.bean.security.User;
import fr.lepellerin.ecole.exceptions.FunctionalException;
import fr.lepellerin.ecole.repo.FamilleRepository;
import fr.lepellerin.ecole.repo.IndividuRepository;
import fr.lepellerin.ecole.repo.UserRepository;
import fr.lepellerin.ecole.service.UtilisateurService;
import fr.lepellerin.ecole.service.dto.ForgottenPwdDto;
import fr.lepellerin.ecole.utils.PasswordGenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class UtilisateurServiceImpl implements UtilisateurService {

  @Autowired
  private FamilleRepository familleRepository;

  @Autowired
  private IndividuRepository individuRepository;

  @Autowired
  private UserRepository userRepository;

  @Autowired
  private PasswordEncoder passwordEncoder;

  @Override
  @Transactional(readOnly = false)
  public void creerUserPourFamille() {
    final List<Famille> familles = this.familleRepository.findWithoutUserAccount();
    familles.forEach(fam -> {
      final User user = new User();
      user.setFamille(fam);
      user.setEnabled(true);
      user.setRole(Role.ROLE_FAMILLE);
      user.setUsername(fam.getInternetIdentifiant());
      user.setPassword(this.passwordEncoder.encode(fam.getInternetMdp()));
      this.userRepository.save(user);
    });
  }

  @Override
  @Transactional(readOnly = false)
  public List<ForgottenPwdDto> resetPasswordForFamille(final String email) {
    final List<ForgottenPwdDto> dtos = new ArrayList<>();
    final List<Famille> fams = this.familleRepository.findFamilleByEmail(email);
    fams.forEach(fam -> {
      final ForgottenPwdDto dto = new ForgottenPwdDto();
      final String pwd = PasswordGenerator.randomString(8);
      final String hashedPwd = this.passwordEncoder.encode(pwd);
      final List<Individu> individus = this.individuRepository.findUserByFamille(fam);
      final User user = this.userRepository.findOneByFamille(fam);
      if (user != null) {
        dto.setAccount(user.getUsername());
        dto.setPassword(pwd);
        dto.setEmails(new ArrayList<>());
        user.setPassword(hashedPwd);
        individus.forEach(i -> {
          if (i.getMail() != null) {
            dto.getEmails().add(i.getMail());
          }
        });
        this.userRepository.save(user);
        dtos.add(dto);
      }
    });
    return dtos;
  }

  @Override
  @Transactional(readOnly = true)
  public List<String> getUserNameByEmail(final String email) {
    final List<String> accounts = new ArrayList<>();
    final List<Famille> fams = this.familleRepository.findFamilleByEmail(email);
    fams.forEach(fam -> accounts.add(fam.getInternetIdentifiant()));
    return accounts;
  }

  @Override
  @Transactional(readOnly = false)
  public void changePassword(final User user, final String oldPwd, final String newPwd,
      final String confirmPwd) throws FunctionalException {
    if (!this.passwordEncoder.matches(oldPwd, user.getPassword())) {
      throw new FunctionalException("L'ancien mot de passe n'est pas correct.");
    }
    if (!newPwd.equals(confirmPwd)) {
      throw new FunctionalException(
          "Le nouveau mot de passe ne correspond pas avec la confirmation.");
    }
    user.setPassword(this.passwordEncoder.encode(newPwd));
    this.userRepository.save(user);

  }

}
