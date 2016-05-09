package fr.lepellerin.ecole.security;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordGenerator {

  public static void main(String[] args) {

    String password = "admin";
    PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(11);
    String hashedPassword = passwordEncoder.encode(password);

    System.out.println(hashedPassword);

  }

}
