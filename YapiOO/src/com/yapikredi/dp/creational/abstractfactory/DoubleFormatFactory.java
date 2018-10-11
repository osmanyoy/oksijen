package com.yapikredi.dp.creational.abstractfactory;

public class DoubleFormatFactory {
	public static DoubleFormat createDoubleFormat(EFormatType eFormatType) {
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
		return doubleFormat;
	}
}
