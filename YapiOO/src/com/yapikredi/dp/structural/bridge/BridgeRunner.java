package com.yapikredi.dp.structural.bridge;

public class BridgeRunner {
	public static void main(final String[] args) {
		BMW bmw = new BMW(new Dizel());
		System.out.println(bmw.ileriGit());

		Mercedes mercedes = new Mercedes(new Elektrikli());
		System.out.println(mercedes.ileriGit());
	}
}
