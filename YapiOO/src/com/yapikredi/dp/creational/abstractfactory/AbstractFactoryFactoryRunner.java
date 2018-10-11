package com.yapikredi.dp.creational.abstractfactory;

public class AbstractFactoryFactoryRunner {
	public static void main(String[] args) {
		String name = "osman";
		int age = 40;
		double amount = 1000D;
		EFormatType eFormatType = EFormatType.TYPE2;
		
		
		StringFormat stringFormat = StringFormatFactory.createFormatter(eFormatType);
		IntegerFormat integerFormat = IntegerFormatFactory.createIntegerFormat(eFormatType);
		DoubleFormat doubleFormat = DoubleFormatFactory.createDoubleFormat(eFormatType);		
		
		System.out.println("name : " + stringFormat.format(name));
		System.out.println("age : " + integerFormat.format(age));
		System.out.println("TL amount : " + doubleFormat.format(amount));
	}
}
