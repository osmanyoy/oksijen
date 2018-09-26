package com.kkb.spring.dao;

import java.util.List;

import com.kkb.spring.models.Customer;

public interface ICustomerDAO {

    List<Customer> getAllCustomers();
}
