package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the transports_lieux database table.
 * 
 */
@Entity
@Table(name = "transports_lieux")

public class TransportLieu implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDlieu;

  private String categorie;

  private String cp;

  @Lob
  private String nom;

  private String ville;

  public TransportLieu() {
  }

  public int getIDlieu() {
    return this.IDlieu;
  }

  public void setIDlieu(int IDlieu) {
    this.IDlieu = IDlieu;
  }

  public String getCategorie() {
    return this.categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }

  public String getCp() {
    return this.cp;
  }

  public void setCp(String cp) {
    this.cp = cp;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getVille() {
    return this.ville;
  }

  public void setVille(String ville) {
    this.ville = ville;
  }

}