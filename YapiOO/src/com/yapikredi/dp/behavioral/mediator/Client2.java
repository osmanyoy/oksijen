package com.yapikredi.dp.behavioral.mediator;

public class Client2 implements IListen {

	@Override
	public void listen(final String string) {
		System.out.println("Client 2 : " + string);
	}

}
