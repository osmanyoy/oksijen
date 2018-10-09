package com.yapikredi.dp.creational.builder;

public class BuilderRunner {
	public static void main(String[] args) {
		Customer buildCustomerWithABCandLCKF = Customer.getBuilder()
		                                               .withName("osman")
		                                               .withSurname("yay")
		                                               .withAge(48)
		                                               .withAddress("xbcbcbc")
		                                               .buildCustomerWithABCandLCKF();
	}
}
