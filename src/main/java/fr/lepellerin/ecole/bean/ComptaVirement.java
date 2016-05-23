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
import javax.persistence.Table;

/**
 * The persistent class for the compta_virements database table.
 *
 */
@Entity
@Table(name = "compta_virements")

public class ComptaVirement implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDvirement")
  private int id;

  @Column(name = "IDoperation_credit")
  private int idOperationCredit;

  @Column(name = "IDoperation_debit")
  private int idOperationDebit;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public int getIdOperationCredit() {
    return this.idOperationCredit;
  }

  public void setIdOperationCredit(final int idOperationCredit) {
    this.idOperationCredit = idOperationCredit;
  }

  public int getIdOperationDedit() {
    return this.idOperationDebit;
  }

  public void setIdOperationDedit(final int idOperationDebit) {
    this.idOperationDebit = idOperationDebit;
  }

}