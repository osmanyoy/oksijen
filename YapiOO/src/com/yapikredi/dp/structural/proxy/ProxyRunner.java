package com.yapikredi.dp.structural.proxy;

import com.yapikredi.dp.structural.adapter.BusCardPrinter;
import com.yapikredi.dp.structural.adapter.Person;

public class ProxyRunner {
	public static void main(final String[] args) {
		BusCardPrinter busCardPrinter = new BusCardPrinter();
		Person person = new Person();
		person.setName("osman");
		person.setPhone("9283923");
		person.setSurname("aya");

		PersonProxy personProxy = new PersonProxy(person);

		busCardPrinter.printCard(personProxy);

	}
}
