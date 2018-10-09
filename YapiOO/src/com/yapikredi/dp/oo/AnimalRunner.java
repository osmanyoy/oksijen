package com.yapikredi.dp.oo;

public class AnimalRunner {
	public static void main(String[] args) {
		Animal animal = new Aslan();
		System.out.println(animal.getName());
		System.out.println(animal.getHeight());
		System.out.println(animal.eat());
		System.out.println(animal.voice());
		System.out.println(animal.sleep());
		animal.test1();
	}
}
