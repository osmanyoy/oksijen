package com.yapikredi.dp.structural.bridge;

public abstract class YakitTipi {
	protected String yakitTipi;

	public String getYakitTipi() {
		return this.yakitTipi;
	}

	public void setYakitTipi(final String yakitTipi) {
		this.yakitTipi = yakitTipi;
	}

	public abstract String ileriGit(String aracIsmi);

}
