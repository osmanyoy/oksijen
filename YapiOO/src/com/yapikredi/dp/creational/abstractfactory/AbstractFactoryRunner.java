package com.yapikredi.dp.creational.abstractfactory;

public class AbstractFactoryRunner {
	public static void main(String[] args) {
		String name = "osman";
		int age = 40;
		double amount = 1000D;
		EFormatType eFormatType = EFormatType.TYPE2;
		
		
		StringFormat stringFormat = null;
		switch (eFormatType) {
		case TYPE1:
			stringFormat = new StringFormatType1();
			break;
		case TYPE2:
			stringFormat = new StringFormatType2();
			break;
		default:
			stringFormat = new StringFormatType1();
			break;
		}
		
		IntegerFormat integerFormat = null;
		switch (eFormatType) {
		case TYPE1:
			integerFormat = new IntegerFormatType1();
			break;
		case TYPE2:
			integerFormat = new IntegerFormatType2();
			break;
		default:
			integerFormat = new IntegerFormatType1();
			break;
		}
		
		DoubleFormat doubleFormat = null;
		switch (eFormatType) {
		case TYPE1:
			doubleFormat = new DoubleFormatType1();
			break;
		case TYPE2:
			doubleFormat = new DoubleFormatType2();
			break;
		default:
			doubleFormat = new DoubleFormatType1();
			break;
		}		
		
		System.out.println("name : " + stringFormat.format(name));
		System.out.println("age : " + integerFormat.format(age));
		System.out.println("TL amount : " + doubleFormat.format(amount));
	}
}
