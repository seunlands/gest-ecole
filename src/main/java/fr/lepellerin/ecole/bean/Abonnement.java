package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the abonnements database table.
 * 
 */
@Entity
@Table(name = "abonnements")

public class Abonnement implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDabonnement;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  @ManyToOne
  @JoinColumn(name = "IDliste")
  private ListeDiffusion liste;

  public Abonnement() {
  }

  public int getIDabonnement() {
    return this.IDabonnement;
  }

  public void setIDabonnement(int IDabonnement) {
    this.IDabonnement = IDabonnement;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

  public ListeDiffusion getListe() {
    return liste;
  }

  public void setListe(ListeDiffusion liste) {
    this.liste = liste;
  }
}