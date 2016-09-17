package fr.lepellerin.ecole.service.internal;

import java.util.ArrayList;
import java.util.List;

import org.apache.poi.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.repo.ActiviteRepository;
import fr.lepellerin.ecole.service.ComboItemsService;
import fr.lepellerin.ecole.service.dto.ComboItemDto;

@Service
public class ComboItemsServiceImpl implements ComboItemsService {
  
  @Autowired
  private ActiviteRepository activiteRepository; 

  @Override
  public List<ComboItemDto> findAllActivite(final String emptyField) {
    final List<Activite> acts = this.activiteRepository.findAll();
    final List<ComboItemDto> items = new ArrayList<>();
    if (!StringUtils.isEmpty(emptyField)) {
      items.add(new ComboItemDto(null, emptyField));
    }
    acts.forEach(act -> items.add(new ComboItemDto(act.getId(), act.getNom())));
    return items;
  }

}
