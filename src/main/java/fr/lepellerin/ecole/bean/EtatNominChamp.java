package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the etat_nomin_champs database table.
 * 
 */
@Entity
@Table(name = "etat_nomin_champs")

public class EtatNominChamp implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDchamp;

  @Lob
  private String code;

  @Lob
  private String formule;

  @Lob
  private String label;

  @Lob
  private String titre;

  public EtatNominChamp() {
  }

  public int getIDchamp() {
    return this.IDchamp;
  }

  public void setIDchamp(int IDchamp) {
    this.IDchamp = IDchamp;
  }

  public String getCode() {
    return this.code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public String getFormule() {
    return this.formule;
  }

  public void setFormule(String formule) {
    this.formule = formule;
  }

  public String getLabel() {
    return this.label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public String getTitre() {
    return this.titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

}