package com.yapikredi.dp.behavioral.templatemethod;

public abstract class MyAbstractClass implements IProcess {

	@Override
	final public void mainProcess() {
		this.subProcessHeader();
		this.subProcessBody();
		this.subProcessFooter();
	}

	protected abstract void subProcessFooter();

	protected abstract void subProcessBody();

	protected abstract void subProcessHeader();

}
