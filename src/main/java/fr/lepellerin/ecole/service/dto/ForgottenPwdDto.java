package fr.lepellerin.ecole.service.dto;

import java.io.Serializable;
import java.util.List;

public class ForgottenPwdDto implements Serializable {

  /**
   * serial UID.
   */
  private static final long serialVersionUID = 1L;

  private String password;

  private String account;

  private List<String> emails;

  public String getPassword() {
    return password;
  }

  public void setPassword(final String password) {
    this.password = password;
  }

  public String getAccount() {
    return account;
  }

  public void setAccount(final String account) {
    this.account = account;
  }

  public List<String> getEmails() {
    return emails;
  }

  public void setEmails(final List<String> emails) {
    this.emails = emails;
  }

}
