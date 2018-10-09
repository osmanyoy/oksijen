package com.yapikredi.project.customer.commands;

import com.yapikredi.project.customer.models.Customer;
import com.yapikredi.project.customer.models.EAccountType;

public abstract class AbstractYatirma extends AbstractCommand{

	public AbstractYatirma(EAccountType accountType) {
		super(accountType);
	}
	
	@Override
	public String getMenuDescription() {
		return accountType + " Yatirma";
	}

	@Override
	public void execute(Customer customer) {
		paraYatirma(customer, accountType);
	}
	
}
