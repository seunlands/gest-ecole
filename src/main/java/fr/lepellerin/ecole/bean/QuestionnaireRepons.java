package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the questionnaire_reponses database table.
 * 
 */
@Entity
@Table(name = "questionnaire_reponses")

public class QuestionnaireRepons implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDreponse;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  @ManyToOne
  @JoinColumn(name = "IDquestion")
  private QuestionnaireQuestion question;

  @Lob
  private String reponse;

  public QuestionnaireRepons() {
  }

  public int getIDreponse() {
    return this.IDreponse;
  }

  public void setIDreponse(int IDreponse) {
    this.IDreponse = IDreponse;
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

  public QuestionnaireQuestion getQuestion() {
    return question;
  }

  public void setQuestion(QuestionnaireQuestion question) {
    this.question = question;
  }

  public String getReponse() {
    return this.reponse;
  }

  public void setReponse(String reponse) {
    this.reponse = reponse;
  }

}