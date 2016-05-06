package fr.lepellerin.ecole.service;

import org.thymeleaf.context.Context;

import javax.mail.MessagingException;

public interface EmailService {

  void sendSimpleMail(String sujet, String to, String from, String templateName,
      Context mailContext) throws MessagingException;

}
