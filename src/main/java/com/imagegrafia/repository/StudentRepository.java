package com.imagegrafia.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.imagegrafia.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer> {

	public Optional<Student> findByName(String name);
}
