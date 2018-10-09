package com.yapikredi.project.customer.models;

public class Account {
	private String accountDesc;
	private double amount;
	private EAccountType accountType;
	
	public Account() {
	}
	
	public Account(String accountDesc, double amount, EAccountType accountType) {
		super();
		this.accountDesc = accountDesc;
		this.amount = amount;
		this.accountType = accountType;
	}




	public String getAccountDesc() {
		return accountDesc;
	}
	public void setAccountDesc(String accountDesc) {
		this.accountDesc = accountDesc;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public EAccountType getAccountType() {
		return accountType;
	}
	public void setAccountType(EAccountType accountType) {
		this.accountType = accountType;
	}
	@Override
	public String toString() {
		return "Account [accountDesc=" + accountDesc + ", amount=" + amount + ", accountType=" + accountType + "]";
	}
	
	
	
}
