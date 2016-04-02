package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the restaurateurs database table.
 * 
 */
@Entity
@Table(name = "restaurateurs")

public class Restaurateur implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDrestaurateur;

  private String cp;

  private String fax;

  private String mail;

  private String nom;

  private String rue;

  private String tel;

  private String ville;

  public Restaurateur() {
  }

  public int getIDrestaurateur() {
    return this.IDrestaurateur;
  }

  public void setIDrestaurateur(int IDrestaurateur) {
    this.IDrestaurateur = IDrestaurateur;
  }

  public String getCp() {
    return this.cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public String getFax() {
    return this.fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public String getMail() {
    return this.mail;
  }

  public void setMail(String mail) {
    this.mail = mail;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getRue() {
    return this.rue;
  }

  public void setRue(String rue) {
    this.rue = rue;
  }

  public String getTel() {
    return this.tel;
  }

  public void setTel(String tel) {
    this.tel = tel;
  }

  public String getVille() {
    return this.ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

}