package com.thunderbolt.useHybrid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

public class Student {

	String id;
	String name;
	String dept;
	@Autowired
	FortuneTellerImpl fortune;

	/**
	 * @param id
	 * @param name
	 * @param dept
	 * @param fortune
	 */
	public Student(String id, String name, String dept, FortuneTellerImpl fortune) {
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.fortune = fortune;
	}

	/**
	 * 
	 */
	public Student() {
	}

	public String getId() {
		return id;
	}

	@Required
	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	@Required
	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	@Required
	public void setDept(String dept) {
		this.dept = dept;
	}

	public FortuneTellerImpl getFortune() {
		return fortune;
	}

	@Autowired
	public void setFortune(FortuneTellerImpl fortune) {
		this.fortune = fortune;
	}

	public void printData() {
		System.out.println("Student ID: " + id);
		System.out.println("Student Name: " + name);
		System.out.println("Student Dept: " + dept);
		System.out.println("Fortune: " + fortune.getFortune((int) Math.abs((Math.random() * 10) % 5)));
	}

}
