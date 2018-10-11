package com.yapikredi.dp.behavioral.state;

public class IdleState implements IState {

	private StateContext stateContext;

	public IdleState(final StateContext stateContext) {
		this.stateContext = stateContext;

	}

	@Override
	public void idle() {
	}

	@Override
	public void suspend() {
		SuspendState state = new SuspendState(this.stateContext);
		this.stateContext.setState(state);
	}

	@Override
	public void error() {
		ErrorState errorState = new ErrorState(this.stateContext);
		this.stateContext.setState(errorState);
	}

	@Override
	public void log(final String str) {
		System.out.println("DB ye yazýyorum : " + str);

	}

}
