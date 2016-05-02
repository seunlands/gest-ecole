package fr.lepellerin.ecole.web.controller.cantine;

import fr.lepellerin.ecole.bean.Individu;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;

@Controller
@RequestMapping("/cantine/details")
public class DetaillerReservationRepasController {

  private static final String VUE = "cantine/detaillerRepas";

  @RequestMapping("/init")
  public String init(final Model model) {

    final PlanningRepas planning = new PlanningRepas();
    planning.setEnfants(new ArrayList<>());
    planning.setLignes(new ArrayList<>());

    final Individu i1 = new Individu();
    i1.setPrenom("Enfant");
    i1.setNom("1");
    planning.getEnfants().add(i1);

    final Individu i2 = new Individu();
    i2.setPrenom("Enfant");
    i2.setNom("2");
    planning.getEnfants().add(i2);

    final JourRepas jr = new JourRepas();
    jr.setDate(LocalDate.of(2016, Month.MAY, 2));
    jr.setCells(new ArrayList<>());
    {
      final JourEnfantRepas cell = new JourEnfantRepas();
      cell.setEnfant(i1);
      cell.setReservable(true);
      cell.setReserve(false);
      jr.getCells().add(cell);
    }
    {
      final JourEnfantRepas cell = new JourEnfantRepas();
      cell.setEnfant(i2);
      cell.setReservable(true);
      cell.setReserve(true);
      jr.getCells().add(cell);
    }
    planning.getLignes().add(jr);

    model.addAttribute("planning", planning);

    return VUE;
  }

}
