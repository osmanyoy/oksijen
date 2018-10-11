package com.yapikredi.dp.behavioral.mediator;

public class Client3 implements IListen {

	@Override
	public void listen(final String string) {
		System.out.println("Client 3 : " + string);
	}

}
