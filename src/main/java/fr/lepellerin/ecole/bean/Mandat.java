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
 * The persistent class for the mandats database table.
 * 
 */
@Entity
@Table(name = "mandats")

public class Mandat implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDmandat;

  private int actif;

  private String bic;

  private String date;

  private String iban;

  @ManyToOne
  @JoinColumn(name = "IDbanque")
  private Banque banque;

  @ManyToOne
  @JoinColumn(name = "IDfamille")
  private Famille famille;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  @Column(name = "individu_cp")
  private String individuCp;

  @Lob
  @Column(name = "individu_nom")
  private String individuNom;

  @Lob
  @Column(name = "individu_rue")
  private String individuRue;

  @Lob
  @Column(name = "individu_ville")
  private String individuVille;

  @Lob
  private String memo;

  private String rum;

  private String sequence;

  private String type;

  public Mandat() {
  }

  public int getIDmandat() {
    return this.IDmandat;
  }

  public void setIDmandat(int IDmandat) {
    this.IDmandat = IDmandat;
  }

  public int getActif() {
    return this.actif;
  }

  public void setActif(int actif) {
    this.actif = actif;
  }

  public String getBic() {
    return this.bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getIban() {
    return this.iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public Banque getBanque() {
    return banque;
  }

  public void setBanque(Banque banque) {
    this.banque = banque;
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

  public String getIndividuCp() {
    return this.individuCp;
  }

  public void setIndividuCp(String individuCp) {
    this.individuCp = individuCp;
  }

  public String getIndividuNom() {
    return this.individuNom;
  }

  public void setIndividuNom(String individuNom) {
    this.individuNom = individuNom;
  }

  public String getIndividuRue() {
    return this.individuRue;
  }

  public void setIndividuRue(String individuRue) {
    this.individuRue = individuRue;
  }

  public String getIndividuVille() {
    return this.individuVille;
  }

  public void setIndividuVille(String individuVille) {
    this.individuVille = individuVille;
  }

  public String getMemo() {
    return this.memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public String getRum() {
    return this.rum;
  }

  public void setRum(String rum) {
    this.rum = rum;
  }

  public String getSequence() {
    return this.sequence;
  }

  public void setSequence(String sequence) {
    this.sequence = sequence;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}