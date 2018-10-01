package com.kkb.spring.mt;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
@EnableScheduling
public class MtConfiguration {

    @Bean
    public MyAsyncTest myAsyncTest() {
        return new MyAsyncTest();
    }

    @Bean
    public MyAsyncTestCallee myAsyncTestCallee() {
        return new MyAsyncTestCallee();
    }

    @Scheduled(fixedDelay = 10_000, initialDelay = 20_000)
    public void testSchedule() {
        System.out.println("Schedule : " + System.currentTimeMillis());
    }


    @Bean
    public Executor myThreadPool() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setMaxPoolSize(5);
        executor.setCorePoolSize(5);
        executor.setThreadNamePrefix("CUSTOM-");
        executor.initialize();

        return executor;
    }

}
