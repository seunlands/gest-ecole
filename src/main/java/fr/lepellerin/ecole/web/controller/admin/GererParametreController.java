package fr.lepellerin.ecole.web.controller.admin;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import fr.lepellerin.ecole.bean.enums.EnumParametreWeb;
import fr.lepellerin.ecole.service.ComboItemsService;
import fr.lepellerin.ecole.service.GererParametreService;
import fr.lepellerin.ecole.service.dto.ComboItemDto;
import fr.lepellerin.ecole.service.dto.ParametreDto;

@Controller
@RequestMapping("/admin/gererParametre")
public class GererParametreController {
  
  /**
   * nom de la vue.
   */
  private static final String VUE = "admin/gererParametre";
  /**
   * model attribute name for form.
   */
  private static final String MODEL_FORM = "gererParametreForm";
  
  /**
   * model attribute name for activities.
   */
  private static final String MODEL_ACTIVITES = "ACTIVITIES";
  
  @Autowired
  private GererParametreService gpService;

  @Autowired
  private ComboItemsService ciService;

  @RequestMapping(value = "/init", method = RequestMethod.GET)
  public String init(final Model model) {
    model.addAttribute(MODEL_FORM, this.addForm());
    return VUE;
  }
  
  @RequestMapping(value = "/submit", method = RequestMethod.POST)
  public String submit(@Valid final GererParametreForm gererParametreForm, final BindingResult result, final Model model) {
    if (result.hasErrors()) {
     return VUE;
    }
    this.gpService.saveParamCantine(gererParametreForm.getIdActCantine());
    this.gpService.saveOffsetResa(gererParametreForm.getOffsetResa());
    return VUE;
  }
  
  private GererParametreForm addForm() {
    final GererParametreForm form = new GererParametreForm();
    final List<ParametreDto> params = this.gpService.getAllParametre();
    final ParametreDto cantineDto = this.findParamById(params, EnumParametreWeb.ID_ACTIVITE_CANTINE.getId());
    final ParametreDto offsetDto = this.findParamById(params, EnumParametreWeb.ID_OFFSET_RESA.getId());
    if (cantineDto != null) {
      form.setIdActCantine(Integer.valueOf(cantineDto.getValeurParametre()));
    }
    if (offsetDto != null) {
      form.setOffsetResa(offsetDto.getValeurParametre());
    }
    return form;
  }
  
  @ModelAttribute(MODEL_ACTIVITES)
  public List<ComboItemDto> addActivities() {
    final List<ComboItemDto> items = this.ciService.findAllActivite("Sélectionnez une activité...");
    items.sort((i1, i2) -> {
      int i3 = 0;
      int i4 = 0;
      if (i1.getId() != null) {
        i3 = i1.getId();
      }
      if (i2.getId() != null) {
        i4 = i2.getId();
      }
      return i3 - i4;
    });
    return items;    
  }
  
  
  private ParametreDto findParamById(final List<ParametreDto> params, final int id) {
    if (params != null) {
      final Optional<ParametreDto> pOpt = params.stream().filter(p -> p.getId() == id).findAny();
      if (pOpt.isPresent()) {
        return pOpt.get();
      }
    }
    return null;
  }

}
