package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


/**
 * The persistent class for the remplissage database table.
 * 
 */
@Entity

public class Remplissage implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDremplissage;

  private String date;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDgroupe")
  private Groupe groupe;

  @ManyToOne
  @JoinColumn(name = "IDunite_remplissage")
  private UniteRemplissage uniteRemplissage;

  private int places;

  public Remplissage() {
  }

  public int getIDremplissage() {
    return this.IDremplissage;
  }

  public void setIDremplissage(int IDremplissage) {
    this.IDremplissage = IDremplissage;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public Groupe getGroupe() {
    return groupe;
  }

  public void setGroupe(Groupe groupe) {
    this.groupe = groupe;
  }

  public UniteRemplissage getUniteRemplissage() {
    return uniteRemplissage;
  }

  public void setUniteRemplissage(UniteRemplissage uniteRemplissage) {
    this.uniteRemplissage = uniteRemplissage;
  }

  public int getPlaces() {
    return this.places;
  }

  public void setPlaces(int places) {
    this.places = places;
  }

}