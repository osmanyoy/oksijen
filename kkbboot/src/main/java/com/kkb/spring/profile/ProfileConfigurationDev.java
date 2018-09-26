package com.kkb.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("dev")
public class ProfileConfigurationDev {

    @Bean
    public IProfileTest profTest() {
        return new ProfileTest1();
    }


}
