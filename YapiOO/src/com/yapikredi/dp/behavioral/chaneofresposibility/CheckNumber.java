package com.yapikredi.dp.behavioral.chaneofresposibility;

public abstract class CheckNumber {
	protected CheckNumber next;

	public CheckNumber(final CheckNumber next) {
		super();
		this.next = next;
	}

	public String handle(final int iVal) {
		String handleNumber = this.handleNumber(iVal);
		if (handleNumber == null) {
			if (this.next != null) {
				handleNumber = this.next.handle(iVal);
			}
		}
		return handleNumber;
	}

	abstract String handleNumber(int iVal);

}
