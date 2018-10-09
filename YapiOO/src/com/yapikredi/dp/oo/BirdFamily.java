package com.yapikredi.dp.oo;

public abstract class BirdFamily extends Animal {
	
	public BirdFamily(String name, int height) {
		super(name,
		      height);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String eat() {
		return "yem";
	}
	
	
}
