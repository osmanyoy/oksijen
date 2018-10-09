package com.yapikredi.dp.oo;

public abstract class CatFamily extends Animal{
	public CatFamily(String name, int height) {
		super(name,
		      height);
	}

	@Override
	public String eat() {
		return "et";
	}
}
