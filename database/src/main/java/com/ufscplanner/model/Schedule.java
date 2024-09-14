package com.ufscplanner.model;

import java.time.Period;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Schedule {
	private SchedulePeriod[] schedulePeriods;

	public Schedule(String schedule) {
		String[] schedulePeriodsStrings = schedule.split("/");
		this.schedulePeriods = new SchedulePeriod[schedulePeriods.length];
		for (int i = 0; i < schedulePeriods.length; i++) {
			this.schedulePeriods[i] = new SchedulePeriod(schedulePeriodsStrings[i]);
		}
	}

	@Override
	public String toString() {
		StringBuilder stringBuilder = new StringBuilder();
		for (SchedulePeriod schedulePeriod : schedulePeriods) {
			stringBuilder.append(schedulePeriod.toString());
			stringBuilder.append("/");
		}
		return stringBuilder.toString();
	}
}
