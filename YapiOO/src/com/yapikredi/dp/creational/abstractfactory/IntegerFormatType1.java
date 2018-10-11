package com.yapikredi.dp.creational.abstractfactory;

public class IntegerFormatType1 implements IntegerFormat {
	public String format(int str) {
		return str + "_i";
	}
}
