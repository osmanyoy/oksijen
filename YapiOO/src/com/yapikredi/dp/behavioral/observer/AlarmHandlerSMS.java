package com.yapikredi.dp.behavioral.observer;

public class AlarmHandlerSMS implements IAlarm {

	@Override
	public void alarmOn() {
		System.out.println("Sending Alarm SMS");

	}

	@Override
	public void alarmOff() {
		System.out.println("Sending Alarm off SMS");

	}

}
