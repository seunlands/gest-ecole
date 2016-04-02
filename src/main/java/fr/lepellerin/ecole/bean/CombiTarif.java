package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the combi_tarifs database table.
 * 
 */
@Entity
@Table(name = "combi_tarifs")

public class CombiTarif implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcombi_tarif;

  private String date;

  @ManyToOne
  @JoinColumn(name = "IDgroupe")
  private Groupe groupe;

  @ManyToOne
  @JoinColumn(name = "IDtarif")
  private Tarif tarif;

  @Column(name = "quantite_max")
  private int quantiteMax;

  private String type;

  public CombiTarif() {
  }

  public int getIDcombi_tarif() {
    return this.IDcombi_tarif;
  }

  public void setIDcombi_tarif(int IDcombi_tarif) {
    this.IDcombi_tarif = IDcombi_tarif;
  }

  public String getDate() {
    return this.date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Groupe getGroupe() {
    return groupe;
  }

  public void setGroupe(Groupe groupe) {
    this.groupe = groupe;
  }

  public Tarif getTarif() {
    return tarif;
  }

  public void setTarif(Tarif tarif) {
    this.tarif = tarif;
  }

  public int getQuantiteMax() {
    return this.quantiteMax;
  }

  public void setQuantiteMax(int quantiteMax) {
    this.quantiteMax = quantiteMax;
  }

  public String getType() {
    return this.type;
  }

  public void setType(String type) {
    this.type = type;
  }

}