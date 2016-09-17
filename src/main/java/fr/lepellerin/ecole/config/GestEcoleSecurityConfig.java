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
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableGlobalMethodSecurity
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
public class GestEcoleSecurityConfig extends WebSecurityConfigurerAdapter {

  @Autowired
  private UserDetailsService userDetailsService;

  @Override
  @Autowired
  public void configure(final AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(this.userDetailsService).passwordEncoder(this.passwordEncoder());
  }

  // @formatter:off
  @Override
  protected void configure(final HttpSecurity http) throws Exception {
    http
        .authorizeRequests()
            .antMatchers("/forgottenPassword").permitAll()
            .antMatchers("/forgottenUsername").permitAll()
            .antMatchers("/assets/**").permitAll()
            .antMatchers("/webjars/**").permitAll()
            .antMatchers("/cantine/**").access("hasRole('ROLE_FAMILLE')")
            .antMatchers("/admin/**").access("hasRole('ROLE_ADMIN')")
            .antMatchers("/**").authenticated()
           .and()
        .formLogin()
            .loginPage("/login")
            .defaultSuccessUrl("/", true)
            .permitAll()
            .and()
        .logout()
            .permitAll();

  }
  // @formatter:on

  @Bean
  public PasswordEncoder passwordEncoder() {
    return new BCryptPasswordEncoder(11);
  }

}
