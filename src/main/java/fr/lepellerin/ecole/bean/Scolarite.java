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
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the scolarite database table.
 * 
 */
@Entity

public class Scolarite implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDscolarite")
  private int id;

  @Column(name = "date_debut")
  private Date dateDebut;

  @Column(name = "date_fin")
  private Date dateFin;

  @ManyToOne
  @JoinColumn(name = "IDclasse")
  private Classe classe;

  @ManyToOne
  @JoinColumn(name = "IDecole")
  private Ecole ecole;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  @ManyToOne
  @JoinColumn(name = "IDniveau")
  private NiveauScolaire niveau;

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getDateDebut() {
    return this.dateDebut;
  }

  public void setDateDebut(Date dateDebut) {
    this.dateDebut = dateDebut;
  }

  public Date getDateFin() {
    return this.dateFin;
  }

  public void setDateFin(Date dateFin) {
    this.dateFin = dateFin;
  }

  public Classe getClasse() {
    return classe;
  }

  public void setClasse(Classe classe) {
    this.classe = classe;
  }

  public Ecole getEcole() {
    return ecole;
  }

  public void setEcole(Ecole ecole) {
    this.ecole = ecole;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

  public NiveauScolaire getNiveau() {
    return niveau;
  }

  public void setNiveau(NiveauScolaire niveau) {
    this.niveau = niveau;
  }

}