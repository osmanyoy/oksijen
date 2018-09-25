package com.kkb.xyz;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:my.properties")
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
    @Qualifier("general1")
    public IExecute executeGeneral(@Value("${my.execute.index}") final int index) {
        switch (index) {
            case 1:
                return new ExecuteImpl1();
            case 2:
                return new ExecuteImpl2();
            case 3:
                return new ExecuteImpl3();
            case 4:
                return new ExecuteImpl4();

            default:
                return new ExecuteImpl4();
        }
    }

    @Autowired
    private Environment        env;

    @Autowired
    private ApplicationContext context;

    @Bean
    @Qualifier("general2")
    public IExecute executeGeneral2() {
        Environment environmentLoc = this.context.getEnvironment();

        String propertyLoc = this.env.getProperty("my.execute.index");
        Integer index = Integer.parseInt(propertyLoc);
        switch (index) {
            case 1:
                return new ExecuteImpl1();
            case 2:
                return new ExecuteImpl2();
            case 3:
                return new ExecuteImpl3();
            case 4:
                return new ExecuteImpl4();

            default:
                return new ExecuteImpl4();
        }
    }

    @Bean
    @Qualifier("general3")
    public IExecute executeGeneral3(@Value("#{myTestBean.readIndex()}") final int index) {
        switch (index) {
            case 1:
                return new ExecuteImpl1();
            case 2:
                return new ExecuteImpl2();
            case 3:
                return new ExecuteImpl3();
            case 4:
                return new ExecuteImpl4();

            default:
                return new ExecuteImpl4();
        }
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
