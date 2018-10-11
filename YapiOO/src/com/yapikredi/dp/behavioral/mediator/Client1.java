package com.yapikredi.dp.behavioral.mediator;

public class Client1 implements IListen {

	@Override
	public void listen(final String string) {
		System.out.println("Client 1 : " + string);
	}

}
