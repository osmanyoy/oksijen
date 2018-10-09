package com.yapikredi.project.customer.commands;

import com.yapikredi.project.customer.business.UserInterractions;
import com.yapikredi.project.customer.models.Account;
import com.yapikredi.project.customer.models.Customer;
import com.yapikredi.project.customer.models.EAccountType;

public abstract class AbstractCommand implements Icommand{
	EAccountType accountType;

	public AbstractCommand(EAccountType accountType) {
		this.accountType = accountType;
	}
	
	@Override
	public String getMenuDescription() {
		return accountType + " Görüntüle";
	}
	
	public void paraCekme(Customer customer,EAccountType accountType) {
		UserInterractions.getInstance().printLine("Çekmek istediðiniz miktar :");
		int integerInput = UserInterractions.getInstance().getIntegerInput();
		Account account = customer.getAccount(accountType);
		if (account != null) {
			account.setAmount(account.getAmount() - integerInput);
		}
		System.out.println(account);
	}
	
	public void paraYatirma(Customer customer,EAccountType accountType) {
		UserInterractions.getInstance().printLine("Yatýrman istediðiniz miktar :");
		int integerInput = UserInterractions.getInstance().getIntegerInput();
		Account account = customer.getAccount(accountType);
		if (account != null) {
			account.setAmount(account.getAmount() + integerInput);
		}
		System.out.println(account);
	}

}
