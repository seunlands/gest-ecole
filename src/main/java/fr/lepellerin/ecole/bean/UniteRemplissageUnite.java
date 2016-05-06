package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the unites_remplissage_unites database table.
 * 
 */
@Entity
@Table(name = "unites_remplissage_unites")

public class UniteRemplissageUnite implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDunite_remplissage_unite;

  @ManyToOne
  @JoinColumn(name = "IDunite")
  private Unite unite;

  @ManyToOne
  @JoinColumn(name = "IDunite_remplissage")
  private UniteRemplissage uniteRemplissage;

  public UniteRemplissageUnite() {
  }

  public int getIDunite_remplissage_unite() {
    return this.IDunite_remplissage_unite;
  }

  public void setIDunite_remplissage_unite(int IDunite_remplissage_unite) {
    this.IDunite_remplissage_unite = IDunite_remplissage_unite;
  }

  public Unite getUnite() {
    return unite;
  }

  public void setUnite(Unite unite) {
    this.unite = unite;
  }

  public UniteRemplissage getUniteRemplissage() {
    return uniteRemplissage;
  }

  public void setUniteRemplissage(UniteRemplissage uniteRemplissage) {
    this.uniteRemplissage = uniteRemplissage;
  }

}