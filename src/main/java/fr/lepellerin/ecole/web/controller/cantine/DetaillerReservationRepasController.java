package fr.lepellerin.ecole.web.controller.cantine;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cantine/details")
public class DetaillerReservationRepasController {

  private static final String VUE = "detailResa";

  @RequestMapping("/init")
  public String init() {

    return VUE;
  }

}
