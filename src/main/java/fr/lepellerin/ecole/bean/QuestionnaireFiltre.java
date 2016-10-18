/*
   Copyright (C)  Seun Landsberg 2016

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program; if not, see <http://www.gnu.org/licenses/>.
*/


package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
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
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDfiltre")
  private int id;

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

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
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