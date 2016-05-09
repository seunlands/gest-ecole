package fr.lepellerin.ecole.repo;

import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.bean.Individu;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IndividuRepository extends JpaRepository<Individu, Integer> {

  @Query("select distinct r.individu from Rattachement r join r.famille f "
      + "where r.idCategorie = 1 and f = ?1")
  List<Individu> findUserByFamille(Famille famille);

}
