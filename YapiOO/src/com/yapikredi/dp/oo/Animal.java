package com.yapikredi.dp.oo;

public abstract class Animal implements IAnimal{
	private static final int MY_MAX_HEIGHT = 200;
	private String name;
	private int height;
	
	

	public Animal(String name, int height) {
		super();
		this.name = name;
		this.height = height;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		if (height < MY_MAX_HEIGHT) {
			this.height = height;
		}
	}
	
	@Override
	public String sleep() {
		return "sleeping";
	}
}
