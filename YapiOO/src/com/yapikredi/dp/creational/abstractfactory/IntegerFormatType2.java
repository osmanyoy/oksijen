package com.yapikredi.dp.creational.abstractfactory;

public class IntegerFormatType2 implements IntegerFormat {
	public String format(int str) {
		return "i:" + str;
	}
}
