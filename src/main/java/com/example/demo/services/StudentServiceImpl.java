package com.example.demo.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.dao.StudentDao;
import com.example.demo.entities.Student;
public class StudentServiceImpl implements StudentServices{
	
	@Autowired
	private StudentDao studentDao;

	@Override
	public Student addStudent(Student student) {
		studentDao.save(student);
		return student;
	}

	@Override
	public Student getStudent(String username) {
		return studentDao.getReferenceById(username);
	}
	
	@Override
	public List<Student> getAllStudent() {
		return studentDao.findAll();
	}
}
