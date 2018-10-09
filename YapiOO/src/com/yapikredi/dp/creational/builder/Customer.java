package com.yapikredi.dp.creational.builder;

import java.util.jar.Attributes.Name;

public class Customer {
	private String name;
	private String surname;
	private String address;
	private int age;
	
	private Customer() {
	}
	
	public String getName() {
		return name;
	}
	public String getSurname() {
		return surname;
	}
	public String getAddress() {
		return address;
	}
	public int getAge() {
		return age;
	}
	
	public  static CustomerBuilder getBuilder() {
		return new CustomerBuilder();
	}

	public static class CustomerBuilder
	{
		private Customer customer = new Customer();
		
		private CustomerBuilder() {
			
		}
		
		public CustomerBuilder withName(String name) {
			customer.name = name;
			return this;
		}
		
		public CustomerBuilder withSurname(String surname) {
			customer.surname = surname;
			return this;
		}

		public CustomerBuilder withAddress(String address) {
			customer.address = address;
			return this;
		}

		public CustomerBuilder withAge(int age) {
			customer.age = age;
			return this;
		}
		
		public Customer buildCustomerWithXYZandMYL() {
			if (customer.name == null) {
				// Throw user exception
			}
			return customer;
		}
		
		public Customer buildCustomerWithABCandLCKF() {
			if (customer.surname == null) {
				// Throw user exception
			}
			return customer;
		}
		
		
	}
	
}
