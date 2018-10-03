package com.kkb.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;

@SpringBootApplication
@EnableConfigurationProperties
@EnableAsync
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class KkbcustomerApplication {

    public static void main(final String[] args) {
        SpringApplication.run(KkbcustomerApplication.class,
                              args);
    }
}
