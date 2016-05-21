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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the contrats_tarifs database table.
 * 
 */
@Entity
@Table(name = "contrats_tarifs")

public class ContratTarif implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDcontrat_tarif;

  @Column(name = "date_debut")
  private String dateDebut;

  @ManyToOne
  @JoinColumn(name = "IDcontrat")
  private Contrat contrat;

  private int quotient;

  private double revenu;

  @Column(name = "tarif_base")
  private double tarifBase;

  @Column(name = "tarif_depassement")
  private double tarifDepassement;

  private double taux;

  public ContratTarif() {
  }

  public int getIDcontrat_tarif() {
    return this.IDcontrat_tarif;
  }

  public void setIDcontrat_tarif(int IDcontrat_tarif) {
    this.IDcontrat_tarif = IDcontrat_tarif;
  }

  public String getDateDebut() {
    return this.dateDebut;
  }

  public void setDateDebut(String dateDebut) {
    this.dateDebut = dateDebut;
  }

  public Contrat getContrat() {
    return contrat;
  }

  public void setContrat(Contrat contrat) {
    this.contrat = contrat;
  }

  public int getQuotient() {
    return this.quotient;
  }

  public void setQuotient(int quotient) {
    this.quotient = quotient;
  }

  public double getRevenu() {
    return this.revenu;
  }

  public void setRevenu(double revenu) {
    this.revenu = revenu;
  }

  public double getTarifBase() {
    return this.tarifBase;
  }

  public void setTarifBase(double tarifBase) {
    this.tarifBase = tarifBase;
  }

  public double getTarifDepassement() {
    return this.tarifDepassement;
  }

  public void setTarifDepassement(double tarifDepassement) {
    this.tarifDepassement = tarifDepassement;
  }

  public double getTaux() {
    return this.taux;
  }

  public void setTaux(double taux) {
    this.taux = taux;
  }

}