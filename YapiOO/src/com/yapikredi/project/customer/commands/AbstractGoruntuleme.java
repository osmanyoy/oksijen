package com.yapikredi.project.customer.commands;

import com.yapikredi.project.customer.business.UserInterractions;
import com.yapikredi.project.customer.models.Account;
import com.yapikredi.project.customer.models.Customer;
import com.yapikredi.project.customer.models.EAccountType;

public abstract class AbstractGoruntuleme extends AbstractCommand {

	public AbstractGoruntuleme(EAccountType accountType) {
		super(accountType);
	}

	@Override
	public void execute(Customer customer) {
		Account account = customer.getAccount(accountType);
		if (account == null) {
			UserInterractions.getInstance().printLine(accountType + " hesabý bulunamadý");
		} else {
			UserInterractions.getInstance().printLine("" + account);
		}
	}

}
