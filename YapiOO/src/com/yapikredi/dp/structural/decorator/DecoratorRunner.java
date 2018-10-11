package com.yapikredi.dp.structural.decorator;

import java.util.Arrays;
import java.util.List;

import com.yapikredi.dp.structural.adapter.BusCardPrinter;
import com.yapikredi.dp.structural.adapter.Person;

public class DecoratorRunner {
	public static void main(final String[] args) {
		BusCardPrinter busCardPrinter = new BusCardPrinter();
		Person person = new Person();
		person.setName("osman");
		person.setPhone("9283923");
		person.setSurname("aya");

		List<Integer> o = Arrays.asList(2,
		                                4);

		Person createPerson2 = PersonTypeFactory.createPerson2(person,
		                                                       o);
		busCardPrinter.printCard(createPerson2);

		Person createPerson = PersonTypeFactory.createPerson(person,
		                                                     EType.TYPE2);

		busCardPrinter.printCard(createPerson);

	}
}
