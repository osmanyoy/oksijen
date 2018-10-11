package com.yapikredi.dp.creational.abstractfactory;

public class StringFormatType1 implements StringFormat {
	public String format(String str) {
		return str + "_s";
	}
}
