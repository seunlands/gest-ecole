package fr.lepellerin.ecole.web.controller.cantine;

import java.time.LocalDate;
import java.util.List;

public class JourRepas {

  private LocalDate date;
  private List<JourEnfantRepas> cells;

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public List<JourEnfantRepas> getCells() {
    return cells;
  }

  public void setCells(List<JourEnfantRepas> cells) {
    this.cells = cells;
  }

}
