package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the badgeage_procedures database table.
 * 
 */
@Entity
@Table(name = "badgeage_procedures")
public class BadgeageProcedure implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDprocedure;

  @Lob
  private String activites;

  private int confirmation;

  private int defaut;

  @Lob
  private String image;

  @Lob
  private String nom;

  @Lob
  private String style;

  @Lob
  private String systeme;

  @Lob
  private String theme;

  private int tutoiement;

  private int vocal;

  public BadgeageProcedure() {
  }

  public int getIDprocedure() {
    return this.IDprocedure;
  }

  public void setIDprocedure(int IDprocedure) {
    this.IDprocedure = IDprocedure;
  }

  public String getActivites() {
    return this.activites;
  }

  public void setActivites(String activites) {
    this.activites = activites;
  }

  public int getConfirmation() {
    return this.confirmation;
  }

  public void setConfirmation(int confirmation) {
    this.confirmation = confirmation;
  }

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(int defaut) {
    this.defaut = defaut;
  }

  public String getImage() {
    return this.image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getStyle() {
    return this.style;
  }

  public void setStyle(String style) {
    this.style = style;
  }

  public String getSysteme() {
    return this.systeme;
  }

  public void setSysteme(String systeme) {
    this.systeme = systeme;
  }

  public String getTheme() {
    return this.theme;
  }

  public void setTheme(String theme) {
    this.theme = theme;
  }

  public int getTutoiement() {
    return this.tutoiement;
  }

  public void setTutoiement(int tutoiement) {
    this.tutoiement = tutoiement;
  }

  public int getVocal() {
    return this.vocal;
  }

  public void setVocal(int vocal) {
    this.vocal = vocal;
  }

}