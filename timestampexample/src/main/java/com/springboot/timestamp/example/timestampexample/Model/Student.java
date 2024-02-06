package com.springboot.timestamp.example.timestampexample.Model;


import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Student_details")
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name = "name")
	private String name;
	@Column(name = "standard")
	private String standarad;
	@Column(name = "course")
	private String course;
	@CreationTimestamp
	@Column(name = "created_on",nullable=false,updatable=false)
	private LocalDateTime created_on;
	@UpdateTimestamp
	@Column(name="updated_on",nullable=false)
	private LocalDateTime updated_on;
	
	public Student()
	{
		
	}

	public Student(long id, String name, String standarad, String course) {
		super();
		this.id = id;
		this.name = name;
		this.standarad = standarad;
		this.course = course;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getStandarad() {
		return standarad;
	}

	public void setStandarad(String standarad) {
		this.standarad = standarad;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public LocalDateTime getCreated_on() {
		return created_on;
	}

	public void setCreated_on(LocalDateTime created_on) {
		this.created_on = created_on;
	}

	public LocalDateTime getUpdated_on() {
		return updated_on;
	}

	public void setUpdated_on(LocalDateTime updated_on) {
		this.updated_on = updated_on;
	}
	
	

}
