package com.yapikredi.dp.behavioral.chaneofresposibility;

public class CORRunner {
	public static void main(final String[] args) {
		CheckNumber checkNumber = new CheckPositive(new CheckNegative(new CheckZero(null)));
		String handle = checkNumber.handle(10);
		System.out.println(handle);

		CheckNumber checkNumber2 = new CheckNegative(new CheckZero(null));

	}
}
