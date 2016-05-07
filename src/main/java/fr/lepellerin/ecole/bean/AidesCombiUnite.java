package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the aides_combi_unites database table.
 * 
 */
@Entity
@Table(name = "aides_combi_unites")
public class AidesCombiUnite implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDaide_combi_unite;

  @ManyToOne
  @JoinColumn(name = "IDaide")
  private Aide aide;

  @ManyToOne
  @JoinColumn(name = "IDaide_combi")
  private AidesCombinaison aideCombinaison;

  private int IDunite;

  public AidesCombiUnite() {
  }

  public int getIDaide_combi_unite() {
    return this.IDaide_combi_unite;
  }

  public void setIDaide_combi_unite(int IDaide_combi_unite) {
    this.IDaide_combi_unite = IDaide_combi_unite;
  }

  public Aide getAide() {
    return aide;
  }

  public void setAide(Aide aide) {
    this.aide = aide;
  }

  public AidesCombinaison getAideCombinaison() {
    return aideCombinaison;
  }

  public void setAideCombinaison(AidesCombinaison aideCombinaison) {
    this.aideCombinaison = aideCombinaison;
  }

  public int getIDunite() {
    return this.IDunite;
  }

  public void setIDunite(int IDunite) {
    this.IDunite = IDunite;
  }

}