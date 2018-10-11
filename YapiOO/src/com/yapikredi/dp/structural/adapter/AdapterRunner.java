package com.yapikredi.dp.structural.adapter;

public class AdapterRunner {
	public static void main(String[] args) {
		BusCardPrinter busCardPrinter = new BusCardPrinter();
		Person person = new Person();
		person.setName("osman");
		person.setPhone("9283923");
		person.setSurname("aya");
		busCardPrinter.printCard(person);
		
		Adam adam = new Adam();
		adam.setIsim("osman");
		adam.setSoyisim("yay");
		adam.setTel(38748374);
		
		AdamPersonAdapter adamPersonAdapter = new AdamPersonAdapter(adam);
		
		busCardPrinter.printCard(adamPersonAdapter);
	}
}
