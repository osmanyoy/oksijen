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

    private final Map<String, Customer> customerCache = new HashMap<>();

    @Autowired
    private ICustomerFormatter          formatter;

    private ICustomerDAO                customerDAO;


    public CustomerManager() {
    }

    @Autowired
    public void init(final ICustomerDAO customerDAOParam) {
        this.customerDAO = customerDAOParam;
        List<Customer> allCustomersLoc = customerDAOParam.getAllCustomers();
        for (Customer customerLoc : allCustomersLoc) {
            this.customerCache.put(customerLoc.getCredential()
                                              .getUsername(),
                                   customerLoc);
        }
    }

    public Collection<Customer> getAllCustomers() {
        return this.customerCache.values();
    }

    public String formatCustomer(final long custId) {
        Collection<Customer> valuesLoc = this.customerCache.values();
        Customer foundCustomerLoc = null;
        for (Customer customerLoc : valuesLoc) {
            if (customerLoc.getId() == custId) {
                foundCustomerLoc = customerLoc;
            }
        }
        if (foundCustomerLoc == null) {
            return null;
        }
        return this.formatter.format(foundCustomerLoc);

    }

    public void addCustomer(final Customer customerParam) {
        this.customerDAO.save(customerParam);
        this.customerCache.put(customerParam.getCredential()
                                            .getUsername(),
                               customerParam);
    }

    public Customer getCustomerByUsername(final String usernameParam) {
        return this.customerCache.get(usernameParam);
    }
}
