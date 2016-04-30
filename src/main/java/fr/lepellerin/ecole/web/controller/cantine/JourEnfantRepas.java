package fr.lepellerin.ecole.web.controller.cantine;

import fr.lepellerin.ecole.bean.Individu;

public class JourEnfantRepas {

  private Individu enfant;

  private boolean reservable;

  private boolean reserve;

  public Individu getEnfant() {
    return enfant;
  }

  public void setEnfant(Individu enfant) {
    this.enfant = enfant;
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
