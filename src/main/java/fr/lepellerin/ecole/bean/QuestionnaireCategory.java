package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the questionnaire_categories database table.
 * 
 */
@Entity
@Table(name = "questionnaire_categories")

public class QuestionnaireCategory implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcategorie;

  private String couleur;

  @Lob
  private String label;

  private int ordre;

  private String type;

  private int visible;

  public QuestionnaireCategory() {
  }

  public int getIDcategorie() {
    return this.IDcategorie;
  }

  public void setIDcategorie(int IDcategorie) {
    this.IDcategorie = IDcategorie;
  }

  public String getCouleur() {
    return this.couleur;
  }

  public void setCouleur(String couleur) {
    this.couleur = couleur;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public int getOrdre() {
    return this.ordre;
  }

  public void setOrdre(int ordre) {
    this.ordre = ordre;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public int getVisible() {
    return this.visible;
  }

  public void setVisible(int visible) {
    this.visible = visible;
  }

}