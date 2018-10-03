package com.kkb.spring.configurations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.kkb.spring.security.CustomerUserDetailService;

@Configuration
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public CustomerUserDetailService customerUserDetailService() {
        return new CustomerUserDetailService();
    }

    @Autowired
    public void initAuth(final AuthenticationManagerBuilder amb) throws Exception {
        amb.userDetailsService(this.customerUserDetailService())
           .passwordEncoder(this.bCryptPasswordEncoder());
    }

}
