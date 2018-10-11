package com.yapikredi.dp.behavioral.state;

public class StateContext implements IState {

	private IState state;

	public StateContext() {
		this.state = new BootState(this);
	}

	@Override
	public void idle() {
		this.state.idle();

	}

	@Override
	public void suspend() {
		this.state.suspend();
	}

	@Override
	public void error() {
		this.state.error();
	}

	@Override
	public void log(final String str) {
		this.state.log(str);

	}

	IState getState() {
		return this.state;
	}

	void setState(final IState state) {
		this.state = state;
	}

}
