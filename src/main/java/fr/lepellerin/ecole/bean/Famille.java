package fr.lepellerin.ecole.bean;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * The persistent class for the familles database table.
 * 
 */
@Entity
@Table(name = "familles")

public class Famille implements Serializable {
  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue
  @Column(name = "IDfamille")
  private int id;

  private Integer allocataire;

  @Column(name = "autorisation_cafpro")
  private Integer autorisationCafpro;

  @Column(name = "cattiers_helios")
  private Integer cattiersHelios;

  @Lob
  @Column(name = "code_comptable")
  private String codeComptable;

  @Column(name = "date_creation")
  private String dateCreation;

  @Lob
  @Column(name = "email_depots")
  private String emailDepots;

  @Lob
  @Column(name = "email_factures")
  private String emailFactures;

  @Lob
  @Column(name = "email_recus")
  private String emailRecus;

  @ManyToOne
  @JoinColumn(name = "IDcaisse")
  private Caisse caisse;

  @ManyToOne
  @JoinColumn(name = "IDcompte_payeur")
  private ComptePayeur comptePayeur;

  @Lob
  @Column(name = "idtiers_helios")
  private String idtiersHelios;

  @Column(name = "internet_actif")
  private int internetActif;

  @Column(name = "internet_identifiant")
  private String internetIdentifiant;

  @Column(name = "internet_mdp")
  private String internetMdp;

  @Lob
  private String memo;

  @Column(name = "natidtiers_helios")
  private Integer natidtiersHelios;

  @Column(name = "natjur_helios")
  private Integer natjurHelios;

  @Column(name = "num_allocataire")
  private String numAllocataire;

  @Column(name = "prelevement_activation")
  private Integer prelevementActivation;

  @Column(name = "prelevement_banque")
  private Integer prelevementBanque;

  @Column(name = "prelevement_bic")
  private String prelevementBic;

  @Column(name = "prelevement_cle")
  private String prelevementCle;

  @Column(name = "prelevement_cle_iban")
  private String prelevementCleIban;

  @Column(name = "prelevement_cp")
  private String prelevementCp;

  @Column(name = "prelevement_date_mandat")
  private String prelevementDateMandat;

  @Column(name = "prelevement_etab")
  private String prelevementEtab;

  @Column(name = "prelevement_guichet")
  private String prelevementGuichet;

  @Column(name = "prelevement_iban")
  private String prelevementIban;

  @Column(name = "prelevement_individu")
  private Integer prelevementIndividu;

  @Lob
  @Column(name = "prelevement_memo")
  private String prelevementMemo;

  @Column(name = "prelevement_nom")
  private String prelevementNom;

  @Column(name = "prelevement_numero")
  private String prelevementNumero;

  @Lob
  @Column(name = "prelevement_reference_mandat")
  private String prelevementReferenceMandat;

  @Lob
  @Column(name = "prelevement_rue")
  private String prelevementRue;

  @Lob
  @Column(name = "prelevement_ville")
  private String prelevementVille;

  @Lob
  @Column(name = "reftiers_helios")
  private String reftiersHelios;

  @Column(name = "titulaire_helios")
  private int titulaireHelios;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "famille")
  private Set<Rattachement> rattachements;

  public Famille() {
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public Integer getAllocataire() {
    return this.allocataire;
  }

  public void setAllocataire(Integer allocataire) {
    this.allocataire = allocataire;
  }

  public Integer getAutorisationCafpro() {
    return this.autorisationCafpro;
  }

  public void setAutorisationCafpro(Integer autorisationCafpro) {
    this.autorisationCafpro = autorisationCafpro;
  }

  public Integer getCattiersHelios() {
    return this.cattiersHelios;
  }

  public void setCattiersHelios(Integer cattiersHelios) {
    this.cattiersHelios = cattiersHelios;
  }

  public String getCodeComptable() {
    return this.codeComptable;
  }

  public void setCodeComptable(String codeComptable) {
    this.codeComptable = codeComptable;
  }

  public String getDateCreation() {
    return this.dateCreation;
  }

  public void setDateCreation(String dateCreation) {
    this.dateCreation = dateCreation;
  }

  public String getEmailDepots() {
    return this.emailDepots;
  }

  public void setEmailDepots(String emailDepots) {
    this.emailDepots = emailDepots;
  }

  public String getEmailFactures() {
    return this.emailFactures;
  }

  public void setEmailFactures(String emailFactures) {
    this.emailFactures = emailFactures;
  }

  public String getEmailRecus() {
    return this.emailRecus;
  }

  public void setEmailRecus(String emailRecus) {
    this.emailRecus = emailRecus;
  }

  public Caisse getCaisse() {
    return caisse;
  }

  public void setCaisse(Caisse caisse) {
    this.caisse = caisse;
  }

  public ComptePayeur getComptePayeur() {
    return comptePayeur;
  }

  public void setComptePayeur(ComptePayeur comptePayeur) {
    this.comptePayeur = comptePayeur;
  }

  public String getIdtiersHelios() {
    return this.idtiersHelios;
  }

  public void setIdtiersHelios(String idtiersHelios) {
    this.idtiersHelios = idtiersHelios;
  }

  public int getInternetActif() {
    return this.internetActif;
  }

  public void setInternetActif(int internetActif) {
    this.internetActif = internetActif;
  }

  public String getInternetIdentifiant() {
    return this.internetIdentifiant;
  }

  public void setInternetIdentifiant(String internetIdentifiant) {
    this.internetIdentifiant = internetIdentifiant;
  }

  public String getInternetMdp() {
    return this.internetMdp;
  }

  public void setInternetMdp(String internetMdp) {
    this.internetMdp = internetMdp;
  }

  public String getMemo() {
    return this.memo;
  }

  public void setMemo(String memo) {
    this.memo = memo;
  }

  public Integer getNatidtiersHelios() {
    return this.natidtiersHelios;
  }

  public void setNatidtiersHelios(Integer natidtiersHelios) {
    this.natidtiersHelios = natidtiersHelios;
  }

  public Integer getNatjurHelios() {
    return this.natjurHelios;
  }

  public void setNatjurHelios(Integer natjurHelios) {
    this.natjurHelios = natjurHelios;
  }

  public String getNumAllocataire() {
    return this.numAllocataire;
  }

  public void setNumAllocataire(String numAllocataire) {
    this.numAllocataire = numAllocataire;
  }

  public Integer getPrelevementActivation() {
    return this.prelevementActivation;
  }

  public void setPrelevementActivation(Integer prelevementActivation) {
    this.prelevementActivation = prelevementActivation;
  }

  public Integer getPrelevementBanque() {
    return this.prelevementBanque;
  }

  public void setPrelevementBanque(Integer prelevementBanque) {
    this.prelevementBanque = prelevementBanque;
  }

  public String getPrelevementBic() {
    return this.prelevementBic;
  }

  public void setPrelevementBic(String prelevementBic) {
    this.prelevementBic = prelevementBic;
  }

  public String getPrelevementCle() {
    return this.prelevementCle;
  }

  public void setPrelevementCle(String prelevementCle) {
    this.prelevementCle = prelevementCle;
  }

  public String getPrelevementCleIban() {
    return this.prelevementCleIban;
  }

  public void setPrelevementCleIban(String prelevementCleIban) {
    this.prelevementCleIban = prelevementCleIban;
  }

  public String getPrelevementCp() {
    return this.prelevementCp;
  }

  public void setPrelevementCp(String prelevementCp) {
    this.prelevementCp = prelevementCp;
  }

  public String getPrelevementDateMandat() {
    return this.prelevementDateMandat;
  }

  public void setPrelevementDateMandat(String prelevementDateMandat) {
    this.prelevementDateMandat = prelevementDateMandat;
  }

  public String getPrelevementEtab() {
    return this.prelevementEtab;
  }

  public void setPrelevementEtab(String prelevementEtab) {
    this.prelevementEtab = prelevementEtab;
  }

  public String getPrelevementGuichet() {
    return this.prelevementGuichet;
  }

  public void setPrelevementGuichet(String prelevementGuichet) {
    this.prelevementGuichet = prelevementGuichet;
  }

  public String getPrelevementIban() {
    return this.prelevementIban;
  }

  public void setPrelevementIban(String prelevementIban) {
    this.prelevementIban = prelevementIban;
  }

  public Integer getPrelevementIndividu() {
    return this.prelevementIndividu;
  }

  public void setPrelevementIndividu(Integer prelevementIndividu) {
    this.prelevementIndividu = prelevementIndividu;
  }

  public String getPrelevementMemo() {
    return this.prelevementMemo;
  }

  public void setPrelevementMemo(String prelevementMemo) {
    this.prelevementMemo = prelevementMemo;
  }

  public String getPrelevementNom() {
    return this.prelevementNom;
  }

  public void setPrelevementNom(String prelevementNom) {
    this.prelevementNom = prelevementNom;
  }

  public String getPrelevementNumero() {
    return this.prelevementNumero;
  }

  public void setPrelevementNumero(String prelevementNumero) {
    this.prelevementNumero = prelevementNumero;
  }

  public String getPrelevementReferenceMandat() {
    return this.prelevementReferenceMandat;
  }

  public void setPrelevementReferenceMandat(String prelevementReferenceMandat) {
    this.prelevementReferenceMandat = prelevementReferenceMandat;
  }

  public String getPrelevementRue() {
    return this.prelevementRue;
  }

  public void setPrelevementRue(String prelevementRue) {
    this.prelevementRue = prelevementRue;
  }

  public String getPrelevementVille() {
    return this.prelevementVille;
  }

  public void setPrelevementVille(String prelevementVille) {
    this.prelevementVille = prelevementVille;
  }

  public String getReftiersHelios() {
    return this.reftiersHelios;
  }

  public void setReftiersHelios(String reftiersHelios) {
    this.reftiersHelios = reftiersHelios;
  }

  public int getTitulaireHelios() {
    return this.titulaireHelios;
  }

  public void setTitulaireHelios(int titulaireHelios) {
    this.titulaireHelios = titulaireHelios;
  }

  public Set<Rattachement> getRattachements() {
    return rattachements;
  }

  public void setRattachements(Set<Rattachement> rattachements) {
    this.rattachements = rattachements;
  }

}