package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the questionnaire_filtres database table.
 * 
 */
@Entity
@Table(name = "questionnaire_filtres")

public class QuestionnaireFiltre implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDfiltre;

  private String categorie;

  @Lob
  private String choix;

  @Lob
  private String criteres;

  @ManyToOne
  @JoinColumn(name = "IDquestion")
  private QuestionnaireQuestion question;

  @ManyToOne
  @JoinColumn(name = "IDtarif")
  private Tarif tarif;

  public QuestionnaireFiltre() {
  }

  public int getIDfiltre() {
    return this.IDfiltre;
  }

  public void setIDfiltre(int IDfiltre) {
    this.IDfiltre = IDfiltre;
  }

  public String getCategorie() {
    return this.categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }

  public String getChoix() {
    return this.choix;
  }

  public void setChoix(String choix) {
    this.choix = choix;
  }

  public String getCriteres() {
    return this.criteres;
  }

  public void setCriteres(String criteres) {
    this.criteres = criteres;
  }

  public QuestionnaireQuestion getQuestion() {
    return question;
  }

  public void setQuestion(QuestionnaireQuestion question) {
    this.question = question;
  }

  public Tarif getTarif() {
    return tarif;
  }

  public void setTarif(Tarif tarif) {
    this.tarif = tarif;
  }

}