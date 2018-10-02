package com.kkb.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class MySecurityConfig {

    @Bean
    public BCryptPasswordEncoder bpe() {
        return new BCryptPasswordEncoder();
    }


    @Bean
    public MyUserDetailsService uerDetailsService() {
        return new MyUserDetailsService();
    }

    //    @Autowired
    //    public void xyz(final AuthenticationManagerBuilder builderParam) throws Exception {
    //        BCryptPasswordEncoder bpeLoc = this.bpe();
    //        builderParam.inMemoryAuthentication()
    //                    .passwordEncoder(bpeLoc)
    //                    .withUser("osman")
    //                    .password(bpeLoc.encode("1234"))
    //                    .roles("ADMIN")
    //                    .and()
    //                    .withUser("mehmet")
    //                    .password("1234")
    //                    .roles("USER");
    //
    //    }

    @Autowired
    public void xyz(final AuthenticationManagerBuilder builderParam) throws Exception {
        BCryptPasswordEncoder bpeLoc = this.bpe();
        builderParam.userDetailsService(this.uerDetailsService())
                    .passwordEncoder(bpeLoc);

    }

}
