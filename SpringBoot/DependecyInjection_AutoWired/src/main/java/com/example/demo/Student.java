package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/* @Scope(value = "prototype") */ // scope -> Singleton and Prototype
public class Student {
	
	private int id;
	private String name;
	private String tech;
	
	@Autowired // searching by type
	@Qualifier("lapi") // searching by name
	private Laptop laptop;
	
	
	public Student() {
		super();
		System.out.println("Constructor Called ..... !!! ");
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
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	
	public void show() {
		System.out.println("Showing ....");
		laptop.lapShow();
	}
	

}
