package com.yapikredi.dp.behavioral.state;

public class StateRunner {
	public static void main(final String[] args) {
		StateContext stateContext = new StateContext();
		stateContext.log("deneme1");
		stateContext.log("deneme2");
		stateContext.idle();
		stateContext.log("deneme3");
		stateContext.log("deneme4");
		stateContext.error();
		stateContext.log("deneme5");
		stateContext.log("deneme6");
		stateContext.suspend();
		stateContext.log("deneme7");
		stateContext.log("deneme8");
		stateContext.idle();
		stateContext.log("deneme9");
		stateContext.log("deneme10");

	}
}
