package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the memo_journee database table.
 * 
 */
@Entity
@Table(name = "memo_journee")

public class MemoJournee implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDmemo;

  private String date;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  private String texte;

  public MemoJournee() {
  }

  public int getIDmemo() {
    return this.IDmemo;
  }

  public void setIDmemo(int IDmemo) {
    this.IDmemo = IDmemo;
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

  public String getTexte() {
    return this.texte;
  }

  public void setTexte(String texte) {
    this.texte = texte;
  }

}