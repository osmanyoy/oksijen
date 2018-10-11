package com.yapikredi.dp.structural.bridge;

public class Benzinli extends YakitTipi {

	@Override
	public String ileriGit(final String aracIsmi) {
		return "Benzinli " + aracIsmi + " ileri gidiyor";
	}

}
