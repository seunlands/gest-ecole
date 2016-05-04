package fr.lepellerin.ecole.repo;

import fr.lepellerin.ecole.bean.Famille;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FamilleRepository extends JpaRepository<Famille, Integer> {

  @Query("select distinct f from Famille f join f.rattachements r "
      + "where r.idCategorie = 2 and not exists (select 1 from User u where u.famille = f)")
  List<Famille> findWithoutUserAccount();

}
