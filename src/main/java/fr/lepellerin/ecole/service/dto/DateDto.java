package fr.lepellerin.ecole.service.dto;

import java.util.Date;
import java.util.List;

public class DateDto {

  private Date date;
  private List<IndividuDto> individu;

  public Date getDate() {
    return date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public List<IndividuDto> getIndividu() {
    return individu;
  }

  public void setIndividu(List<IndividuDto> individu) {
    this.individu = individu;
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((date == null) ? 0 : date.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj) {
      return true;
    }
    if (obj == null) {
      return false;
    }
    if (getClass() != obj.getClass()) {
      return false;
    }
    DateDto other = (DateDto) obj;
    if (date == null) {
      if (other.date != null) {
        return false;
      }
    } else if (!date.equals(other.date)) {
      return false;
    }
    return true;
  }

}
