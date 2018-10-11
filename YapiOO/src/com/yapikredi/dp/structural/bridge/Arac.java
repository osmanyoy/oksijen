package com.yapikredi.dp.structural.bridge;

public abstract class Arac {
	protected String aracIsmi;
	private YakitTipi yakitTipi;

	public Arac(final String aracIsmi, final YakitTipi yakitTipi) {
		super();
		this.aracIsmi = aracIsmi;
		this.yakitTipi = yakitTipi;
	}

	public String getAracIsmi() {
		return this.aracIsmi;
	}

	public void setAracIsmi(final String aracIsmi) {
		this.aracIsmi = aracIsmi;
	}

	public YakitTipi getYakitTipi() {
		return this.yakitTipi;
	}

	public void setYakitTipi(final YakitTipi yakitTipi) {
		this.yakitTipi = yakitTipi;
	}

	public String ileriGit() {
		return this.yakitTipi.ileriGit(this.aracIsmi);
	}

}
