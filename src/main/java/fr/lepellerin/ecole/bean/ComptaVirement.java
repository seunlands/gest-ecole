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
  private static final long serialVersionUID = 1L;

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