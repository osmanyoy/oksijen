package com.yapikredi.dp.structural.adapter;

public class BusCardPrinter {
	public void printCard(Person person) {
		System.out.println("Name : " + person.getName() + "\nSurname : " + person.getSurname() + "\nPhone : "
		        + person.getPhone());
	}
}
