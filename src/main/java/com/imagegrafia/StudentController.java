package com.imagegrafia;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imagegrafia.model.Student;
import com.imagegrafia.repository.StudentRepository;

@RestController
public class StudentController {

	@Autowired
	private StudentRepository studentRepository;
	@GetMapping("/")
	public Student getStudentInf(){
		return this.studentRepository.findByName("Kash");
	}
}
