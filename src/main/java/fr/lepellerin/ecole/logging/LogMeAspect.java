package fr.lepellerin.ecole.logging;

import javax.servlet.http.HttpSession;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import fr.lepellerin.ecole.bean.security.CurrentUser;

@Aspect
@Component
public class LogMeAspect {
  
  @Autowired
  private HttpSession session;

  /** 
   * pointcut every methode. 
   */ 
  @Pointcut("execution(* *(..))") 
  public void everyPublicMethod() { 

  } 

  /** 
   * pointcut annotation LogMe. 
   */ 
  @Pointcut("within(@fr.lepellerin.ecole.logging.LogMe * )") 
  public void logMeAnnotation() { 

  } 

  @Around("everyPublicMethod() && @annotation(logMe) ")
  public Object logMethod(final ProceedingJoinPoint pjp, final LogMe logMe) throws Throwable {

    final Logger logger = LoggerFactory.getLogger(pjp.getTarget().getClass()); 
    if (logger.isDebugEnabled()) { 
      final StringBuilder strBuilder = new StringBuilder(); 
      strBuilder.append("Entrée #" + pjp.getSignature().getName()); 
      if (logMe.logArgs()) { 
        strBuilder.append(" : with {"); 
        String sep = ""; 
        if (pjp.getArgs() != null) {
          for (int i = 0; i < pjp.getArgs().length; i++) { 
            strBuilder.append(sep); 
            String argValue = "null"; 
            if (pjp.getArgs()[i] != null) { 
              argValue = pjp.getArgs()[i].toString(); 
            } 
            strBuilder.append(argValue); 
            sep = ";"; 
          } 
        }
        strBuilder.append("}"); 
      } 

      logger.debug(strBuilder.toString()); 
    } 

    Object o = null;

    try {
      o = pjp.proceed(); 
    } catch (Throwable t) {
      String username = "";
      Object user = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
      if (user != null && user instanceof String) {
        username = (String) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
      } else if (user != null && user instanceof CurrentUser) {
        username = ((CurrentUser) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUsername();
      }
      logger.error("Une erreur s'est produite dans l'execution de cette méthode : " + pjp.getSignature().getName() 
          + ". Utilisateur : " + username, t);
      throw t;
    } 

    if (logger.isDebugEnabled() && logMe.logExit()) { 
      final StringBuilder strBuilder = new StringBuilder(); 
      strBuilder.append("Sortie #" + pjp.getSignature().getName()); 
      logger.debug(strBuilder.toString()); 
    } 

    return o; 
  } 

}
