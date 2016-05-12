package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * The persistent class for the factures_messages database table.
 * 
 */
@Entity
@Table(name = "factures_messages")

public class FacturesMessage implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDmessage;

  @Lob
  private String texte;

  private String titre;

  public FacturesMessage() {
  }

  public int getIDmessage() {
    return this.IDmessage;
  }

  public void setIDmessage(int IDmessage) {
    this.IDmessage = IDmessage;
  }

  public String getTexte() {
    return this.texte;
  }

  public void setTexte(String texte) {
    this.texte = texte;
  }

  public String getTitre() {
    return this.titre;
  }

  public void setTitre(String titre) {
    this.titre = titre;
  }

}