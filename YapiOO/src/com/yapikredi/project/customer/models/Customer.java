package com.yapikredi.project.customer.models;

import java.util.EnumMap;

public class Customer {
	private String username;
	private String password;
	private ECustomerType customerType;
	private EnumMap<EAccountType,Account> accounts = new EnumMap<>(EAccountType.class);
	
	public Customer() {
	}
	
	
	
	public Customer(String username, String password, ECustomerType customerType) {
		super();
		this.username = username;
		this.password = password;
		this.customerType = customerType;
	}


	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public ECustomerType getCustomerType() {
		return customerType;
	}
	public void setCustomerType(ECustomerType customerType) {
		this.customerType = customerType;
	}

	@Override
	public String toString() {
		return "Customer [username=" + username + ", password=" + password + ", customerType=" + customerType
		        + ", accounts=" + accounts + "]";
	}

	public Account getAccount(EAccountType accountType) {
		return accounts.get(accountType); 
	}
	
	public void addAccount(Account account) {
		accounts.put(account.getAccountType(), account);
	}
	
	
}
