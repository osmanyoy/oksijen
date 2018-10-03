package com.kkb.spring.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.stereotype.Component;

@Component
public class CustomerWebSecurity extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(final HttpSecurity httpParam) throws Exception {
        httpParam.authorizeRequests()
                 .anyRequest()
                 .authenticated()
                 .antMatchers("/customer/api/v1/**")
                 .hasRole("SUPERADMIN")
                 .and()
                 .httpBasic()
                 .and()
                 .cors()
                 .disable()
                 .csrf()
                 .disable();
    }
}
