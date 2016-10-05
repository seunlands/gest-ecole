package fr.lepellerin.ecole.service.dto;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LigneDto implements Serializable {
  
  /**
   * serial UID.
   */
  private static final long serialVersionUID = 1L;

  private LocalDate date;
  
  private List<CaseDto> cases;
  
  public LigneDto(final LocalDate date) {
    this.date = date;
    this.cases = new ArrayList<>();
  }

  public LocalDate getDate() {
    return date;
  }

  public void setDate(LocalDate date) {
    this.date = date;
  }

  public List<CaseDto> getCases() {
    return cases;
  }

  public void setCases(List<CaseDto> cases) {
    this.cases = cases;
  }

}
