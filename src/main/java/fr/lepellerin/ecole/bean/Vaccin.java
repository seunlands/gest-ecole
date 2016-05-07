package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the vaccins database table.
 * 
 */
@Entity
@Table(name = "vaccins")

public class Vaccin implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDvaccin;

  private String date;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  @ManyToOne
  @JoinColumn(name = "IDtype_vaccin")
  private TypeVaccin typeVaccin;

  public Vaccin() {
  }

  public int getIDvaccin() {
    return this.IDvaccin;
  }

  public void setIDvaccin(int IDvaccin) {
    this.IDvaccin = IDvaccin;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

  public TypeVaccin getTypeVaccin() {
    return typeVaccin;
  }

  public void setTypeVaccin(TypeVaccin typeVaccin) {
    this.typeVaccin = typeVaccin;
  }

}