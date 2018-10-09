package com.yapikredi.dp.creational.signgleton;

import java.util.concurrent.atomic.AtomicBoolean;

public class LazySingeton {
	private static volatile LazySingeton instance;

	private LazySingeton() {
	}

	public static LazySingeton getInstance() {
		if (instance == null) {
			synchronized (LazySingeton.class) {
				if (instance == null) {
					instance = new LazySingeton();
				}
			}
		}
		return instance;
	}


}
