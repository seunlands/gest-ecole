package fr.lepellerin.ecole.web.controller.admin;

import java.io.Serializable;

import javax.validation.constraints.Pattern;

public class GererParametreForm implements Serializable {

  /**
   * SUID.
   */
  private static final long serialVersionUID = 1L;
  
  /**
   * id activite cantine selectionné.
   */
  private Integer idActCantine;
  
  /**
   * offset resa.
   */
  @Pattern(regexp = "^$|^[+-]?\\d{1,2}:[0-5]\\d$", message = "Le format est incorrect : [hh:mm]")
  private String offsetResa;


  /**
   * @return the idActCantine
   */
  public Integer getIdActCantine() {
    return idActCantine;
  }


  /**
   * @param idActCantine the idActCantine to set
   */
  public void setIdActCantine(Integer idActCantine) {
    this.idActCantine = idActCantine;
  }


  /**
   * @return the offsetResa
   */
  public String getOffsetResa() {
    return offsetResa;
  }


  /**
   * @param offsetResa the offsetResa to set
   */
  public void setOffsetResa(String offsetResa) {
    this.offsetResa = offsetResa;
  }

}
