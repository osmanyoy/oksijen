package com.yapikredi.dp.behavioral.momento;

public class MementoMain {
	public static void main(final String[] args) {
		Session session = new Session();
		session.increaseCounter();
		session.setCookie("cookie1");
		session.setName("session1");

		// Snapshot
		CareTaker careTaker = new CareTaker();
		careTaker.addMemento(session);

		// continue process
		session.increaseCounter();
		session.setCookie("cookie2");

		// Snapshot
		careTaker.addMemento(session);

		// continue process
		session.increaseCounter();
		session.setCookie("cookie3");

		// Snapshot
		careTaker.addMemento(session);

		session = careTaker.returnToHistory(0);
		System.out.println(session);

		session = careTaker.returnToHistory(1);
		System.out.println(session);

	}
}
