package com.yapikredi.dp.behavioral.chaneofresposibility;

public class CheckPositive extends CheckNumber {

	public CheckPositive(final CheckNumber next) {
		super(next);
	}

	@Override
	String handleNumber(final int iVal) {
		if (iVal > 0) {
			return "pozitif";
		}
		return null;
	}

}
