package fr.lepellerin.ecole.web.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

  @RequestMapping(value = { "/", "/hello***" }, method = RequestMethod.GET)
  public ModelAndView welcomePage() {
    ModelAndView mv = new ModelAndView();
    mv.addObject("title", "Spring security Example");
    mv.addObject("message", "This is hello world");
    mv.setViewName("hello");
    return mv;
  }

  @RequestMapping(value = "/admin**", method = RequestMethod.GET)
  public ModelAndView adminPage() {
    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
    String name = auth.getName();
    ModelAndView mv = new ModelAndView();
    mv.addObject("title", "Spring security Example");
    mv.addObject("message", "Logged in as " + name + "!");
    mv.setViewName("admin");
    return mv;
  }

}
