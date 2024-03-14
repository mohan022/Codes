package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Student;
import com.example.repo.StudentRepo;

@RequestMapping("/student")
@RestController
public class StudentController {
	
	@Autowired
	private StudentRepo studentRepo ;

	@PostMapping("/add")
	public Student addStudent(@RequestBody Student student) {
		return studentRepo.save(student);
	}
	
	@GetMapping("/getAll")
	public List<Student> getStudent() {
		return studentRepo.findAll();
	}
	
}
