package com.ufscplanner.util;

import com.ufscplanner.model.Schedule;

import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

@Converter(autoApply = true)
public class SchedulerConverter implements AttributeConverter<Schedule, String> {

	@Override
	public String convertToDatabaseColumn(Schedule schedule) {
		if (schedule == null) {
			return null;
		}

		return schedule.toString();
	}

	@Override
	public Schedule convertToEntityAttribute(String schedule) {
		if (schedule == null) {
			return null;
		}

		return new Schedule(schedule);
	}
}
