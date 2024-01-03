package com.example.demo;

import org.springframework.stereotype.Component;

@Component("lapi") // creating the instance named -> lapi
public class Laptop {
	
	private int id;
	private String name;
	
	
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
	
	
	public void lapShow() {
		System.out.println("Laptop Showing");
	}
	
	
	@Override
	public String toString() {
		return "Laptop [id=" + id + ", name=" + name + "]";
	}
	
	

}
