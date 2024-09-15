package com.example.JpaDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.JpaDemo.model.Student;
import com.example.JpaDemo.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	@GetMapping("/")
	public String greet() {
		return "Hello World";
	}
	
	@GetMapping("/students")
	public List<Student> getAllStudents(){
		return service.getAllStudents();
	}
	
	@GetMapping("/students/{id}")
	public Student getStudentById(@PathVariable int id) {
		return service.getStudentById(id);
	}
	
	@PostMapping("/students")
	public Student addStudent(@RequestBody Student student) {
		return service.addStudent(student);
	}
}
