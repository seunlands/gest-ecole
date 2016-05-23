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
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the comptes_bancaires database table.
 *
 */
@Entity
@Table(name = "comptes_bancaires")

public class CompteBancaire implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDcompte")
  private int id;

  @Lob
  private String bic;

  @Lob
  @Column(name = "cle_iban")
  private String cleIban;

  @Lob
  @Column(name = "cle_rib")
  private String cleRib;

  @Lob
  @Column(name = "code_etab")
  private String codeEtab;

  @Lob
  @Column(name = "code_guichet")
  private String codeGuichet;

  @Lob
  @Column(name = "code_ics")
  private String codeIcs;

  @Lob
  @Column(name = "code_nne")
  private String codeNne;

  private int defaut;

  @Lob
  private String iban;

  private String nom;

  private String numero;

  @Lob
  private String raison;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public String getBic() {
    return this.bic;
  }

  public void setBic(final String bic) {
    this.bic = bic;
  }

  public String getCleIban() {
    return this.cleIban;
  }

  public void setCleIban(final String cleIban) {
    this.cleIban = cleIban;
  }

  public String getCleRib() {
    return this.cleRib;
  }

  public void setCleRib(final String cleRib) {
    this.cleRib = cleRib;
  }

  public String getCodeEtab() {
    return this.codeEtab;
  }

  public void setCodeEtab(final String codeEtab) {
    this.codeEtab = codeEtab;
  }

  public String getCodeGuichet() {
    return this.codeGuichet;
  }

  public void setCodeGuichet(final String codeGuichet) {
    this.codeGuichet = codeGuichet;
  }

  public String getCodeIcs() {
    return this.codeIcs;
  }

  public void setCodeIcs(final String codeIcs) {
    this.codeIcs = codeIcs;
  }

  public String getCodeNne() {
    return this.codeNne;
  }

  public void setCodeNne(final String codeNne) {
    this.codeNne = codeNne;
  }

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(final int defaut) {
    this.defaut = defaut;
  }

  public String getIban() {
    return this.iban;
  }

  public void setIban(final String iban) {
    this.iban = iban;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(final String nom) {
    this.nom = nom;
  }

  public String getNumero() {
    return this.numero;
  }

  public void setNumero(final String numero) {
    this.numero = numero;
  }

  public String getRaison() {
    return this.raison;
  }

  public void setRaison(final String raison) {
    this.raison = raison;
  }

}