package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the adresses_mail database table.
 * 
 */
@Entity
@Table(name = "adresses_mail")

public class AdressesMail implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDadresse;

  private String adresse;

  private int connexionssl;

  private int defaut;

  private String motdepasse;

  private int port;

  private String smtp;

  public AdressesMail() {
  }

  public int getIDadresse() {
    return this.IDadresse;
  }

  public void setIDadresse(int IDadresse) {
    this.IDadresse = IDadresse;
  }

  public String getAdresse() {
    return this.adresse;
  }

  public void setAdresse(String adresse) {
    this.adresse = adresse;
  }

  public int getConnexionssl() {
    return this.connexionssl;
  }

  public void setConnexionssl(int connexionssl) {
    this.connexionssl = connexionssl;
  }

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(int defaut) {
    this.defaut = defaut;
  }

  public String getMotdepasse() {
    return this.motdepasse;
  }

  public void setMotdepasse(String motdepasse) {
    this.motdepasse = motdepasse;
  }

  public int getPort() {
    return this.port;
  }

  public void setPort(int port) {
    this.port = port;
  }

  public String getSmtp() {
    return this.smtp;
  }

  public void setSmtp(String smtp) {
    this.smtp = smtp;
  }

}