package com.example.JpaDemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

	@GetMapping("/")
	public String greet() {
		return "Hello World";
	}
}
