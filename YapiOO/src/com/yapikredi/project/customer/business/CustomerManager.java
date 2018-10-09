package com.yapikredi.project.customer.business;

import com.yapikredi.project.customer.models.Customer;

public class CustomerManager {
	
	private static volatile CustomerManager instance;

	private CustomerManager() {
	}

	public static CustomerManager getInstance() {
		if (instance == null) {
			synchronized (CustomerManager.class) {
				if (instance == null) {
					instance = new CustomerManager();
				}
			}
		}
		return instance;
	}
	
	public Customer login(String username, String password) {
		Customer customer = CustomerCache.getInstance()
		                                 .getCustomer(username);
		if (customer == null) {
			return null;
		}
		if (customer.getPassword()
		            .equals(password)) {
			return customer;
		}
		return null;
	}

}
