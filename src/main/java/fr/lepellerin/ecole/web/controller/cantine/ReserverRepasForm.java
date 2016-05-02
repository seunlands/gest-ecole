package fr.lepellerin.ecole.web.controller.cantine;

public class ReserverRepasForm {

  private String anneeMois;

  private boolean lundi;
  private boolean mardi;
  private boolean jeudi;
  private boolean vendredi;

  private boolean presLundi;
  private boolean presMardi;
  private boolean presJeudi;
  private boolean presVendredi;

  public boolean isPresLundi() {
    return presLundi;
  }

  public void setPresLundi(boolean presLundi) {
    this.presLundi = presLundi;
  }

  public boolean isPresMardi() {
    return presMardi;
  }

  public void setPresMardi(boolean presMardi) {
    this.presMardi = presMardi;
  }

  public boolean isPresJeudi() {
    return presJeudi;
  }

  public void setPresJeudi(boolean presJeudi) {
    this.presJeudi = presJeudi;
  }

  public boolean isPresVendredi() {
    return presVendredi;
  }

  public void setPresVendredi(boolean presVendredi) {
    this.presVendredi = presVendredi;
  }

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

  public String getAnneeMois() {
    return anneeMois;
  }

  public void setAnneeMois(String anneeMois) {
    this.anneeMois = anneeMois;
  }
}
