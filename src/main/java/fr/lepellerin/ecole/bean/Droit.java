package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the droits database table.
 * 
 */
@Entity
@Table(name = "droits")

public class Droit implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDdroit;

  private String action;

  private String categorie;

  @Lob
  private String etat;

  @ManyToOne
  @JoinColumn(name = "IDmodele")
  private ModeleDroit modele;

  private int IDutilisateur;

  public Droit() {
  }

  public int getIDdroit() {
    return this.IDdroit;
  }

  public void setIDdroit(int IDdroit) {
    this.IDdroit = IDdroit;
  }

  public String getAction() {
    return this.action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public String getCategorie() {
    return this.categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }

  public String getEtat() {
    return this.etat;
  }

  public void setEtat(String etat) {
    this.etat = etat;
  }

  public ModeleDroit getModele() {
    return modele;
  }

  public void setModele(ModeleDroit modele) {
    this.modele = modele;
  }

  public int getIDutilisateur() {
    return this.IDutilisateur;
  }

  public void setIDutilisateur(int IDutilisateur) {
    this.IDutilisateur = IDutilisateur;
  }

}