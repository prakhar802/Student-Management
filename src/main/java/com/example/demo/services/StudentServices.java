package com.example.demo.services;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.*;
@Service
public interface StudentServices {
    public Student addStudent(Student student);
    public Student getStudent(String username);
	public List<Student> getAllStudent();
}
