package com.yapikredi.dp.behavioral.state;

public class ErrorState implements IState {

	private StateContext stateContext;

	public ErrorState(final StateContext stateContext) {
		this.stateContext = stateContext;

	}

	@Override
	public void idle() {
		IdleState idleState = new IdleState(this.stateContext);
		this.stateContext.setState(idleState);

	}

	@Override
	public void suspend() {
		SuspendState state = new SuspendState(this.stateContext);
		this.stateContext.setState(state);
	}

	@Override
	public void error() {
	}

	@Override
	public void log(final String str) {
		System.out.println("LOG a basýyorum : " + str);
	}

}
