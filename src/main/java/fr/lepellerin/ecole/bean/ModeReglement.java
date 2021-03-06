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
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the modes_reglements database table.
 * 
 */
@Entity
@Table(name = "modes_reglements")

public class ModeReglement implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @Column(name = "IDmode")
  private int id;

  @Column(name = "code_compta")
  private String codeCompta;

  @Column(name = "frais_arrondi")
  private String fraisArrondi;

  @Column(name = "frais_gestion")
  private String fraisGestion;

  @Column(name = "frais_label")
  private String fraisLabel;

  @Column(name = "frais_montant")
  private double fraisMontant;

  @Column(name = "frais_pourcentage")
  private double fraisPourcentage;

  @Lob
  private byte[] image;

  private String label;

  @Column(name = "nbre_chiffres")
  private int nbreChiffres;

  @Column(name = "numero_piece")
  private String numeroPiece;

  @Column(name = "type_comptable")
  private String typeComptable;

  public int getIDmode() {
    return this.id;
  }

  public void setIDmode(int id) {
    this.id = id;
  }

  public String getCodeCompta() {
    return this.codeCompta;
  }

  public void setCodeCompta(String codeCompta) {
    this.codeCompta = codeCompta;
  }

  public String getFraisArrondi() {
    return this.fraisArrondi;
  }

  public void setFraisArrondi(String fraisArrondi) {
    this.fraisArrondi = fraisArrondi;
  }

  public String getFraisGestion() {
    return this.fraisGestion;
  }

  public void setFraisGestion(String fraisGestion) {
    this.fraisGestion = fraisGestion;
  }

  public String getFraisLabel() {
    return this.fraisLabel;
  }

  public void setFraisLabel(String fraisLabel) {
    this.fraisLabel = fraisLabel;
  }

  public double getFraisMontant() {
    return this.fraisMontant;
  }

  public void setFraisMontant(double fraisMontant) {
    this.fraisMontant = fraisMontant;
  }

  public double getFraisPourcentage() {
    return this.fraisPourcentage;
  }

  public void setFraisPourcentage(double fraisPourcentage) {
    this.fraisPourcentage = fraisPourcentage;
  }

  public byte[] getImage() {
    return this.image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public int getNbreChiffres() {
    return this.nbreChiffres;
  }

  public void setNbreChiffres(int nbreChiffres) {
    this.nbreChiffres = nbreChiffres;
  }

  public String getNumeroPiece() {
    return this.numeroPiece;
  }

  public void setNumeroPiece(String numeroPiece) {
    this.numeroPiece = numeroPiece;
  }

  public String getTypeComptable() {
    return this.typeComptable;
  }

  public void setTypeComptable(String typeComptable) {
    this.typeComptable = typeComptable;
  }

}