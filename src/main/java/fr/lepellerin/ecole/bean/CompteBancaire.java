package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the comptes_bancaires database table.
 * 
 */
@Entity
@Table(name = "comptes_bancaires")

public class CompteBancaire implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcompte;

  @Lob
  private String bic;

  @Lob
  @Column(name = "cle_iban")
  private String cleIban;

  @Lob
  @Column(name = "cle_rib")
  private String cleRib;

  @Lob
  @Column(name = "code_etab")
  private String codeEtab;

  @Lob
  @Column(name = "code_guichet")
  private String codeGuichet;

  @Lob
  @Column(name = "code_ics")
  private String codeIcs;

  @Lob
  @Column(name = "code_nne")
  private String codeNne;

  private int defaut;

  @Lob
  private String iban;

  private String nom;

  private String numero;

  @Lob
  private String raison;

  public CompteBancaire() {
  }

  public int getIDcompte() {
    return this.IDcompte;
  }

  public void setIDcompte(int IDcompte) {
    this.IDcompte = IDcompte;
  }

  public String getBic() {
    return this.bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public String getCleIban() {
    return this.cleIban;
  }

  public void setCleIban(String cleIban) {
    this.cleIban = cleIban;
  }

  public String getCleRib() {
    return this.cleRib;
  }

  public void setCleRib(String cleRib) {
    this.cleRib = cleRib;
  }

  public String getCodeEtab() {
    return this.codeEtab;
  }

  public void setCodeEtab(String codeEtab) {
    this.codeEtab = codeEtab;
  }

  public String getCodeGuichet() {
    return this.codeGuichet;
  }

  public void setCodeGuichet(String codeGuichet) {
    this.codeGuichet = codeGuichet;
  }

  public String getCodeIcs() {
    return this.codeIcs;
  }

  public void setCodeIcs(String codeIcs) {
    this.codeIcs = codeIcs;
  }

  public String getCodeNne() {
    return this.codeNne;
  }

  public void setCodeNne(String codeNne) {
    this.codeNne = codeNne;
  }

  public int getDefaut() {
    return this.defaut;
  }

  public void setDefaut(int defaut) {
    this.defaut = defaut;
  }

  public String getIban() {
    return this.iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getNumero() {
    return this.numero;
  }

  public void setNumero(String numero) {
    this.numero = numero;
  }

  public String getRaison() {
    return this.raison;
  }

  public void setRaison(String raison) {
    this.raison = raison;
  }

}