package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the modeles_emails database table.
 * 
 */
@Entity
@Table(name = "modeles_emails")

public class ModeleEmail implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDmodele;

  @Lob
  private String categorie;

  private int defaut;

  @Lob
  private String description;

  @ManyToOne
  @JoinColumn(name = "IDadresse")
  private AdressesMail adresse;

  @Lob
  private String nom;

  @Lob
  private String objet;

  @Lob
  @Column(name = "texte_xml")
  private String texteXml;

  public ModeleEmail() {
  }

  public int getIDmodele() {
    return this.IDmodele;
  }

  public void setIDmodele(int IDmodele) {
    this.IDmodele = IDmodele;
  }

  public String getCategorie() {
    return this.categorie;
  }

  public void setCategorie(String categorie) {
    this.categorie = categorie;
  }

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(int defaut) {
    this.defaut = defaut;
  }

  public String getDescription() {
    return this.description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public AdressesMail getAdresse() {
    return adresse;
  }

  public void setAdresse(AdressesMail adresse) {
    this.adresse = adresse;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getObjet() {
    return this.objet;
  }

  public void setObjet(String objet) {
    this.objet = objet;
  }

  public String getTexteXml() {
    return this.texteXml;
  }

  public void setTexteXml(String texteXml) {
    this.texteXml = texteXml;
  }

}