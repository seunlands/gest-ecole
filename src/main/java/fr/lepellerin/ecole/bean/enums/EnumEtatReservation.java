package fr.lepellerin.ecole.bean.enums;

public enum EnumEtatReservation {

  RESERVE("reservation"),

  ABS_JUSTIFIE("absentj");

  private final String libelle;

  private EnumEtatReservation(String libelle) {
    this.libelle = libelle;
  }

  public String getLibelle() {
    return libelle;
  }

}
