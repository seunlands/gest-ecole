package fr.lepellerin.ecole.bean;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * The persistent class for the ouvertures database table.
 * 
 */
@Entity
@Table(name = "ouvertures")

public class Ouverture implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @Column(name = "IDouverture")
  private int id;

  @Temporal(TemporalType.DATE)
  private Date date;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDgroupe")
  private Groupe groupe;

  @ManyToOne
  @JoinColumn(name = "IDunite")
  private Unite unite;

  public Ouverture() {
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Date getDate() {
    return this.date;
  }

  public void setDate(Date date) {
    this.date = date;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public Groupe getGroupe() {
    return groupe;
  }

  public void setGroupe(Groupe groupe) {
    this.groupe = groupe;
  }

  public Unite getUnite() {
    return unite;
  }

  public void setUnite(Unite unite) {
    this.unite = unite;
  }

}