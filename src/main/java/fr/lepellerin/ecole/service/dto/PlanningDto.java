package fr.lepellerin.ecole.service.dto;

import java.util.ArrayList;
import java.util.List;

public class PlanningDto {

  private List<DateDto> dates;

  /**
   * constructeur par defaut. Init les listes.
   */
  public PlanningDto() {
    setDates(new ArrayList<>());
  }

  public List<DateDto> getDates() {
    return dates;
  }

  public void setDates(List<DateDto> dates) {
    this.dates = dates;
  }

}
