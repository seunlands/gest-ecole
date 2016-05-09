package fr.lepellerin.ecole.utils;

import java.security.SecureRandom;

public class PasswordGenerator {

  private static final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
  private static SecureRandom rnd = new SecureRandom();

  /**
   * generate random password of len length.
   * 
   * @param len
   *          : length of passord
   * @return random string
   */
  public static String randomString(int len) {
    StringBuilder sb = new StringBuilder(len);
    for (int i = 0; i < len; i++) {
      sb.append(AB.charAt(rnd.nextInt(AB.length())));
    }
    return sb.toString();
  }

}
