package com.yapikredi.dp.behavioral.templatemethod;

public class Runner {
	public static void main(final String[] args) {
		IProcess process = new Html();
		process.mainProcess();
	}
}
