package fr.lepellerin.ecole.repo;

import fr.lepellerin.ecole.bean.Vacances;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

/**
 * repo for vacances.
 * 
 * @author landocore
 *
 */
public interface VacancesRepository extends JpaRepository<Vacances, Integer> {

  @Query("from Vacances v where v.dateDebut between :dateDebutPeriode and :dateFinPeriode or v.dateFin between :dateDebutPeriode and :dateFinPeriode")
  List<Vacances> findVacancesByPeriode(@Param("dateDebutPeriode") Date dateDebutPeriode,
      @Param("dateFinPeriode") Date dateFinPeriode);

}
