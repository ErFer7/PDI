package com.ufscplanner.model;

import lombok.Data;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "TB_SUBJECT")
public class Subject {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID", unique = true, nullable = false)
	private Long id;

	@Column(name = "CODE", unique = true, nullable = false)
	private String code;

	@Column(name = "NAME", nullable = false)
	private String name;

	@Column(name = "CREDITS", nullable = false)
	private Integer credits;
}
