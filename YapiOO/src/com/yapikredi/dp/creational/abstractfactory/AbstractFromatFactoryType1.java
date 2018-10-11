package com.yapikredi.dp.creational.abstractfactory;

public class AbstractFromatFactoryType1 implements AbstractFromatFactory{
	
	public StringFormat createStringFormat() {
		return new StringFormatType1();
	}
	
	public IntegerFormat createIntegerFormat() {
		return new IntegerFormatType1();
		
	}
	
	public DoubleFormat createDoubleFormat() {
		return new DoubleFormatType1();
		
	}
	
}
