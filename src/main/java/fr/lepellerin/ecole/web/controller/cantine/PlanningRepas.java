package fr.lepellerin.ecole.web.controller.cantine;

import fr.lepellerin.ecole.bean.Individu;

import java.util.List;

public class PlanningRepas {

  private List<JourRepas> lignes;

  private List<Individu> enfants;

  public List<JourRepas> getLignes() {
    return lignes;
  }

  public void setLignes(List<JourRepas> lignes) {
    this.lignes = lignes;
  }

  public List<Individu> getEnfants() {
    return enfants;
  }

  public void setEnfants(List<Individu> enfants) {
    this.enfants = enfants;
  }

}
