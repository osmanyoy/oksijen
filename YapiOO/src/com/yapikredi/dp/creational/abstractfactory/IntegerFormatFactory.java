package com.yapikredi.dp.creational.abstractfactory;

public class IntegerFormatFactory {
	public static IntegerFormat createIntegerFormat(EFormatType eFormatType) {
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
		return integerFormat;
	}
}
