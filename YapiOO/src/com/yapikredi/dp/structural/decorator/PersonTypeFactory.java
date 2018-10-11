package com.yapikredi.dp.structural.decorator;

import java.util.List;

import com.yapikredi.dp.structural.adapter.Person;

public class PersonTypeFactory {
	public static Person createPerson(final Person person, final EType eType) {
		Person inPerson = person;
		switch (eType) {
		case TYPE1:
			inPerson = new PersonDecorator1(inPerson);
			break;
		case TYPE2:
			inPerson = new PersonDecorator2(new PersonDecorator1(inPerson));
			break;
		default:
			break;
		}
		return inPerson;
	}

	public static Person createPerson2(final Person person, final List<Integer> decoratorList) {
		Person inPerson = person;
		for (Integer integer : decoratorList) {
			switch (integer) {
			case 1:
				inPerson = new PersonDecorator1(inPerson);
				break;
			case 2:
				inPerson = new PersonDecorator2(inPerson);
				break;
			case 3:
				inPerson = new PersonDecorator3(inPerson);
				break;
			case 4:
				inPerson = new PersonDecorator4(inPerson);
				break;
			default:
				break;
			}

		}
		return inPerson;
	}

}
