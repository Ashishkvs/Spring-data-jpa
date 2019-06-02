package com.imagegrafia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Laptop {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	@ManyToOne
	@JsonBackReference
	private Student studentLaptop; //this ref name used in mappedBy=""
	
	
	public Student getStudentLaptop() {
		return studentLaptop;
	}
	public void setStudentLaptop(Student studentLaptop) {
		this.studentLaptop = studentLaptop;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + ", studentLaptop=" + studentLaptop + "]";
	}
	
}
