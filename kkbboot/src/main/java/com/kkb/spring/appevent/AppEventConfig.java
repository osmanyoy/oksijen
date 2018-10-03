package com.kkb.spring.appevent;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.ApplicationEventMulticaster;
import org.springframework.context.event.SimpleApplicationEventMulticaster;

@Configuration
public class AppEventConfig {

    @Bean
    public Executor execForMulticastEvent() {
        return Executors.newFixedThreadPool(3);
    }

    @Bean
    public ApplicationEventMulticaster applicationEventMulticaster() {
        SimpleApplicationEventMulticaster applicationEventMulticasterLoc = new SimpleApplicationEventMulticaster();
        applicationEventMulticasterLoc.setTaskExecutor(this.execForMulticastEvent());
        return applicationEventMulticasterLoc;
    }

}
