package fr.lepellerin.ecole.service.internal;

import fr.lepellerin.ecole.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;

@Service
public class EmailServiceImpl implements EmailService {

  @Autowired
  private JavaMailSender mailSender;

  @Autowired
  private TemplateEngine templateEngine;

  @Override
  public void sendSimpleMail(final String sujet, final String to, final String from,
      final String templateName, final Context mailContext) throws MessagingException {
    final MimeMessage mimeMessage = this.mailSender.createMimeMessage();
    final MimeMessageHelper message = new MimeMessageHelper(mimeMessage, "UTF-8");
    message.setSubject(sujet);
    message.setFrom(from);
    message.setTo(to);

    final String htmlContent = this.templateEngine.process(templateName, mailContext);
    message.setText(htmlContent, true);

    this.mailSender.send(mimeMessage);
  }

}
