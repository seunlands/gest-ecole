package fr.lepellerin.ecole.repo;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.Unite;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniteRepository extends JpaRepository<Unite, Integer> {

  Unite findOneByActivite(Activite activite);

}
