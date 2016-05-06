package fr.lepellerin.ecole.service.dto;

public class IndividuDto {

  private boolean ouverte;
  private boolean reserve;

  public boolean isOuverte() {
    return ouverte;
  }

  public void setOuverte(boolean ouverte) {
    this.ouverte = ouverte;
  }

  public boolean isReserve() {
    return reserve;
  }

  public void setReserve(boolean reserve) {
    this.reserve = reserve;
  }

}
