package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the compta_comptes_comptables database table.
 * 
 */
@Entity
@Table(name = "compta_comptes_comptables")

public class ComptaComptesComptable implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcompte;

  @Lob
  private String nom;

  private String numero;

  public ComptaComptesComptable() {
  }

  public int getIDcompte() {
    return this.IDcompte;
  }

  public void setIDcompte(int IDcompte) {
    this.IDcompte = IDcompte;
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

}