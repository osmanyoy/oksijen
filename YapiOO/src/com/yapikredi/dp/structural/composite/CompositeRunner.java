package com.yapikredi.dp.structural.composite;

public class CompositeRunner {
	public static void main(final String[] args) {
		Item item = new Item("1");
		Item item11 = new Item("1.1");
		item.addChild(item11);
		Item item12 = new Item("1.2");
		item.addChild(item12);
		Item item111 = new Item("1.1.1");
		item11.addChild(item111);
		Item item112 = new Item("1.1.2");
		item11.addChild(item112);
		Item item113 = new Item("1.1.3");
		item11.addChild(item113);

		System.out.println(item.toString());

	}
}
