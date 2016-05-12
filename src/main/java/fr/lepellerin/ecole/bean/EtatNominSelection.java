package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the etat_nomin_selections database table.
 * 
 */
@Entity
@Table(name = "etat_nomin_selections")

public class EtatNominSelection implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDselection;

  @Lob
  private String code;

  @Lob
  private String IDprofil;

  private int ordre;

  public EtatNominSelection() {
  }

  public int getIDselection() {
    return this.IDselection;
  }

  public void setIDselection(int IDselection) {
    this.IDselection = IDselection;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getIDprofil() {
    return this.IDprofil;
  }

  public void setIDprofil(String IDprofil) {
    this.IDprofil = IDprofil;
  }

  public int getOrdre() {
    return this.ordre;
  }

  public void setOrdre(int ordre) {
    this.ordre = ordre;
  }

}