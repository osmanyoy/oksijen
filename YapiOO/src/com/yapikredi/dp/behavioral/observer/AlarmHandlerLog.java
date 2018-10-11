package com.yapikredi.dp.behavioral.observer;

public class AlarmHandlerLog implements IAlarm {

	@Override
	public void alarmOn() {
		System.out.println("Log Alarm ");

	}

	@Override
	public void alarmOff() {
		System.out.println("Log Alarm off ");

	}

}
