package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the unites_groupes database table.
 * 
 */
@Entity
@Table(name = "unites_groupes")

public class UniteGroupe implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDunite_groupe;

  @ManyToOne
  @JoinColumn(name = "IDgroupe")
  private Groupe groupe;

  @ManyToOne
  @JoinColumn(name = "IDunite")
  private Unite unite;

  public UniteGroupe() {
  }

  public int getIDunite_groupe() {
    return this.IDunite_groupe;
  }

  public void setIDunite_groupe(int IDunite_groupe) {
    this.IDunite_groupe = IDunite_groupe;
  }

  public Groupe getGroupe() {
    return groupe;
  }

  public void setGroupe(Groupe groupe) {
    this.groupe = groupe;
  }

  public Unite getUnite() {
    return unite;
  }

  public void setUnite(Unite unite) {
    this.unite = unite;
  }

}