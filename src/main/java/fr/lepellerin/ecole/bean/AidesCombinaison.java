package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the aides_combinaisons database table.
 * 
 */
@Entity
@Table(name = "aides_combinaisons")
public class AidesCombinaison implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDaide_combi;

  @ManyToOne
  @JoinColumn(name = "IDaide")
  private Aide aide;

  private int IDaide_montant;

  public AidesCombinaison() {
  }

  public int getIDaide_combi() {
    return this.IDaide_combi;
  }

  public void setIDaide_combi(int IDaide_combi) {
    this.IDaide_combi = IDaide_combi;
  }

  public Aide getAide() {
    return aide;
  }

  public void setAide(Aide aide) {
    this.aide = aide;
  }

  public int getIDaide_montant() {
    return this.IDaide_montant;
  }

  public void setIDaide_montant(int IDaide_montant) {
    this.IDaide_montant = IDaide_montant;
  }

}