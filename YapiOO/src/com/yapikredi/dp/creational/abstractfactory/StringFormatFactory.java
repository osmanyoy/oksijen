package com.yapikredi.dp.creational.abstractfactory;

public class StringFormatFactory {
	public static StringFormat createFormatter(EFormatType eFormatType) {
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
		return stringFormat;

	}
}
