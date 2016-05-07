package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the messages_categories database table.
 * 
 */
@Entity
@Table(name = "messages_categories")

public class MessageCategorie implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcategorie;

  @Column(name = "afficher_accueil")
  private int afficherAccueil;

  @Column(name = "afficher_liste")
  private int afficherListe;

  private String nom;

  private String priorite;

  public MessageCategorie() {
  }

  public int getIDcategorie() {
    return this.IDcategorie;
  }

  public void setIDcategorie(int IDcategorie) {
    this.IDcategorie = IDcategorie;
  }

  public int getAfficherAccueil() {
    return this.afficherAccueil;
  }

  public void setAfficherAccueil(int afficherAccueil) {
    this.afficherAccueil = afficherAccueil;
  }

  public int getAfficherListe() {
    return this.afficherListe;
  }

  public void setAfficherListe(int afficherListe) {
    this.afficherListe = afficherListe;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPriorite() {
    return this.priorite;
  }

  public void setPriorite(String priorite) {
    this.priorite = priorite;
  }

}