package com.kkb.spring.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.kkb.spring.models.Customer;
import com.kkb.spring.repository.ICustomerRepo;


public class CustomerDBDAO implements ICustomerDAO {

    @Autowired
    private ICustomerRepo repo;

    @Override
    public List<Customer> getAllCustomers() {
        List<Customer> customersLoc = new ArrayList<>();
        Iterable<Customer> findAllLoc = this.repo.findAll();
        for (Customer customerLoc : findAllLoc) {
            customersLoc.add(customerLoc);
        }
        return customersLoc;
    }

    @Override
    public void save(final Customer customerParam) {
        this.repo.save(customerParam);
    }


}
