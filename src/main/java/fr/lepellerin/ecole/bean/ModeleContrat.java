package fr.lepellerin.ecole.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * The persistent class for the modeles_contrats database table.
 * 
 */
@Entity
@Table(name = "modeles_contrats")

public class ModeleContrat implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  private int IDmodele;

  @Column(name = "date_debut")
  private String dateDebut;

  @Column(name = "date_fin")
  private String dateFin;

  @Lob
  private byte[] donnees;

  @ManyToOne
  @JoinColumn(name = "IDactivite")
  private Activite activite;

  @ManyToOne
  @JoinColumn(name = "IDtarif")
  private Tarif tarif;

  @Lob
  private String nom;

  @Lob
  private String observations;

  public ModeleContrat() {
  }

  public int getIDmodele() {
    return this.IDmodele;
  }

  public void setIDmodele(int IDmodele) {
    this.IDmodele = IDmodele;
  }

  public String getDateDebut() {
    return this.dateDebut;
  }

  public void setDateDebut(String dateDebut) {
    this.dateDebut = dateDebut;
  }

  public String getDateFin() {
    return this.dateFin;
  }

  public void setDateFin(String dateFin) {
    this.dateFin = dateFin;
  }

  public byte[] getDonnees() {
    return this.donnees;
  }

  public void setDonnees(byte[] donnees) {
    this.donnees = donnees;
  }

  public Activite getActivite() {
    return activite;
  }

  public void setActivite(Activite activite) {
    this.activite = activite;
  }

  public Tarif getTarif() {
    return tarif;
  }

  public void setTarif(Tarif tarif) {
    this.tarif = tarif;
  }

  public String getNom() {
    return this.nom;
  }

  public void setNom(String nom) {
    this.nom = nom;
  }

  public String getObservations() {
    return this.observations;
  }

  public void setObservations(String observations) {
    this.observations = observations;
  }

}