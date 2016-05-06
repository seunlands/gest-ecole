package fr.lepellerin.ecole.service.dto;

import java.util.Date;
import java.util.List;

public class ReservationEnfantDto {

  private String nomEnfant;
  private List<Date> datesReserves;

  public String getNomEnfant() {
    return nomEnfant;
  }

  public void setNomEnfant(String nomEnfant) {
    this.nomEnfant = nomEnfant;
  }

  public List<Date> getDatesReserves() {
    return datesReserves;
  }

  public void setDatesReserves(List<Date> datesReserves) {
    this.datesReserves = datesReserves;
  }

}
