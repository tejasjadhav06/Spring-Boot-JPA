package com.example.JpaDemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.JpaDemo.model.Student;
import com.example.JpaDemo.repository.StudentRepo;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public List<Student> getAllStudents() {
		return repo.findAll();
	}

	public Student getStudentById(int id) {
		return repo.findById(id).orElse(new Student());
	}
	
	public Student addStudent(Student student) {
		repo.save(student);
		return student;
	}

	public Student updateStudent(Student student) {
		repo.save(student);
		return student;
	}

}
