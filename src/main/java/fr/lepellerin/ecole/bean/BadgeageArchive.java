package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the badgeage_archives database table.
 * 
 */
@Entity
@Table(name = "badgeage_archives")
public class BadgeageArchive implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDarchive;

  private String codebarres;

  private String date;

  @Column(name = "date_archivage")
  private String dateArchivage;

  private String heure;

  public BadgeageArchive() {
  }

  public int getIDarchive() {
    return this.IDarchive;
  }

  public void setIDarchive(int IDarchive) {
    this.IDarchive = IDarchive;
  }

  public String getCodebarres() {
    return this.codebarres;
  }

  public void setCodebarres(String codebarres) {
    this.codebarres = codebarres;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public String getDateArchivage() {
    return this.dateArchivage;
  }

  public void setDateArchivage(String dateArchivage) {
    this.dateArchivage = dateArchivage;
  }

  public String getHeure() {
    return this.heure;
  }

  public void setHeure(String heure) {
    this.heure = heure;
  }

}