package com.ufscplanner.model;

import lombok.Data;

import com.ufscplanner.util.SchedulerConverter;

import jakarta.persistence.Column;
import jakarta.persistence.Convert;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "TB_SUBJECT_CLASS")
public class SubjectClass {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "SUBJECT_ID", nullable = false)
	private Subject subject;

	@Convert(converter = SchedulerConverter.class)
	@Column(name = "SCHEDULE", nullable = false)
	private Schedule schedule;

	@Column(name = "SEMESTER", nullable = false)
	private String semester;
}
