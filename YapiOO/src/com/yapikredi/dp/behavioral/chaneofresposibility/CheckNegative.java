package com.yapikredi.dp.behavioral.chaneofresposibility;

public class CheckNegative extends CheckNumber {

	public CheckNegative(final CheckNumber next) {
		super(next);
	}

	@Override
	String handleNumber(final int iVal) {
		if (iVal < 0) {
			return "negatif";
		}
		return null;
	}

}
