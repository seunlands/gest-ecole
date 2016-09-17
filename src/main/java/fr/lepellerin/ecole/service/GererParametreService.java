package fr.lepellerin.ecole.service;

import java.util.List;

import fr.lepellerin.ecole.service.dto.ParametreDto;

public interface GererParametreService {
  
  List<ParametreDto> getAllParametre();

  void saveParamCantine(Integer idCantine);

  ParametreDto getIdActiviteCantine();

}
