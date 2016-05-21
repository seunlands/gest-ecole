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
  private int IDvirement;

  private int IDoperation_credit;

  private int IDoperation_debit;

  public ComptaVirement() {
  }

  public int getIDvirement() {
    return this.IDvirement;
  }

  public void setIDvirement(int IDvirement) {
    this.IDvirement = IDvirement;
  }

  public int getIDoperation_credit() {
    return this.IDoperation_credit;
  }

  public void setIDoperation_credit(int IDoperation_credit) {
    this.IDoperation_credit = IDoperation_credit;
  }

  public int getIDoperation_debit() {
    return this.IDoperation_debit;
  }

  public void setIDoperation_debit(int IDoperation_debit) {
    this.IDoperation_debit = IDoperation_debit;
  }

}