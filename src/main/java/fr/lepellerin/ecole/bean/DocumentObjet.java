/*
   Copyright (C)  Seun Landsberg 2016

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program; if not, see <http://www.gnu.org/licenses/>.
*/

package fr.lepellerin.ecole.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the documents_objets database table.
 *
 */
@Entity
@Table(name = "documents_objets")

public class DocumentObjet implements Serializable {
  private static final long serialVersionUID = 20160520L;

  @Id
  @GeneratedValue
  @Column(name = "IDobjet")
  private int id;

  private int afficheNumero;

  private String alignement;

  private String categorie;

  private String champ;

  private String couleurFond;

  private String couleurTexte;

  private String couleurTrait;

  private String coulRemplis;

  private double epaissTrait;

  private int familyPolice;

  private int hauteur;

  private int hauteurMax;

  private int hauteurMin;

  private int hauteurModifiable;

  @ManyToOne
  @JoinColumn(name = "IDmodele")
  private DocumentModele modele;

  @Lob
  private byte[] image;

  private int interditModifProportions;

  private double interligne;

  private int largeur;

  private int largeurMax;

  private int largeurMin;

  private int largeurModifiable;

  private int largeurTexte;

  private int nbreMax;

  private String nom;

  private String nomPolice;

  private String norme;

  private int obligatoire;

  private int ordre;

  private double padding;

  @Lob
  private String points;

  private int soulignePolice;

  private int stylePolice;

  private String styleRemplis;

  private String styleTrait;

  private int taillePolice;

  @Lob
  private String texte;

  private String typeImage;

  private int verrouillageHauteur;

  private int verrouillageLargeur;

  private int verrouillageProportions;

  private int verrouillageX;

  private int verrouillageY;

  private int weightPolice;

  @Column(name = "x")
  private int pointX;

  private int xmodifiable;

  @Column(name = "y")
  private int pointY;

  private int ymodifiable;

  public int getId() {
    return this.id;
  }

  public void setId(final int id) {
    this.id = id;
  }

  public int getAfficheNumero() {
    return this.afficheNumero;
  }

  public void setAfficheNumero(final int afficheNumero) {
    this.afficheNumero = afficheNumero;
  }

  public String getAlignement() {
    return this.alignement;
  }

  public void setAlignement(final String alignement) {
    this.alignement = alignement;
  }

  public String getCategorie() {
    return this.categorie;
  }

  public void setCategorie(final String categorie) {
    this.categorie = categorie;
  }

  public String getChamp() {
    return this.champ;
  }

  public void setChamp(final String champ) {
    this.champ = champ;
  }

  public String getCouleurFond() {
    return this.couleurFond;
  }

  public void setCouleurFond(final String couleurFond) {
    this.couleurFond = couleurFond;
  }

  public String getCouleurTexte() {
    return this.couleurTexte;
  }

  public void setCouleurTexte(final String couleurTexte) {
    this.couleurTexte = couleurTexte;
  }

  public String getCouleurTrait() {
    return this.couleurTrait;
  }

  public void setCouleurTrait(final String couleurTrait) {
    this.couleurTrait = couleurTrait;
  }

  public String getCoulRemplis() {
    return this.coulRemplis;
  }

  public void setCoulRemplis(final String coulRemplis) {
    this.coulRemplis = coulRemplis;
  }

  public double getEpaissTrait() {
    return this.epaissTrait;
  }

  public void setEpaissTrait(final double epaissTrait) {
    this.epaissTrait = epaissTrait;
  }

  public int getFamilyPolice() {
    return this.familyPolice;
  }

  public void setFamilyPolice(final int familyPolice) {
    this.familyPolice = familyPolice;
  }

  public int getHauteur() {
    return this.hauteur;
  }

  public void setHauteur(final int hauteur) {
    this.hauteur = hauteur;
  }

  public int getHauteurMax() {
    return this.hauteurMax;
  }

  public void setHauteurMax(final int hauteurMax) {
    this.hauteurMax = hauteurMax;
  }

  public int getHauteurMin() {
    return this.hauteurMin;
  }

  public void setHauteurMin(final int hauteurMin) {
    this.hauteurMin = hauteurMin;
  }

  public int getHauteurModifiable() {
    return this.hauteurModifiable;
  }

  public void setHauteurModifiable(final int hauteurModifiable) {
    this.hauteurModifiable = hauteurModifiable;
  }

  public DocumentModele getModele() {
    return modele;
  }

  public void setModele(final DocumentModele modele) {
    this.modele = modele;
  }

  public byte[] getImage() {
    return this.image;
  }

  public void setImage(final byte[] image) {
    this.image = image;
  }

  public int getInterditModifProportions() {
    return this.interditModifProportions;
  }

  public void setInterditModifProportions(final int interditModifProportions) {
    this.interditModifProportions = interditModifProportions;
  }

  public double getInterligne() {
    return this.interligne;
  }

  public void setInterligne(final double interligne) {
    this.interligne = interligne;
  }

  public int getLargeur() {
    return this.largeur;
  }

  public void setLargeur(final int largeur) {
    this.largeur = largeur;
  }

  public int getLargeurMax() {
    return this.largeurMax;
  }

  public void setLargeurMax(final int largeurMax) {
    this.largeurMax = largeurMax;
  }

  public int getLargeurMin() {
    return this.largeurMin;
  }

  public void setLargeurMin(final int largeurMin) {
    this.largeurMin = largeurMin;
  }

  public int getLargeurModifiable() {
    return this.largeurModifiable;
  }

  public void setLargeurModifiable(final int largeurModifiable) {
    this.largeurModifiable = largeurModifiable;
  }

  public int getLargeurTexte() {
    return this.largeurTexte;
  }

  public void setLargeurTexte(final int largeurTexte) {
    this.largeurTexte = largeurTexte;
  }

  public int getNbreMax() {
    return this.nbreMax;
  }

  public void setNbreMax(final int nbreMax) {
    this.nbreMax = nbreMax;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(final String nom) {
    this.nom = nom;
  }

  public String getNomPolice() {
    return this.nomPolice;
  }

  public void setNomPolice(final String nomPolice) {
    this.nomPolice = nomPolice;
  }

  public String getNorme() {
    return this.norme;
  }

  public void setNorme(final String norme) {
    this.norme = norme;
  }

  public int getObligatoire() {
    return this.obligatoire;
  }

  public void setObligatoire(final int obligatoire) {
    this.obligatoire = obligatoire;
  }

  public int getOrdre() {
    return this.ordre;
  }

  public void setOrdre(final int ordre) {
    this.ordre = ordre;
  }

  public double getPadding() {
    return this.padding;
  }

  public void setPadding(final double padding) {
    this.padding = padding;
  }

  public String getPoints() {
    return this.points;
  }

  public void setPoints(final String points) {
    this.points = points;
  }

  public int getSoulignePolice() {
    return this.soulignePolice;
  }

  public void setSoulignePolice(final int soulignePolice) {
    this.soulignePolice = soulignePolice;
  }

  public int getStylePolice() {
    return this.stylePolice;
  }

  public void setStylePolice(final int stylePolice) {
    this.stylePolice = stylePolice;
  }

  public String getStyleRemplis() {
    return this.styleRemplis;
  }

  public void setStyleRemplis(final String styleRemplis) {
    this.styleRemplis = styleRemplis;
  }

  public String getStyleTrait() {
    return this.styleTrait;
  }

  public void setStyleTrait(final String styleTrait) {
    this.styleTrait = styleTrait;
  }

  public int getTaillePolice() {
    return this.taillePolice;
  }

  public void setTaillePolice(final int taillePolice) {
    this.taillePolice = taillePolice;
  }

  public String getTexte() {
    return this.texte;
  }

  public void setTexte(final String texte) {
    this.texte = texte;
  }

  public String getTypeImage() {
    return this.typeImage;
  }

  public void setTypeImage(final String typeImage) {
    this.typeImage = typeImage;
  }

  public int getVerrouillageHauteur() {
    return this.verrouillageHauteur;
  }

  public void setVerrouillageHauteur(final int verrouillageHauteur) {
    this.verrouillageHauteur = verrouillageHauteur;
  }

  public int getVerrouillageLargeur() {
    return this.verrouillageLargeur;
  }

  public void setVerrouillageLargeur(final int verrouillageLargeur) {
    this.verrouillageLargeur = verrouillageLargeur;
  }

  public int getVerrouillageProportions() {
    return this.verrouillageProportions;
  }

  public void setVerrouillageProportions(final int verrouillageProportions) {
    this.verrouillageProportions = verrouillageProportions;
  }

  public int getVerrouillageX() {
    return this.verrouillageX;
  }

  public void setVerrouillageX(final int verrouillageX) {
    this.verrouillageX = verrouillageX;
  }

  public int getVerrouillageY() {
    return this.verrouillageY;
  }

  public void setVerrouillageY(final int verrouillageY) {
    this.verrouillageY = verrouillageY;
  }

  public int getWeightPolice() {
    return this.weightPolice;
  }

  public void setWeightPolice(final int weightPolice) {
    this.weightPolice = weightPolice;
  }

  public int getPointX() {
    return this.pointX;
  }

  public void setPointX(final int pointX) {
    this.pointX = pointX;
  }

  public int getXmodifiable() {
    return this.xmodifiable;
  }

  public void setXmodifiable(final int xmodifiable) {
    this.xmodifiable = xmodifiable;
  }

  public int getPointY() {
    return this.pointY;
  }

  public void setPointY(final int pointY) {
    this.pointY = pointY;
  }

  public int getYmodifiable() {
    return this.ymodifiable;
  }

  public void setYmodifiable(final int ymodifiable) {
    this.ymodifiable = ymodifiable;
  }

}