package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the nomade_archivage database table.
 * 
 */
@Entity
@Table(name = "nomade_archivage")

public class NomadeArchivage implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDarchive;

  private String date;

  private String ID_appareil;

  @Lob
  @Column(name = "nom_fichier")
  private String nomFichier;

  public NomadeArchivage() {
  }

  public int getIDarchive() {
    return this.IDarchive;
  }

  public void setIDarchive(int IDarchive) {
    this.IDarchive = IDarchive;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getID_appareil() {
    return this.ID_appareil;
  }

  public void setID_appareil(String ID_appareil) {
    this.ID_appareil = ID_appareil;
  }

  public String getNomFichier() {
    return this.nomFichier;
  }

  public void setNomFichier(String nomFichier) {
    this.nomFichier = nomFichier;
  }

}