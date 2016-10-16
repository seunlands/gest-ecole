package fr.lepellerin.ecole.service.dto;

import java.io.Serializable;

public class ComboItemDto implements Serializable {

  /**
   * serial UID.
   */
  private static final long serialVersionUID = 1L;

  private Integer id;
  
  private String libelle;

  public ComboItemDto(Integer id, String libelle) {
    super();
    this.id = id;
    this.libelle = libelle;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getLibelle() {
    return libelle;
  }

  public void setLibelle(String libelle) {
    this.libelle = libelle;
  }
  
  
}
