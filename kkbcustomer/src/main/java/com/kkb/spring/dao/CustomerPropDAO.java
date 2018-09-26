package com.kkb.spring.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kkb.spring.configurations.CustomerProperties;
import com.kkb.spring.models.Customer;

public class CustomerPropDAO implements ICustomerDAO {

    @Autowired
    private CustomerProperties cp;

    @Override
    public List<Customer> getAllCustomers() {
        return this.cp.getCustomers();
    }

}
