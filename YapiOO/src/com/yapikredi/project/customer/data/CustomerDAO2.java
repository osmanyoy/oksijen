package com.yapikredi.project.customer.data;

import java.util.ArrayList;
import java.util.List;

import com.yapikredi.project.customer.models.Account;
import com.yapikredi.project.customer.models.Customer;
import com.yapikredi.project.customer.models.EAccountType;
import com.yapikredi.project.customer.models.ECustomerType;

public class CustomerDAO2 implements ICustomerDAO{
	private List<Customer> customers = new ArrayList<>();
	
	public CustomerDAO2() {
		Customer customer = new Customer("osman1","1234",ECustomerType.ALTIN);
		customer.addAccount(new Account("osman TL account", 1000, EAccountType.TL));
		customer.addAccount(new Account("osman DOLAR account", 1000, EAccountType.DOLAR));
		customer.addAccount(new Account("osman ALTIN account", 1000, EAccountType.ALTIN));
		customers.add(customer);
		
		customer = new Customer("mehmet1","1234",ECustomerType.GUMUS);
		customer.addAccount(new Account("mehmet TL account", 1000, EAccountType.TL));
		customer.addAccount(new Account("mehmet DOLAR account", 1000, EAccountType.DOLAR));
		customers.add(customer);
		
		customer = new Customer("ali1","1234",ECustomerType.BRONZ);
		customer.addAccount(new Account("ali TL account", 1000, EAccountType.TL));
		customers.add(customer);

	}
	
	@Override
	public List<Customer> getAllCustomers() {
		return null;
	}
	
}
