package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * The persistent class for the utilisateurs database table.
 * 
 */
@Entity
@Table(name = "utilisateurs")

public class Utilisateur implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDutilisateur;

  private int actif;

  private String image;

  private String mdp;

  private String nom;

  private String prenom;

  private String profil;

  private String sexe;

  public Utilisateur() {
  }

  public int getIDutilisateur() {
    return this.IDutilisateur;
  }

  public void setIDutilisateur(int IDutilisateur) {
    this.IDutilisateur = IDutilisateur;
  }

  public int getActif() {
    return this.actif;
  }

  public void setActif(int actif) {
    this.actif = actif;
  }

  public String getImage() {
    return this.image;
  }

  public void setImage(String image) {
    this.image = image;
  }

  public String getMdp() {
    return this.mdp;
  }

  public void setMdp(String mdp) {
    this.mdp = mdp;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getPrenom() {
    return this.prenom;
  }

  public void setPrenom(String prenom) {
    this.prenom = prenom;
  }

  public String getProfil() {
    return this.profil;
  }

  public void setProfil(String profil) {
    this.profil = profil;
  }

  public String getSexe() {
    return this.sexe;
  }

  public void setSexe(String sexe) {
    this.sexe = sexe;
  }

}