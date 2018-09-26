package com.kkb.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class KkbcustomerApplication {

    public static void main(final String[] args) {
        SpringApplication.run(KkbcustomerApplication.class,
                              args);
    }
}
