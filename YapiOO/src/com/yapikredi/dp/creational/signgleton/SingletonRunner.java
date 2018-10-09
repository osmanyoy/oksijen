package com.yapikredi.dp.creational.signgleton;

public class SingletonRunner {
	public static void main(String[] args) {
		Singleton.getInstance().writeMe();
		
		Singleton2.INSTANCE.writeMe();
	}
}
