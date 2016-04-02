package fr.lepellerin.ecole.repo;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.Consommation;
import fr.lepellerin.ecole.bean.Individu;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Date;

public interface ConsommationRepository extends JpaRepository<Consommation, Integer> {

  Consommation findByActiviteAndIndividuAndDate(Activite activite, Individu individu, Date date);

}
