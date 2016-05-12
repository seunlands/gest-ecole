package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the emetteurs database table.
 * 
 */
@Entity
@Table(name = "emetteurs")

public class Emetteur implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDemetteur;

  @ManyToOne
  @JoinColumn(name = "IDmode")
  private ModeReglement mode;

  @Lob
  private byte[] image;

  private String nom;

  public Emetteur() {
  }

  public int getIDemetteur() {
    return this.IDemetteur;
  }

  public void setIDemetteur(int IDemetteur) {
    this.IDemetteur = IDemetteur;
  }

  public ModeReglement getMode() {
    return mode;
  }

  public void setMode(ModeReglement mode) {
    this.mode = mode;
  }

  public byte[] getImage() {
    return this.image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

}