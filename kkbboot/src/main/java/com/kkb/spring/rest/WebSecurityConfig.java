package com.kkb.spring.rest;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(final HttpSecurity httpSecurityParam) throws Exception {
        httpSecurityParam.authorizeRequests()
                         .antMatchers("/actuator/**")
                         .permitAll()
                         .antMatchers("/act/**")
                         .hasAnyRole("USER")
                         .anyRequest()
                         .authenticated()
                         .and()
                         .httpBasic()
                         .and()
                         .cors()
                         .disable()
                         .csrf()
                         .disable();
    }
}
