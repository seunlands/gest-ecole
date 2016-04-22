package fr.lepellerin.ecole.repo;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.Consommation;
import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.bean.Individu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Date;
import java.util.List;

public interface ConsommationRepository extends JpaRepository<Consommation, Integer> {

  Consommation findByActiviteAndIndividuAndDate(Activite activite, Individu individu, Date date);

  @Query("from Consommation c where o.activite = ?1 and o.famille = ?2 and date between ?3 and ?4"
      + " order by date")
  List<Consommation> findByActiviteAndFamilyBetweenDates(Activite activite, Famille famille,
      Date dateInf, Date dateSup);

}
