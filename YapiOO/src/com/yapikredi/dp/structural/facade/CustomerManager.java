package com.yapikredi.dp.structural.facade;

import com.yapikredi.project.customer.models.Customer;

public class CustomerManager {
	private CustomerFacade customerFacade;

	public boolean createCustomer(final Customer customer) {
		return this.customerFacade.createCustomer(customer);
	}

}
