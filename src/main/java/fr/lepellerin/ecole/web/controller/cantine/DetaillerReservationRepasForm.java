package fr.lepellerin.ecole.web.controller.cantine;

import java.io.Serializable;

public class DetaillerReservationRepasForm implements Serializable {

  /**
   * serial UID.
   */
  private static final long serialVersionUID = 1L;

  private String anneeMois;

  public String getAnneeMois() {
    return anneeMois;
  }

  public void setAnneeMois(final String anneeMois) {
    this.anneeMois = anneeMois;
  }

}
