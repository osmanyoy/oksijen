package com.kkb.spring.configurations;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;

import com.kkb.spring.models.Customer;

@ConfigurationProperties(prefix = "kkb.prop")
public class CustomerProperties {

    private List<Customer> customers;


    public List<Customer> getCustomers() {
        return this.customers;
    }


    public void setCustomers(final List<Customer> customersParam) {
        this.customers = customersParam;
    }

}
