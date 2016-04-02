package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the corrections_phoniques database table.
 * 
 */
@Entity
@Table(name = "corrections_phoniques")

public class CorrectionPhonique implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcorrection;

  @Lob
  private String correction;

  @Lob
  private String mot;

  public CorrectionPhonique() {
  }

  public int getIDcorrection() {
    return this.IDcorrection;
  }

  public void setIDcorrection(int IDcorrection) {
    this.IDcorrection = IDcorrection;
  }

  public String getCorrection() {
    return this.correction;
  }

  public void setCorrection(String correction) {
    this.correction = correction;
  }

  public String getMot() {
    return this.mot;
  }

  public void setMot(String mot) {
    this.mot = mot;
  }

}