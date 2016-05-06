package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the recus database table.
 * 
 */
@Entity

public class Recus implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDrecu;

  @Column(name = "date_edition")
  private String dateEdition;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDreglement")
  private Reglement reglement;

  @ManyToOne
  @JoinColumn(name = "IDutilisateur")
  private Utilisateur utilisateur;

  private int numero;

  public Recus() {
  }

  public int getIDrecu() {
    return this.IDrecu;
  }

  public void setIDrecu(int IDrecu) {
    this.IDrecu = IDrecu;
  }

  public String getDateEdition() {
    return this.dateEdition;
  }

  public void setDateEdition(String dateEdition) {
    this.dateEdition = dateEdition;
  }

  public Famille getFamille() {
    return famille;
  }

  public void setFamille(Famille famille) {
    this.famille = famille;
  }

  public Reglement getReglement() {
    return reglement;
  }

  public void setReglement(Reglement reglement) {
    this.reglement = reglement;
  }

  public Utilisateur getUtilisateur() {
    return utilisateur;
  }

  public void setUtilisateur(Utilisateur utilisateur) {
    this.utilisateur = utilisateur;
  }

  public int getNumero() {
    return this.numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

}