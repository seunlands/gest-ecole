package fr.lepellerin.ecole.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "gestecole")
public class GestEcoleProperties {
  
  public static class Mail {
    
    private String replyToAddress;

    /**
     * @return the replyToAddress
     */
    public String getReplyToAddress() {
      return replyToAddress;
    }

    /**
     * @param replyToAddress the replyToAddress to set
     */
    public void setReplyToAddress(String replyToAddress) {
      this.replyToAddress = replyToAddress;
    }
    
  }
  
  private Mail mail;

  /**
   * @return the mail
   */
  public Mail getMail() {
    return mail;
  }

  /**
   * @param mail the mail to set
   */
  public void setMail(Mail mail) {
    this.mail = mail;
  }

}
