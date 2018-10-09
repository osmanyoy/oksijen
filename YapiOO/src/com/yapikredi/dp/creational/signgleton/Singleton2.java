package com.yapikredi.dp.creational.signgleton;

public enum Singleton2 implements ITest {
	INSTANCE, INSTANCE2 {

		public void writeMe() {
			System.out.println("Your test string : " + getString());
		}

	},
	INSTANCE3 {
		@Override
		public void test() {
			System.out.println("test");
		}

	};

	@Override
	public void test() {
		System.out.println("test");
	}

	private String string;

	public void writeMe() {
		System.out.println("Your string : " + getString());
	}

	public String getString() {
		return string;
	}

	public void setString(String string) {
		this.string = string;
	}
}
