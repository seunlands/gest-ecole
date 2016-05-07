package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the questionnaire_questions database table.
 * 
 */
@Entity
@Table(name = "questionnaire_questions")

public class QuestionnaireQuestion implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDquestion;

  private String controle;

  @Lob
  private String defaut;

  @ManyToOne
  @JoinColumn(name = "IDcategorie")
  private QuestionnaireQuestion categorie;

  @Lob
  private String label;

  @Lob
  private String options;

  private int ordre;

  private int visible;

  public QuestionnaireQuestion() {
  }

  public int getIDquestion() {
    return this.IDquestion;
  }

  public void setIDquestion(int IDquestion) {
    this.IDquestion = IDquestion;
  }

  public String getControle() {
    return this.controle;
  }

  public void setControle(String controle) {
    this.controle = controle;
  }

  public String getDefaut() {
    return this.defaut;
  }

  public QuestionnaireQuestion getCategorie() {
    return categorie;
  }

  public void setCategorie(QuestionnaireQuestion categorie) {
    this.categorie = categorie;
  }

  public void setDefaut(String defaut) {
    this.defaut = defaut;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getOptions() {
    return this.options;
  }

  public void setOptions(String options) {
    this.options = options;
  }

  public int getOrdre() {
    return this.ordre;
  }

  public void setOrdre(int ordre) {
    this.ordre = ordre;
  }

  public int getVisible() {
    return this.visible;
  }

  public void setVisible(int visible) {
    this.visible = visible;
  }

}