package fr.lepellerin.ecole.repo;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.bean.Inscription;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * users repository.
 * 
 * @author landocore
 *
 */
public interface InscriptionRepository extends JpaRepository<Inscription, Integer> {

  List<Inscription> findByActiviteAndFamille(Activite activite, Famille famille);
}
