package fr.lepellerin.ecole.service.internal;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

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
    if (p == null) {
      return null;
    }
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
        param.setId(EnumParametreWeb.ID_ACTIVITE_CANTINE.getId());
        param.setLibelleParametre(EnumParametreWeb.ID_ACTIVITE_CANTINE.getLibelle());
        this.parametreRepo.save(param);
      } else {
        //on maj
        cantineParam.setValeurParametre(idCantine.toString());
      }
    }
    
  }
  
  @Override
  @Transactional(readOnly = false)
  public void saveOffsetResa(final String offset) {
    if (StringUtils.isEmpty(offset)) {
      //on le supprime
      parametreRepo.delete(EnumParametreWeb.ID_OFFSET_RESA.getId());
    } else {
      final ParametreWeb offsetParam = parametreRepo.findOne(EnumParametreWeb.ID_OFFSET_RESA.getId());
      if (offsetParam == null) {
        //on cree
        final ParametreWeb param = new ParametreWeb();
        param.setValeurParametre(offset);
        param.setId(EnumParametreWeb.ID_OFFSET_RESA.getId());
        param.setLibelleParametre(EnumParametreWeb.ID_OFFSET_RESA.getLibelle());
        this.parametreRepo.save(param);
      } else {
        //on maj
        offsetParam.setValeurParametre(offset);
      }
    }
    
  }

}
