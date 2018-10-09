package com.yapikredi.dp.creational.signgleton;

public class NewTestSingleton {
	private static volatile NewTestSingleton instance;

	private NewTestSingleton() {
	}

	public static NewTestSingleton getInstance() {
		if (instance == null) {
			synchronized (NewTestSingleton.class) {
				if (instance == null) {
					instance = new NewTestSingleton();
				}
			}
		}
		return instance;
	}

}
