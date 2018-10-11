package com.yapikredi.dp.behavioral.state;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class BootState implements IState {

	private StateContext stateContext;
	private Queue<String> queue = new ArrayBlockingQueue<>(1000);

	public BootState(final StateContext stateContext) {
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
	}

	@Override
	public void log(final String str) {
		this.queue.add(str);
	}

}
