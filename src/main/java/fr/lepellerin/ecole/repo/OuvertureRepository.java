package fr.lepellerin.ecole.repo;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.Ouverture;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface OuvertureRepository extends JpaRepository<Ouverture, Integer> {

  @Query("from Ouverture o where o.activite = ?1 and date between ?2 and ?3 order by date")
  List<Ouverture> findByActiviteAndPeriode(Activite activite, Date debutPeriode, Date finPeriode);
}
