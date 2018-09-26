package com.kkb.spring.services;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;

import com.kkb.spring.dao.ICustomerDAO;
import com.kkb.spring.formatters.ICustomerFormatter;
import com.kkb.spring.models.Customer;

public class CustomerManager {

    private final Map<Long, Customer> customerCache = new HashMap<>();

    @Autowired
    private ICustomerFormatter        formatter;


    public CustomerManager() {
    }

    @Autowired
    public void init(final ICustomerDAO customerDAOParam) {
        List<Customer> allCustomersLoc = customerDAOParam.getAllCustomers();
        for (Customer customerLoc : allCustomersLoc) {
            this.customerCache.put(customerLoc.getId(),
                                   customerLoc);
        }
    }

    public Collection<Customer> getAllCustomers() {
        return this.customerCache.values();
    }

    public String formatCustomer(final long custId) {
        Customer customerLoc = this.customerCache.get(custId);
        if (customerLoc == null) {
            return "null";
        }
        return this.formatter.format(customerLoc);

    }
}
