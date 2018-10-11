package com.yapikredi.dp.behavioral.state;

public interface IState {
	public void idle();

	public void suspend();

	public void error();

	public void log(String str);
}
