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

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the questionnaire_choix database table.
 * 
 */
@Entity
@Table(name = "questionnaire_choix")

public class QuestionnaireChoix implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDchoix;

  @ManyToOne
  @JoinColumn(name = "IDquestion")
  private QuestionnaireQuestion question;

  @Lob
  private String label;

  private int ordre;

  private int visible;

  public QuestionnaireChoix() {
  }

  public int getIDchoix() {
    return this.IDchoix;
  }

  public void setIDchoix(int IDchoix) {
    this.IDchoix = IDchoix;
  }

  public QuestionnaireQuestion getQuestion() {
    return question;
  }

  public void setQuestion(QuestionnaireQuestion question) {
    this.question = question;
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

  public int getVisible() {
    return this.visible;
  }

  public void setVisible(int visible) {
    this.visible = visible;
  }

}