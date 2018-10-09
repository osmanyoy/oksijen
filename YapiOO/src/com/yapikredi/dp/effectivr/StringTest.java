package com.yapikredi.dp.effectivr;

public class StringTest {
	public static void main(String[] args) {
		long delta = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			String string = "osman " + i + " test " + i + " ets";
//			string += " otl " + i;
		}
		System.out.println("Delta : " + (System.currentTimeMillis() - delta));

		delta = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			StringBuilder builder = new StringBuilder(64);
			builder.append("osman ");
			builder.append(i);
			builder.append(" test ");
			builder.append(i);
			builder.append(" ets");
//			builder.append(" otl ");
//			builder.append(i);
			builder.toString();
		}
		System.out.println("Delta : " + (System.currentTimeMillis() - delta));

		delta = System.currentTimeMillis();
		for (int i = 0; i < 1_000_000; i++) {
			String str = String.format("osman %d test %d ets",
			                           i,
			                           i);
		}
		System.out.println("Delta : " + (System.currentTimeMillis() - delta));
	}
}
