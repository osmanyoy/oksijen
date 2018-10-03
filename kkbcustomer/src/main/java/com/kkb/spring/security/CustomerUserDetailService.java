package com.kkb.spring.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.kkb.spring.models.Customer;
import com.kkb.spring.services.CustomerManager;

public class CustomerUserDetailService implements UserDetailsService {

    @Autowired
    private CustomerManager       cm;

    @Autowired
    private BCryptPasswordEncoder bpe;

    @Value("${super.admin.username}")
    private String                superuser;

    @Value("${super.admin.password}")
    private String                superpassword;


    @Override
    public UserDetails loadUserByUsername(final String usernameParam) throws UsernameNotFoundException {
        if (this.superuser.equals(usernameParam)) {
            return User.builder()
                       .username(this.superuser)
                       .password(this.bpe.encode(this.superpassword))
                       .roles("SUPERADMIN")
                       .build();

        }
        Customer customerLoc = this.cm.getCustomerByUsername(usernameParam);
        if (customerLoc == null) {
            throw new UsernameNotFoundException("Kullanıcı yada şifre hatalı");
        }

        return User.builder()
                   .username(customerLoc.getCredential()
                                        .getUsername())
                   .password(customerLoc.getCredential()
                                        .getPassword())
                   .roles(customerLoc.getCredential()
                                     .getRole())
                   .build();
    }

}
