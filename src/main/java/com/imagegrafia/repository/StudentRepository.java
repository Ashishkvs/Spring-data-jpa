package com.imagegrafia.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.imagegrafia.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	public Student findByName(String name);
}
