package fr.lepellerin.ecole.repo;

import fr.lepellerin.ecole.bean.ComptePayeur;
import fr.lepellerin.ecole.bean.Famille;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ComptePayeurRepository extends JpaRepository<ComptePayeur, Integer> {

  ComptePayeur findOneByFamille(Famille famille);

}
