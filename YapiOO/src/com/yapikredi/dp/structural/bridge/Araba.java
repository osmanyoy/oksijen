package com.yapikredi.dp.structural.bridge;

public abstract class Araba extends Arac {
	public Araba(final String aracIsmi, final YakitTipi yakitTipi) {
		super(aracIsmi,
		      yakitTipi);
	}

	private String motorgucu;

	public String getMotorgucu() {
		return this.motorgucu;
	}

	public void setMotorgucu(final String motorgucu) {
		this.motorgucu = motorgucu;
	}

}
