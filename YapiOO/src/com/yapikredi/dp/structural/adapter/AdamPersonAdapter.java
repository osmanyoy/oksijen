package com.yapikredi.dp.structural.adapter;

public class AdamPersonAdapter extends Person {
	private Adam adam;

	public AdamPersonAdapter(final Adam adam) {
		super();
		this.adam = adam;
	}

	@Override
	public String getName() {
		return this.adam.getIsim();
	}

	@Override
	public String getSurname() {
		return this.adam.getSoyisim();
	}

	@Override
	public String getPhone() {
		return "" + this.adam.getTel();
	}

}
