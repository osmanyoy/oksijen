package com.yapikredi.dp.oo;

public class Karga extends BirdFamily{

	public Karga() {
		super("karga",
		      40);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String voice() {
		return "gak gak";
	}
	
	@Override
	public String test1() {
		System.out.println("Mest");
		return "mest";
	}

}
