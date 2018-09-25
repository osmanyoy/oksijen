package com.kkb.spring;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.kkb.xyz.PersonConfiguration;
import com.kkb.xyz.PersonManager;

//@SpringBootApplication(scanBasePackages = {
//                                            "com.kkb.spring",
//                                            "com.kkb.xyz"
//})
@SpringBootApplication
@Import(PersonConfiguration.class)
public class KkbbootApplication implements ApplicationRunner {


    @Autowired
    private final PersonManager personManager;


    @Autowired
    public KkbbootApplication(final PersonManager pm) {
        this.personManager = pm;
    }


    @PostConstruct
    public void InitBinder() {
        this.personManager.setName("dhjhds");

    }

    @Autowired
    public void testMethodWiring(final PersonManager pm) {
        pm.setName("hadjhsjdh");
    }


    @Override
    public void run(final ApplicationArguments argsParam) throws Exception {
        this.personManager.setName("root");
    }


    public static void main(final String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(KkbbootApplication.class,
                                                                       args);
        KkbbootApplication beanLoc = context.getBean(KkbbootApplication.class);
        //         KkbbootApplication beanLoc = context.getBean("kkbbootApplication");
        beanLoc.personManager.setName("test");

        //        KkbbootApplication applicationLoc = new KkbbootApplication();
        //        applicationLoc.pm.setName("test");
    }


}
