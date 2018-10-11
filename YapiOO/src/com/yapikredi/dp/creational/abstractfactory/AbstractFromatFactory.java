package com.yapikredi.dp.creational.abstractfactory;

public interface AbstractFromatFactory {
	StringFormat createStringFormat();
	
	IntegerFormat createIntegerFormat();
	
	DoubleFormat createDoubleFormat();
	
}
