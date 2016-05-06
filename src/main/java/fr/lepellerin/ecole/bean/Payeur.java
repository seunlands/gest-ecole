package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the payeurs database table.
 * 
 */
@Entity
@Table(name = "payeurs")

public class Payeur implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDpayeur;

  @ManyToOne
  @JoinColumn(name = "IDcompte_payeur")
  private ComptePayeur comptePayeur;

  private String nom;

  public Payeur() {
  }

  public int getIDpayeur() {
    return this.IDpayeur;
  }

  public void setIDpayeur(int IDpayeur) {
    this.IDpayeur = IDpayeur;
  }

  public ComptePayeur getComptePayeur() {
    return comptePayeur;
  }

  public void setComptePayeur(ComptePayeur comptePayeur) {
    this.comptePayeur = comptePayeur;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}