package com.yapikredi.dp.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class AlarmDistributer implements IAlarm, IDistributor {
	private List<IAlarm> alarmHandlers = new ArrayList<>();

	@Override
	public void register(final IAlarm alarm) {
		this.alarmHandlers.add(alarm);
	}

	@Override
	public void alarmOn() {
		for (IAlarm iAlarm : this.alarmHandlers) {
			iAlarm.alarmOn();
		}
	}

	@Override
	public void alarmOff() {
		for (IAlarm iAlarm : this.alarmHandlers) {
			iAlarm.alarmOff();
		}
	}

}
