package com.yapikredi.project.customer.data;

public class CustomerDAOFactory {
	public static ICustomerDAO getCustomerDAO() {
		String property = System.getProperty("customerDAO");
		if (property == null) {
			return new CustomerDAO1();
		}
		switch (property) {
		case "1":
			return new CustomerDAO1();
		case "2":
			return new CustomerDAO2();

		default:
			return new CustomerDAO1();
		}
	}
}
