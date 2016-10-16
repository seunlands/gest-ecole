package fr.lepellerin.ecole.service.dto;

import java.io.Serializable;

public class ParametreDto implements Serializable {
  
  private static final long serialVersionUID = 20160520L;

  private int id;

  private String libelleParametre;

  private String valeurParametre;
  
  public ParametreDto(int id, String libelleParametre, String valeurParametre) {
    super();
    this.id = id;
    this.libelleParametre = libelleParametre;
    this.valeurParametre = valeurParametre;
  }

  public int getId() {
    return this.id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getLibelleParametre() {
    return libelleParametre;
  }

  public void setLibelleParametre(String libelleParametre) {
    this.libelleParametre = libelleParametre;
  }

  public String getValeurParametre() {
    return valeurParametre;
  }

  public void setValeurParametre(String valeurParametre) {
    this.valeurParametre = valeurParametre;
  }



}
