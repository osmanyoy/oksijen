package com.yapikredi.dp.structural.decorator;

import com.yapikredi.dp.structural.adapter.Person;

public class PersonDecorator2 extends Person {
	private Person person;

	public PersonDecorator2(final Person person) {
		super();
		this.person = person;
	}

	@Override
	public String getName() {
		return this.person.getName() + " hazretleri";
	}

	@Override
	public String getSurname() {
		return this.person.getSurname();
	}

	@Override
	public String getPhone() {
		return this.person.getPhone();
	}

}
