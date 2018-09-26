package com.kkb.spring.profile;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class ProfileRunner implements CommandLineRunner {

    @Autowired
    private IProfileTest pt;

    @Value("${profile.test.osman}")
    private String       osman;

    @Override
    public void run(final String... argsParam) throws Exception {
        System.out.println(this.pt.test());
        System.out.println(this.osman);

    }

}
