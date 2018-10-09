package com.yapikredi.project.customer.business;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.yapikredi.project.customer.data.CustomerDAOFactory;
import com.yapikredi.project.customer.data.ICustomerDAO;
import com.yapikredi.project.customer.models.Customer;

public class CustomerCache {
	private static volatile CustomerCache instance;

	private CustomerCache() {
	}

	public static CustomerCache getInstance() {
		if (instance == null) {
			synchronized (CustomerCache.class) {
				if (instance == null) {
					instance = new CustomerCache();
					ICustomerDAO customerDAO = CustomerDAOFactory.getCustomerDAO();
					List<Customer> allCustomers = customerDAO.getAllCustomers();
					for (Customer customer : allCustomers) {
						instance.customerCache.put(customer.getUsername(), customer);
					}
					
				}
			}
		}
		return instance;
	}
	
	private Map<String, Customer> customerCache = new HashMap<>();
	
	public Customer getCustomer(String username) {
		return customerCache.get(username);
	}
	
	public void addCustomer(Customer customer) {
		customerCache.put(customer.getUsername(), customer);
	}
}
