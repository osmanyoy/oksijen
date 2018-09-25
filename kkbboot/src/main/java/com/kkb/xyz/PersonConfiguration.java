package com.kkb.xyz;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersonConfiguration {

    @Primary
    @Bean
    public PersonManager createPersonManager() {
        return new PersonManager();
    }

    @Primary
    @Bean(name = "exec1")
    public ExecuteImpl1 execute1() {
        return new ExecuteImpl1();
    }


    @Bean
    public ExecuteImpl2 test() {
        return new ExecuteImpl2();
    }

    @Qualifier("v3")
    @Bean
    public ExecuteImpl3 execute3() {
        return new ExecuteImpl3();
    }

    @Bean
    @ExecuteV4
    public ExecuteImpl4 execute4() {
        return new ExecuteImpl4();
    }

    @Bean
    public IExecute executeWrapper(@Qualifier("v3") final IExecute executeParam) {
        return new ExecuteWrapper(executeParam);
    }

    @Bean
    public IExecute executeWrapper() {
        return new ExecuteWrapper(this.execute3());
    }

}
