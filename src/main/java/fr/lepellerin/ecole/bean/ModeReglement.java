package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the modes_reglements database table.
 * 
 */
@Entity
@Table(name = "modes_reglements")

public class ModeReglement implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDmode;

  @Column(name = "code_compta")
  private String codeCompta;

  @Column(name = "frais_arrondi")
  private String fraisArrondi;

  @Column(name = "frais_gestion")
  private String fraisGestion;

  @Column(name = "frais_label")
  private String fraisLabel;

  @Column(name = "frais_montant")
  private double fraisMontant;

  @Column(name = "frais_pourcentage")
  private double fraisPourcentage;

  @Lob
  private byte[] image;

  private String label;

  @Column(name = "nbre_chiffres")
  private int nbreChiffres;

  @Column(name = "numero_piece")
  private String numeroPiece;

  @Column(name = "type_comptable")
  private String typeComptable;

  public ModeReglement() {
  }

  public int getIDmode() {
    return this.IDmode;
  }

  public void setIDmode(int IDmode) {
    this.IDmode = IDmode;
  }

  public String getCodeCompta() {
    return this.codeCompta;
  }

  public void setCodeCompta(String codeCompta) {
    this.codeCompta = codeCompta;
  }

  public String getFraisArrondi() {
    return this.fraisArrondi;
  }

  public void setFraisArrondi(String fraisArrondi) {
    this.fraisArrondi = fraisArrondi;
  }

  public String getFraisGestion() {
    return this.fraisGestion;
  }

  public void setFraisGestion(String fraisGestion) {
    this.fraisGestion = fraisGestion;
  }

  public String getFraisLabel() {
    return this.fraisLabel;
  }

  public void setFraisLabel(String fraisLabel) {
    this.fraisLabel = fraisLabel;
  }

  public double getFraisMontant() {
    return this.fraisMontant;
  }

  public void setFraisMontant(double fraisMontant) {
    this.fraisMontant = fraisMontant;
  }

  public double getFraisPourcentage() {
    return this.fraisPourcentage;
  }

  public void setFraisPourcentage(double fraisPourcentage) {
    this.fraisPourcentage = fraisPourcentage;
  }

  public byte[] getImage() {
    return this.image;
  }

  public void setImage(byte[] image) {
    this.image = image;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public int getNbreChiffres() {
    return this.nbreChiffres;
  }

  public void setNbreChiffres(int nbreChiffres) {
    this.nbreChiffres = nbreChiffres;
  }

  public String getNumeroPiece() {
    return this.numeroPiece;
  }

  public void setNumeroPiece(String numeroPiece) {
    this.numeroPiece = numeroPiece;
  }

  public String getTypeComptable() {
    return this.typeComptable;
  }

  public void setTypeComptable(String typeComptable) {
    this.typeComptable = typeComptable;
  }

}