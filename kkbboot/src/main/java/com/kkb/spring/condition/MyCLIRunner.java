package com.kkb.spring.condition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kkb.xyz.IExecute;

@Component
public class MyCLIRunner implements CommandLineRunner {

    @Autowired
    @Qualifier("abc3")
    private IExecute exec;

    @Override
    public void run(final String... argsParam) throws Exception {
        System.out.println(this.exec.execute());
    }

}
