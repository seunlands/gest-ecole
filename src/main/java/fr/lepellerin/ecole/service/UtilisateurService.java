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
