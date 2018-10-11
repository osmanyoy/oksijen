package com.yapikredi.dp.behavioral.chaneofresposibility;

public class CheckZero extends CheckNumber {

	public CheckZero(final CheckNumber next) {
		super(next);
	}

	@Override
	String handleNumber(final int iVal) {
		if (iVal == 0) {
			return "sýfýr";
		}
		return null;
	}

}
