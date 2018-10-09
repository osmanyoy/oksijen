package com.yapikredi.project.customer.data;

import java.util.List;

import com.yapikredi.project.customer.models.Customer;

public interface ICustomerDAO {
	List<Customer> getAllCustomers();
}
