package fr.lepellerin.ecole.web.controller.cantine;

import java.io.Serializable;

public class DetaillerReservationRepasForm implements Serializable {

  /**
   * serial UID.
   */
  private static final long serialVersionUID = 1L;

  private Integer anneeMois;

  public Integer getAnneeMois() {
    return anneeMois;
  }

  public void setAnneeMois(final Integer anneeMois) {
    this.anneeMois = anneeMois;
  }

}
