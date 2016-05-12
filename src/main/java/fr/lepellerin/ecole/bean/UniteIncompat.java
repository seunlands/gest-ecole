package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the unites_incompat database table.
 * 
 */
@Entity
@Table(name = "unites_incompat")

public class UniteIncompat implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDunite_incompat;

  @ManyToOne
  @JoinColumn(name = "IDunite")
  private Unite unite;

  @ManyToOne
  @JoinColumn(name = "IDunite_incompatible")
  private Unite uniteIncompatible;

  public UniteIncompat() {
  }

  public int getIDunite_incompat() {
    return this.IDunite_incompat;
  }

  public void setIDunite_incompat(int IDunite_incompat) {
    this.IDunite_incompat = IDunite_incompat;
  }

  public Unite getUnite() {
    return unite;
  }

  public void setUnite(Unite unite) {
    this.unite = unite;
  }

  public Unite getUniteIncompatible() {
    return uniteIncompatible;
  }

  public void setUniteIncompatible(Unite uniteIncompatible) {
    this.uniteIncompatible = uniteIncompatible;
  }

}