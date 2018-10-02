package com.kkb.spring.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    private BCryptPasswordEncoder bcpe;

    @Override
    public UserDetails loadUserByUsername(final String usernameParam) throws UsernameNotFoundException {
        return User.builder()
                   .username(usernameParam)
                   .password(this.bcpe.encode("1234"))
                   .roles("USER")
                   .build();
    }

}
