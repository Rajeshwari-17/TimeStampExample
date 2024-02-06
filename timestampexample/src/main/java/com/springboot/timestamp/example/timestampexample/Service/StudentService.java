package com.springboot.timestamp.example.timestampexample.Service;

import java.util.List;

import com.springboot.timestamp.example.timestampexample.Model.Student;

public interface StudentService {
	
	Student addStudent(Student s);
	
	Student getStudentById(long id);
	
	

	List<Student> getAllStudents();

	Student updateStudent(Student s, long id);
	
	void deleteStudentById(long id);

}
