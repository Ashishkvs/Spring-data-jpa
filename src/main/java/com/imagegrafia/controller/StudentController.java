package com.imagegrafia.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.imagegrafia.model.Student;
import com.imagegrafia.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;

	@GetMapping("/{name}")
	public Optional<Student> getStudent(@PathVariable("name") String name) {
		return this.studentRepository.findByName(name);
	}
}
