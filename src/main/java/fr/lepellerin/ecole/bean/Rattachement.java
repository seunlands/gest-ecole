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
 * The persistent class for the rattachements database table.
 * 
 */
@Entity
@Table(name = "rattachements")

public class Rattachement implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue
  @Column(name = "IDrattachement")
  private int id;

  @Column(name = "IDcategorie")
  private int idCategorie;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  private int titulaire;

  public Rattachement() {
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getIdCategorie() {
    return this.idCategorie;
  }

  public void setIdCategorie(int idCategorie) {
    this.idCategorie = idCategorie;
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

  public int getTitulaire() {
    return this.titulaire;
  }

  public void setTitulaire(int titulaire) {
    this.titulaire = titulaire;
  }

}