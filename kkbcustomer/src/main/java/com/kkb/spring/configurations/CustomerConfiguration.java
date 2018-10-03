package com.kkb.spring.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;

import com.kkb.spring.dao.CustomerDBDAO;
import com.kkb.spring.dao.CustomerPropDAO;
import com.kkb.spring.dao.ICustomerDAO;
import com.kkb.spring.formatters.CustomerFormatter1;
import com.kkb.spring.formatters.CustomerFormatter2;
import com.kkb.spring.formatters.CustomerFormatter3;
import com.kkb.spring.formatters.ICustomerFormatter;
import com.kkb.spring.services.CustomerManager;

@Configuration
@PropertySource("classpath:customer.properties")
public class CustomerConfiguration {

    @Bean
    public CustomerManager customerManager() {
        return new CustomerManager();
    }

    @Bean
    public CustomerProperties customerProperties() {
        return new CustomerProperties();
    }

    @Profile("prop")
    @Bean
    public ICustomerDAO customerDAO() {
        return new CustomerPropDAO();
    }

    @Profile("db")
    @Bean
    public ICustomerDAO customerDBDAO() {
        return new CustomerDBDAO();
    }


    @Bean
    public ICustomerFormatter customerFormatter(@Value("${kkb.customer.formatter}") final ECustomerFormatterType type) {
        switch (type) {
            case FORMAT1:
                return new CustomerFormatter1();
            case FORMAT2:
                return new CustomerFormatter2();
            case FORMAT3:
                return new CustomerFormatter3();

            default:
                return new CustomerFormatter1();
        }
    }

}
