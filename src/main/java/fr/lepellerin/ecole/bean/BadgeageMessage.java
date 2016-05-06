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
  private static final long serialVersionUID = 1L;

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