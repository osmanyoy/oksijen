package com.yapikredi.dp.creational.signgleton;

public class Singleton {
	private static Singleton singleton = new Singleton(); 
	
	private String string;
	
	private Singleton() {
	}
	
	public static Singleton getInstance() {
		return singleton;
	}
	
	public void writeMe() {
		System.out.println("Your string : " + getString());
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
