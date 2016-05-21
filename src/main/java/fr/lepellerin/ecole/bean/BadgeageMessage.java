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
 * The persistent class for the badgeage_messages database table.
 * 
 */
@Entity
@Table(name = "badgeage_messages")
public class BadgeageMessage implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  private int IDmessage;

  @ManyToOne
  @JoinColumn(name = "IDaction")
  private BadgeageAction action;

  @ManyToOne
  @JoinColumn(name = "IDprocedure")
  private BadgeageProcedure procedure;

  @Lob
  private String message;

  public BadgeageMessage() {
  }

  public int getIDmessage() {
    return this.IDmessage;
  }

  public void setIDmessage(int IDmessage) {
    this.IDmessage = IDmessage;
  }

  public BadgeageAction getAction() {
    return action;
  }

  public void setAction(BadgeageAction action) {
    this.action = action;
  }

  public BadgeageProcedure getProcedure() {
    return procedure;
  }

  public void setProcedure(BadgeageProcedure procedure) {
    this.procedure = procedure;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}