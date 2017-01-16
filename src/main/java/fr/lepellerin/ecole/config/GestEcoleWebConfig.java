/*
   Copyright (C)  Seun Landsberg 2016

   This program is free software; you can redistribute it and/or modify
   it under the terms of the GNU General Public License as published by
   the Free Software Foundation; either version 3 of the License, or
   (at your option) any later version.

   This program is distributed in the hope that it will be useful,
   but WITHOUT ANY WARRANTY; without even the implied warranty of
   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
   GNU General Public License for more details.

   You should have received a copy of the GNU General Public License
   along with this program; if not, see <http://www.gnu.org/licenses/>.
*/


package fr.lepellerin.ecole.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;
import org.thymeleaf.extras.springsecurity4.dialect.SpringSecurityDialect;
import org.thymeleaf.spring4.SpringTemplateEngine;
import org.thymeleaf.spring4.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.TemplateResolver;

import nz.net.ultraq.thymeleaf.LayoutDialect;

@EnableWebMvc
@Configuration
@EnableJpaRepositories
@EnableScheduling
@Import({ GestEcolePersistenceConfig.class, GestEcoleSecurityConfig.class })
public class GestEcoleWebConfig extends WebMvcConfigurerAdapter {

  /**
   * init thyleleaf template resolver.
   *
   * @return template resolver
   */
  private static TemplateResolver templateResolver() {
    ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
    templateResolver.setPrefix("templates/");
    templateResolver.setSuffix(".html");
    templateResolver.setTemplateMode("HTML5");
    templateResolver.setCacheable(false);
    templateResolver.setOrder(3);
    templateResolver.setCharacterEncoding("UTF-8");
    return templateResolver;
  }

  private static TemplateResolver emailTemplateResolver() {
    TemplateResolver templateResolver = new ClassLoaderTemplateResolver();
    templateResolver.setPrefix("email/");
    templateResolver.setSuffix(".html");
    templateResolver.setTemplateMode("HTML5");
    templateResolver.setCharacterEncoding("UTF-8");
    templateResolver.setOrder(1);
    return templateResolver;
  }
  
  private static TemplateResolver pdfTemplateResolver() {
    ClassLoaderTemplateResolver templateResolver = new ClassLoaderTemplateResolver();
    templateResolver.setPrefix("pdf/");
    templateResolver.setSuffix(".html");
    templateResolver.setTemplateMode("HTML5");
    templateResolver.setCharacterEncoding("UTF-8");
    templateResolver.setOrder(2);
    return templateResolver;
  }


  /**
   * init spring template engine.
   *
   * @return template engine
   */
  @Bean
  public SpringTemplateEngine templateEngine() {
    SpringTemplateEngine templateEngine = new SpringTemplateEngine();
    templateEngine.addTemplateResolver(emailTemplateResolver());
    templateEngine.addTemplateResolver(pdfTemplateResolver());
    templateEngine.addTemplateResolver(templateResolver());
    templateEngine.addDialect(new LayoutDialect());
    templateEngine.addDialect(new Java8TimeDialect());
    templateEngine.addDialect(new SpringSecurityDialect());
    return templateEngine;
  }

  /**
   * init thymeleaf view resolver.
   *
   * @param templateEngine
   *          template engine
   * @return view resolver
   */
  @Bean
  @Autowired
  public ThymeleafViewResolver viewResolver(SpringTemplateEngine templateEngine) {
    ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
    viewResolver.setTemplateEngine(templateEngine);
    viewResolver.setOrder(1);
    viewResolver.setViewNames(new String[] { "*.html", "*.xhtml" });
    viewResolver.setCharacterEncoding("UTF-8");
    return viewResolver;
  }

  @Override
  public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
  }

  @Override
  public void addResourceHandlers(ResourceHandlerRegistry registry) {
    registry.addResourceHandler("/webjars/**")
        .addResourceLocations("classpath:/META-INF/resources/webjars/");
    registry.addResourceHandler("/assets/**").addResourceLocations("classpath:/static/");
  }

}
