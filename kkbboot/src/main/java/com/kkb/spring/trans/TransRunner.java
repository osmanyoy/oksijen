package com.kkb.spring.trans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TransRunner implements CommandLineRunner {

    @Autowired
    private MyTransTest mtt;

    @Override
    public void run(final String... argsParam) throws Exception {
        this.mtt.customTransaction();
    }

}
