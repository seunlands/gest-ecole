package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the combi_tarifs_unites database table.
 * 
 */
@Entity
@Table(name = "combi_tarifs_unites")

public class CombiTarifsUnite implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDcombi_tarif_unite;

  @ManyToOne
  @JoinColumn(name = "IDcombi_tarif")
  private CombiTarif combiTarif;

  @ManyToOne
  @JoinColumn(name = "IDtarif")
  private Tarif IDtarif;

  @ManyToOne
  @JoinColumn(name = "IDunite")
  private Unite unite;

  public CombiTarifsUnite() {
  }

  public int getIDcombi_tarif_unite() {
    return this.IDcombi_tarif_unite;
  }

  public void setIDcombi_tarif_unite(int IDcombi_tarif_unite) {
    this.IDcombi_tarif_unite = IDcombi_tarif_unite;
  }

  public CombiTarif getCombiTarif() {
    return combiTarif;
  }

  public void setCombiTarif(CombiTarif combiTarif) {
    this.combiTarif = combiTarif;
  }

  public Tarif getIDtarif() {
    return IDtarif;
  }

  public void setIDtarif(Tarif iDtarif) {
    IDtarif = iDtarif;
  }

  public Unite getUnite() {
    return unite;
  }

  public void setUnite(Unite unite) {
    this.unite = unite;
  }

}