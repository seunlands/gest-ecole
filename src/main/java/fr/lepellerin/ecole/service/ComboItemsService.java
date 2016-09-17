package fr.lepellerin.ecole.service;

import java.util.List;

import fr.lepellerin.ecole.service.dto.ComboItemDto;

public interface ComboItemsService {

  List<ComboItemDto> findAllActivite(String emptyField);
}
