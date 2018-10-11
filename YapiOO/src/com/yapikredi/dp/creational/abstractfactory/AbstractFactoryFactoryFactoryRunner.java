package com.yapikredi.dp.creational.abstractfactory;

public class AbstractFactoryFactoryFactoryRunner {
	public static void main(String[] args) {
		String name = "osman";
		int age = 40;
		double amount = 1000D;
		EFormatType eFormatType = EFormatType.TYPE2;
		
		AbstractFromatFactory afff = AbstractFromatFactoryFactory.createAbstractFromatFactory(eFormatType);
		
		StringFormat stringFormat = afff.createStringFormat();
		IntegerFormat integerFormat = afff.createIntegerFormat();
		DoubleFormat doubleFormat = afff.createDoubleFormat();		
		
		System.out.println("name : " + stringFormat.format(name));
		System.out.println("age : " + integerFormat.format(age));
		System.out.println("TL amount : " + doubleFormat.format(amount));
	}
}
