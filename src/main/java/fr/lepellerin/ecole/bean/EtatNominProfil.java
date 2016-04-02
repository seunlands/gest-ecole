package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the etat_nomin_profils database table.
 * 
 */
@Entity
@Table(name = "etat_nomin_profils")

public class EtatNominProfil implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDprofil;

  @Lob
  private String label;

  public EtatNominProfil() {
  }

  public int getIDprofil() {
    return this.IDprofil;
  }

  public void setIDprofil(int IDprofil) {
    this.IDprofil = IDprofil;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

}