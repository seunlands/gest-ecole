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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the aides_beneficiaires database table.
 * 
 */
@Entity
@Table(name = "aides_beneficiaires")

public class AidesBeneficiaire implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDaide_beneficiaire;

  @ManyToOne
  @JoinColumn(name = "IDaide")
  private Aide aide;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  public AidesBeneficiaire() {
  }

  public int getIDaide_beneficiaire() {
    return this.IDaide_beneficiaire;
  }

  public void setIDaide_beneficiaire(int IDaide_beneficiaire) {
    this.IDaide_beneficiaire = IDaide_beneficiaire;
  }

  public Aide getAide() {
    return aide;
  }

  public void setAide(Aide aide) {
    this.aide = aide;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

}