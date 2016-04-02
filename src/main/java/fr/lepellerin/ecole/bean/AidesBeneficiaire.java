package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the aides_beneficiaires database table.
 * 
 */
@Entity
@Table(name = "aides_beneficiaires")

public class AidesBeneficiaire implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDaide_beneficiaire;

  @ManyToOne
  @JoinColumn(name = "IDaide")
  private Aide aide;

  @ManyToOne
  @JoinColumn(name = "IDindividu")
  private Individu individu;

  public AidesBeneficiaire() {
  }

  public int getIDaide_beneficiaire() {
    return this.IDaide_beneficiaire;
  }

  public void setIDaide_beneficiaire(int IDaide_beneficiaire) {
    this.IDaide_beneficiaire = IDaide_beneficiaire;
  }

  public Aide getAide() {
    return aide;
  }

  public void setAide(Aide aide) {
    this.aide = aide;
  }

  public Individu getIndividu() {
    return individu;
  }

  public void setIndividu(Individu individu) {
    this.individu = individu;
  }

}