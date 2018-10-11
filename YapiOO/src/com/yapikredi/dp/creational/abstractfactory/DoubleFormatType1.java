package com.yapikredi.dp.creational.abstractfactory;

public class DoubleFormatType1 implements DoubleFormat {
	public String format(double str) {
		return str + "_d";
	}
}
