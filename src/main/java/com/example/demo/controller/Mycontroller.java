package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Student;
import com.example.demo.services.StudentServices;

@RestController
@CrossOrigin(origins="http://localhost:3000")
public class Mycontroller {
	
	@Autowired
	private StudentServices StudentServices;
	
	
	@PostMapping("/StudentInfo")
	public Student addStudent(@RequestBody Student student) {
		return this.StudentServices.addStudent(student);
	}
	
	@GetMapping("/student/{username}")
	public Student getCourse(@PathVariable String username) {
		return this.StudentServices.getStudent(username);
	}
	@GetMapping("/student")
	public List<Student> getAllStudent() {
		return this.StudentServices.getAllStudent();
	}
}
