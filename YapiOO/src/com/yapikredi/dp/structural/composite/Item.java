package com.yapikredi.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Item {
	private List<Item> items = new ArrayList<>();
	private Item parent;
	private String name;

	public Item(final String name) {
		super();
		this.name = name;
	}

	public void addChild(final Item item) {
		this.items.add(item);
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(final List<Item> items) {
		this.items = items;
	}

	public Item getParent() {
		return this.parent;
	}

	public void setParent(final Item parent) {
		this.parent = parent;
	}

	public String getName() {
		return this.name;
	}

	public void setName(final String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		String str = "\t" + this.name + "\n";
		for (Item item : this.items) {
			str += item.toString();
		}
		return str;
	}
}
