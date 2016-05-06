package fr.lepellerin.ecole.service;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.Famille;
import fr.lepellerin.ecole.service.dto.PlanningDto;

public interface InscriptionService {

  PlanningDto findByActiviteAndFamille(Activite activite, Famille famille);

}
