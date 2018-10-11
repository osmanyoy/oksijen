package com.yapikredi.dp.creational.abstractfactory;

public class AbstractFromatFactoryType2 implements AbstractFromatFactory{
	public StringFormat createStringFormat() {
		return new StringFormatType2();
	}
	
	public IntegerFormat createIntegerFormat() {
		return new IntegerFormatType2();
		
	}
	
	public DoubleFormat createDoubleFormat() {
		return new DoubleFormatType2();
		
	}
	
}
