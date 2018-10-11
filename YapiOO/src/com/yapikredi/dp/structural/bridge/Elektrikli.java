package com.yapikredi.dp.structural.bridge;

public class Elektrikli extends YakitTipi {

	@Override
	public String ileriGit(final String aracIsmi) {
		return "Eletrikli " + aracIsmi + " ileri gidiyor";
	}

}
