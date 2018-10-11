package com.yapikredi.dp.behavioral.templatemethod;

public class Html extends MyAbstractClass {

	@Override
	protected void subProcessFooter() {
		System.out.println("HTML footer");

	}

	@Override
	protected void subProcessBody() {
		System.out.println("HTML body");

	}

	@Override
	protected void subProcessHeader() {
		System.out.println("HTML header");

	}

}
