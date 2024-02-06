package com.springboot.timestamp.example.timestampexample.Service.impl;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.timestamp.example.timestampexample.Model.Student;
import com.springboot.timestamp.example.timestampexample.Repository.StudentRepository;
import com.springboot.timestamp.example.timestampexample.Service.StudentService;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentRepository studentRepository;
	
	@Override
	public Student addStudent(Student s)
	{
		return studentRepository.save(s);
	}
	
	@Override
	public Student getStudentById(long id) {
		return studentRepository.findById(id).get();
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAll();
	}

	@Override
	public Student updateStudent(Student s, long id) {
		Student student = getStudentById(id);
		student.setName(s.getName());
		student.setCourse(s.getCourse());
		student.setUpdated_on(LocalDateTime.now());
		return studentRepository.save(student);
	}

	@Override
	public void deleteStudentById(long id) {
		studentRepository.deleteById(id);
	}
	
	
	

}
