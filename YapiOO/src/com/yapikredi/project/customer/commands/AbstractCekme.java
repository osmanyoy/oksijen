package com.yapikredi.project.customer.commands;

import com.yapikredi.project.customer.models.Customer;
import com.yapikredi.project.customer.models.EAccountType;

public abstract class AbstractCekme extends AbstractCommand{

	public AbstractCekme(EAccountType accountType) {
		super(accountType);
	}
	@Override
	public String getMenuDescription() {
		return accountType + " Çekme";
	}

	
	@Override
	public void execute(Customer customer) {
		paraCekme(customer, accountType);
	}
	
}
