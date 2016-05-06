package fr.lepellerin.ecole.repo;

import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.bean.Rattachement;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * users repository.
 * 
 * @author landocore
 *
 */
public interface RattachementRepository extends JpaRepository<Rattachement, Integer> {

  List<Rattachement> findByFamille(Famille famille);
}
