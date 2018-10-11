package com.yapikredi.dp.structural.proxy;

import com.yapikredi.dp.structural.adapter.Person;

public class PersonProxy extends Person {
	private Person person;

	public PersonProxy(final Person person) {
		super();
		this.person = person;
	}

	@Override
	public String getName() {
		System.out.println("getName çaðrýldý");
		String name2 = this.person.getName();
		System.out.println("getName döndü sonuç : " + name2);
		return name2;
	}

	@Override
	public void setName(final String name) {
		this.person.setName(name);
	}

	@Override
	public String getSurname() {
		return this.person.getSurname();
	}

	@Override
	public void setSurname(final String surname) {
		this.person.setSurname(surname);
	}

	@Override
	public String getPhone() {
		return this.person.getPhone();
	}

	@Override
	public void setPhone(final String phone) {
		this.person.setPhone(phone);
	}

}
