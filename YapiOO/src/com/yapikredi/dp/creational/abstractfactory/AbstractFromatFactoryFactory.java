package com.yapikredi.dp.creational.abstractfactory;

public class AbstractFromatFactoryFactory {
	public static AbstractFromatFactory createAbstractFromatFactory(EFormatType eFormatType) {
		switch (eFormatType) {
		case TYPE1:
			return new AbstractFromatFactoryType1();
		case TYPE2:
			return new AbstractFromatFactoryType2();
		default:
			return new AbstractFromatFactoryType1();
		
		}
	}
}
