package fr.lepellerin.ecole.web.controller.cantine;

public class ReserverRepasForm {

  private boolean lundi;
  private boolean mardi;
  private boolean jeudi;
  private boolean vendredi;
  private boolean tousLesJours;

  public boolean isLundi() {
    return lundi;
  }

  public void setLundi(boolean lundi) {
    this.lundi = lundi;
  }

  public boolean isMardi() {
    return mardi;
  }

  public void setMardi(boolean mardi) {
    this.mardi = mardi;
  }

  public boolean isJeudi() {
    return jeudi;
  }

  public void setJeudi(boolean jeudi) {
    this.jeudi = jeudi;
  }

  public boolean isVendredi() {
    return vendredi;
  }

  public void setVendredi(boolean vendredi) {
    this.vendredi = vendredi;
  }

  public boolean isTousLesJours() {
    return tousLesJours;
  }

  public void setTousLesJours(boolean tousLesJours) {
    this.tousLesJours = tousLesJours;
  }

}
