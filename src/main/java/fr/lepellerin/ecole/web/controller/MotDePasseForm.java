package fr.lepellerin.ecole.web.controller;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

public class MotDePasseForm implements Serializable {

  /**
   * serial UID.
   */
  private static final long serialVersionUID = 1L;

  @NotEmpty
  private String oldPassword;

  @NotEmpty
  private String newPassword;

  @NotEmpty
  private String confirmPassword;

  public String getOldPassword() {
    return oldPassword;
  }

  public void setOldPassword(final String oldPassword) {
    this.oldPassword = oldPassword;
  }

  public String getNewPassword() {
    return newPassword;
  }

  public void setNewPassword(final String newPassword) {
    this.newPassword = newPassword;
  }

  public String getConfirmPassword() {
    return confirmPassword;
  }

  public void setConfirmPassword(final String confirmPassword) {
    this.confirmPassword = confirmPassword;
  }

}
