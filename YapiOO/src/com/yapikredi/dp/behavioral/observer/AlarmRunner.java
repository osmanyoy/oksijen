package com.yapikredi.dp.behavioral.observer;

public class AlarmRunner {
	public static void main(final String[] args) {
		AlarmDistributer alarmDistributer = new AlarmDistributer();

		alarmDistributer.register(new AlarmHandlerSMS());
		alarmDistributer.register(new AlarmHandlerEmail());
		alarmDistributer.register(new AlarmHandlerLog());

		alarmDistributer.alarmOn();

	}
}
