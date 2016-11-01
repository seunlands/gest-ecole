package fr.lepellerin.ecole.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class GlobalDefaultExceptionHandler {
  public static final String DEFAULT_ERROR_VIEW = "error/defaultError";
      
  @ExceptionHandler(value = Exception.class)
  public ModelAndView defaultErrorHandler(final HttpServletRequest req, final Exception e) throws Exception {
    
    if (AnnotationUtils.findAnnotation(e.getClass(), ResponseStatus.class) != null) {
      throw e;
    }
    
    final ModelAndView mav = new ModelAndView();
    mav.setViewName(DEFAULT_ERROR_VIEW);
    mav.addObject("exception", e);
    mav.addObject("url", req.getRequestURL());
    
    return mav;
    
  }

}
