package com.kkb.spring.mt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class AsyncRunner implements CommandLineRunner {

    @Autowired
    private MyAsyncTest asyncTest;

    @Override
    public void run(final String... argsParam) throws Exception {
        System.out.println(this.asyncTest.method1());

    }

}
