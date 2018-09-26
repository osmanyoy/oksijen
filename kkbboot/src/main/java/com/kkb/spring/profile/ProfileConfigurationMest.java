package com.kkb.spring.profile;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.kkb.xyz.ExecuteImpl4;
import com.kkb.xyz.IExecute;

@Configuration
@Profile("mest")
public class ProfileConfigurationMest {

    @Bean
    @Qualifier("testabc")
    public IExecute profTest1() {
        return new ExecuteImpl4();
    }


}
