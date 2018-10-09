package com.yapikredi.project.customer.commands;

import com.yapikredi.project.customer.models.Customer;

public interface Icommand {
	String getMenuDescription();
	
	void execute(Customer customer);
}
