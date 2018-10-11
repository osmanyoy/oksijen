package com.yapikredi.dp.behavioral.templatemethod;

public class Mail extends MyAbstractClass {

	@Override
	protected void subProcessFooter() {
		System.out.println("Mail footer");

	}

	@Override
	protected void subProcessBody() {
		System.out.println("Mail body");

	}

	@Override
	protected void subProcessHeader() {
		System.out.println("Mail header");

	}

}
