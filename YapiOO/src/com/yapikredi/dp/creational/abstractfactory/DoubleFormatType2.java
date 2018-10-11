package com.yapikredi.dp.creational.abstractfactory;

public class DoubleFormatType2 implements DoubleFormat {
	public String format(double str) {
		return "d:" + str ;
	}
}
