package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the compta_categories_budget database table.
 * 
 */
@Entity
@Table(name = "compta_categories_budget")
public class ComptaCategoriesBudget implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcategorie_budget;

  @ManyToOne
  @JoinColumn(name = "IDbudget")
  private ComptaBudget budget;

  @ManyToOne
  @JoinColumn(name = "IDcategorie")
  private ComptaCategorie categorie;

  private String type;

  @Lob
  private String valeur;

  public ComptaCategoriesBudget() {
  }

  public int getIDcategorie_budget() {
    return this.IDcategorie_budget;
  }

  public void setIDcategorie_budget(int IDcategorie_budget) {
    this.IDcategorie_budget = IDcategorie_budget;
  }

  public ComptaBudget getBudget() {
    return budget;
  }

  public void setBudget(ComptaBudget budget) {
    this.budget = budget;
  }

  public ComptaCategorie getCategorie() {
    return categorie;
  }

  public void setCategorie(ComptaCategorie categorie) {
    this.categorie = categorie;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getValeur() {
    return this.valeur;
  }

  public void setValeur(String valeur) {
    this.valeur = valeur;
  }

}