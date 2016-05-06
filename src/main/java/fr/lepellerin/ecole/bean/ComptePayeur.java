package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the comptes_payeurs database table.
 * 
 */
@Entity
@Table(name = "comptes_payeurs")

public class ComptePayeur implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue
  @Column(name = "IDcompte_payeur")
  private int id;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  public ComptePayeur() {
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(Famille famille) {
    this.famille = famille;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

}