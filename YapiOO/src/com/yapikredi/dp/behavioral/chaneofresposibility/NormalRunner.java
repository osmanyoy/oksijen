package com.yapikredi.dp.behavioral.chaneofresposibility;

public class NormalRunner {
	public static void main(final String[] args) {
		int a = 10;

		if (a > 0) {
			System.out.println("pozitif");
		} else if (a == 0) {
			System.out.println("s�f�r");
		} else if (a < 0) {
			System.out.println("negatif");
		}

		if (a == 0) {
			System.out.println("s�f�r");
		} else if (a < 0) {
			System.out.println("negatif");
		}

	}
}
