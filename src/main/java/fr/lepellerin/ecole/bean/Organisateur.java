package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;


/**
 * The persistent class for the organisateur database table.
 * 
 */
@Entity

public class Organisateur implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDorganisateur;

  @Column(name = "code_ape")
  private String codeApe;

  private String cp;

  private String fax;

  private String gps;

  @Lob
  private byte[] logo;

  private String mail;

  private String nom;

  @Column(name = "num_agrement")
  private String numAgrement;

  @Column(name = "num_siret")
  private String numSiret;

  private String rue;

  private String site;

  private String tel;

  private String ville;

  public Organisateur() {
  }

  public int getIDorganisateur() {
    return this.IDorganisateur;
  }

  public void setIDorganisateur(int IDorganisateur) {
    this.IDorganisateur = IDorganisateur;
  }

  public String getCodeApe() {
    return this.codeApe;
  }

  public void setCodeApe(String codeApe) {
    this.codeApe = codeApe;
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

  public String getGps() {
    return this.gps;
  }

  public void setGps(String gps) {
    this.gps = gps;
  }

  public byte[] getLogo() {
    return this.logo;
  }

  public void setLogo(byte[] logo) {
    this.logo = logo;
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

  public String getNumAgrement() {
    return this.numAgrement;
  }

  public void setNumAgrement(String numAgrement) {
    this.numAgrement = numAgrement;
  }

  public String getNumSiret() {
    return this.numSiret;
  }

  public void setNumSiret(String numSiret) {
    this.numSiret = numSiret;
  }

  public String getRue() {
    return this.rue;
  }

  public void setRue(String rue) {
    this.rue = rue;
  }

  public String getSite() {
    return this.site;
  }

  public void setSite(String site) {
    this.site = site;
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