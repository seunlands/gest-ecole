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