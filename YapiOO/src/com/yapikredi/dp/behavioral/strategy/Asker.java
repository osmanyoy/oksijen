package com.yapikredi.dp.behavioral.strategy;

public class Asker {

	private AtesTipi atesTipi;

	public Asker(final AtesTipi atesTipi) {
		super();
		this.atesTipi = atesTipi;
	}

	public void atesEt() {
		this.atesTipi.atesEt();
	}

}
