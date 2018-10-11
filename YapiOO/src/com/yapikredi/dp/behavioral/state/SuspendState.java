package com.yapikredi.dp.behavioral.state;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class SuspendState implements IState {

	private StateContext stateContext;
	private Queue<String> queue = new ArrayBlockingQueue<>(1000);

	public SuspendState(final StateContext stateContext) {
		this.stateContext = stateContext;

	}

	@Override
	public void idle() {
		IdleState idleState = new IdleState(this.stateContext);
		for (String string : this.queue) {
			idleState.log(string);
		}
		this.stateContext.setState(idleState);

	}

	@Override
	public void suspend() {
	}

	@Override
	public void error() {
		ErrorState errorState = new ErrorState(this.stateContext);
		this.stateContext.setState(errorState);
	}

	@Override
	public void log(final String str) {
		this.queue.add(str);
	}

}
