package com.yapikredi.dp.behavioral.strategy;

public class StraMain {
	public static void main(final String[] args) {
		Asker asker = new Asker(new KeskinAtesTipi());
		asker.atesEt();
		asker.atesEt();
		asker.atesEt();
		asker.atesEt();
	}
}
