package fr.lepellerin.ecole.service.dto;

import fr.lepellerin.ecole.bean.Activite;
import fr.lepellerin.ecole.bean.Individu;
import fr.lepellerin.ecole.bean.Unite;

import java.io.Serializable;
import java.time.LocalDate;

public class CaseDto implements Serializable {

  /**
   * serial UID.
   */
  private static final long serialVersionUID = 1L;

  private LocalDate date;

  private Unite unite;

  private Activite activite;

  private Individu individu;
  
  private boolean reservable;
  
  private boolean reserve;

  public LocalDate getDate() {
    return date;
  }

  public void setDate(final LocalDate date) {
    this.date = date;
  }

  public Unite getUnite() {
    return unite;
  }

  public void setUnite(final Unite unite) {
    this.unite = unite;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(final Activite activite) {
    this.activite = activite;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(final Individu individu) {
    this.individu = individu;
  }

  public boolean isReservable() {
    return reservable;
  }

  public void setReservable(boolean reservable) {
    this.reservable = reservable;
  }

  public boolean isReserve() {
    return reserve;
  }

  public void setReserve(boolean reserve) {
    this.reserve = reserve;
  }

}
