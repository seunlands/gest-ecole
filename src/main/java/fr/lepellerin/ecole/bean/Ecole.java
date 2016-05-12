package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the ecoles database table.
 * 
 */
@Entity
@Table(name = "ecoles")

public class Ecole implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDecole;

  private String cp;

  private String fax;

  private String mail;

  @Lob
  private String nom;

  private String rue;

  private String secteurs;

  private String tel;

  private String ville;

  public Ecole() {
  }

  public int getIDecole() {
    return this.IDecole;
  }

  public void setIDecole(int IDecole) {
    this.IDecole = IDecole;
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

  public String getSecteurs() {
    return this.secteurs;
  }

  public void setSecteurs(String secteurs) {
    this.secteurs = secteurs;
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