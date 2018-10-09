package com.yapikredi.dp.oo;

public interface IAnimal {
	
	String eat();
	
	String voice();
	
	String sleep();
	
	default String test1() {
		System.out.println("Test");
		return "test";
	}
	
	public static String utilTest(int a) {
		return "a : " + a;
	}
	
}
