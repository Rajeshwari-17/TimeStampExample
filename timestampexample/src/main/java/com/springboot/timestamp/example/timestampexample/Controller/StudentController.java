package com.springboot.timestamp.example.timestampexample.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.timestamp.example.timestampexample.Model.Student;
import com.springboot.timestamp.example.timestampexample.Service.StudentService;

@RestController
@RequestMapping("api/students")
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping
	public List<Student> getAllStudents()
	{
		return studentService.getAllStudents();
	}
	
	@GetMapping("{id}")
	public Student getStudentById(@PathVariable(name = "id")long id)
	{
		return studentService.getStudentById(id);
	}
	
	@PostMapping
	public Student addStudentById(@RequestBody Student s, @PathVariable (name = "id")long id)
	{
		return studentService.addStudent(s);
	}
	
	@PutMapping("{id}")
	public Student updateStudentById(@RequestBody Student s,@PathVariable(name = "id")long id)
	{
		return studentService.updateStudent(s, id);
		
	}
	
	@DeleteMapping("{id}")
	public void  deleteStudentById(@PathVariable(name="id") long id)
	{
		studentService.getStudentById(id);

	}

}
