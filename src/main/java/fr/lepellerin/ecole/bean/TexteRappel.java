package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the textes_rappels database table.
 * 
 */
@Entity
@Table(name = "textes_rappels")

public class TexteRappel implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDtexte;

  private String couleur;

  private String label;

  @Column(name = "retard_max")
  private int retardMax;

  @Column(name = "retard_min")
  private int retardMin;

  @Lob
  @Column(name = "texte_pdf")
  private String textePdf;

  @Lob
  @Column(name = "texte_xml")
  private String texteXml;

  private String titre;

  public TexteRappel() {
  }

  public int getIDtexte() {
    return this.IDtexte;
  }

  public void setIDtexte(int IDtexte) {
    this.IDtexte = IDtexte;
  }

  public String getCouleur() {
    return this.couleur;
  }

  public void setCouleur(String couleur) {
    this.couleur = couleur;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public int getRetardMax() {
    return this.retardMax;
  }

  public void setRetardMax(int retardMax) {
    this.retardMax = retardMax;
  }

  public int getRetardMin() {
    return this.retardMin;
  }

  public void setRetardMin(int retardMin) {
    this.retardMin = retardMin;
  }

  public String getTextePdf() {
    return this.textePdf;
  }

  public void setTextePdf(String textePdf) {
    this.textePdf = textePdf;
  }

  public String getTexteXml() {
    return this.texteXml;
  }

  public void setTexteXml(String texteXml) {
    this.texteXml = texteXml;
  }

  public String getTitre() {
    return this.titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

}