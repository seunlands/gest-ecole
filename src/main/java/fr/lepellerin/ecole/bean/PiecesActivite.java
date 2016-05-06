package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the pieces_activites database table.
 * 
 */
@Entity
@Table(name = "pieces_activites")

public class PiecesActivite implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDpiece_activite;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDtype_piece")
  private TypePiece typePiece;

  public PiecesActivite() {
  }

  public int getIDpiece_activite() {
    return this.IDpiece_activite;
  }

  public void setIDpiece_activite(int IDpiece_activite) {
    this.IDpiece_activite = IDpiece_activite;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public TypePiece getTypePiece() {
    return typePiece;
  }

  public void setTypePiece(TypePiece typePiece) {
    this.typePiece = typePiece;
  }

}