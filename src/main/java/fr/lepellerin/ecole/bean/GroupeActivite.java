package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the groupes_activites database table.
 * 
 */
@Entity
@Table(name = "groupes_activites")

public class GroupeActivite implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDgroupe_activite;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDtype_groupe_activite")
  private TypeGroupeActivite typeGroupeActivite;

  public GroupeActivite() {
  }

  public int getIDgroupe_activite() {
    return this.IDgroupe_activite;
  }

  public void setIDgroupe_activite(int IDgroupe_activite) {
    this.IDgroupe_activite = IDgroupe_activite;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public TypeGroupeActivite getTypeGroupeActivite() {
    return typeGroupeActivite;
  }

  public void setTypeGroupeActivite(TypeGroupeActivite typeGroupeActivite) {
    this.typeGroupeActivite = typeGroupeActivite;
  }

}