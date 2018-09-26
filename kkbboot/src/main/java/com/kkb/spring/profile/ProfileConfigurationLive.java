package com.kkb.spring.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("live")
public class ProfileConfigurationLive {

    @Bean
    public IProfileTest profTest2() {
        return new ProfileTest2();
    }


}
