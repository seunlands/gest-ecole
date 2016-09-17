package fr.lepellerin.ecole.web.controller.admin;

import java.io.Serializable;

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

}
