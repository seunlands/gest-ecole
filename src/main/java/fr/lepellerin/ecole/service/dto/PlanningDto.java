package fr.lepellerin.ecole.service.dto;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PlanningDto {

  private List<Date> dates;

  /**
   * constructeur par defaut. Init les listes.
   */
  public PlanningDto() {
    setDates(new ArrayList<>());
  }

  public List<Date> getDates() {
    return dates;
  }

  public void setDates(List<Date> dates) {
    this.dates = dates;
  }

}
