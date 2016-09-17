package fr.lepellerin.ecole.service.internal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.lepellerin.ecole.bean.ParametreWeb;
import fr.lepellerin.ecole.bean.enums.EnumParametreWeb;
import fr.lepellerin.ecole.repo.ParametreWebRepository;
import fr.lepellerin.ecole.service.GererParametreService;
import fr.lepellerin.ecole.service.dto.ParametreDto;

@Service
public class GererParametreServiceImpl implements GererParametreService {
  
 
  @Autowired
  private ParametreWebRepository parametreRepo;

  @Override
  @Transactional(readOnly = true)
  public List<ParametreDto> getAllParametre() {
    final List<ParametreDto> pDtos = new ArrayList<>();
    final List<ParametreWeb> params = this.parametreRepo.findAll();
    params.forEach(p -> {
      pDtos.add(new ParametreDto(p.getId(), p.getLibelleParametre(), p.getValeurParametre()));
    });
    return pDtos;
  }
  
  @Override
  @Transactional(readOnly = true)
  public ParametreDto getIdActiviteCantine() {
    final ParametreWeb p = this.parametreRepo.findOne(EnumParametreWeb.ID_ACTIVITE_CANTINE.getId());
    return new ParametreDto(p.getId(), p.getLibelleParametre(), p.getValeurParametre());
  }
  
  @Override
  @Transactional(readOnly = false)
  public void saveParamCantine(final Integer idCantine) {
    if (idCantine == null) {
      //on le supprime
      parametreRepo.delete(EnumParametreWeb.ID_ACTIVITE_CANTINE.getId());
    } else {
      final ParametreWeb cantineParam = parametreRepo.findOne(EnumParametreWeb.ID_ACTIVITE_CANTINE.getId());
      if (cantineParam == null) {
        //on cree
        final ParametreWeb param = new ParametreWeb();
        param.setValeurParametre(idCantine.toString());
        param.setLibelleParametre(EnumParametreWeb.ID_ACTIVITE_CANTINE.getLibelle());
      } else {
        //on maj
        cantineParam.setValeurParametre(idCantine.toString());
      }
    }
    
  }

}
