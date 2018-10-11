package com.yapikredi.dp.behavioral.observer;

public class AlarmHandlerEmail implements IAlarm {

	@Override
	public void alarmOn() {
		System.out.println("Sending Alarm Email");

	}

	@Override
	public void alarmOff() {
		System.out.println("Sending Alarm off Email");

	}

}
