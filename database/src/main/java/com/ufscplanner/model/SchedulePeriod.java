package com.ufscplanner.model;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class SchedulePeriod {
	private final DayOfWeek dayOfWeek;
	private final LocalTime startTime;
	private final int duration; // Em seções

	public SchedulePeriod(String schedulePeriod) {
		String[] schedulePeriodParts = schedulePeriod.split("-");
		String[] dayOfWeekAndStartTime = schedulePeriodParts[0].split("\\.");

		this.dayOfWeek = DayOfWeek.of(Integer.parseInt(dayOfWeekAndStartTime[0]) - 1);
		this.startTime = LocalTime.parse(dayOfWeekAndStartTime[1], DateTimeFormatter.ofPattern("HHmm"));
		this.duration = Integer.parseInt(schedulePeriodParts[1]);
	}

	@Override
	public String toString() {
		int normalizedDayOfWeek = this.dayOfWeek.getValue() + 1;
		String formattedStartTime = this.startTime.format(DateTimeFormatter.ofPattern("HHmm"));

		return String.format("%d.%s-%d", normalizedDayOfWeek, formattedStartTime, duration);
	}
}
