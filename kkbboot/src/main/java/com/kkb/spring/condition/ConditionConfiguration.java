package com.kkb.spring.condition;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.kkb.xyz.ExecuteImpl2;
import com.kkb.xyz.ExecuteImpl3;
import com.kkb.xyz.IExecute;

@Configuration
public class ConditionConfiguration {

    @MyConditionAnno(test = "osman")
    @Bean
    @Qualifier("abc3")
    public IExecute exec7() {
        return new ExecuteImpl3();
    }

    @MyConditionAnno(test = "mehmet")
    @Bean
    @Qualifier("abc3")
    public IExecute exec2() {
        return new ExecuteImpl2();
    }

    @MyConditionAnno(test = "osman")
    @Bean
    @Qualifier("abc3")
    public IExecute exec3() {
        return new ExecuteImpl2();
    }

}
