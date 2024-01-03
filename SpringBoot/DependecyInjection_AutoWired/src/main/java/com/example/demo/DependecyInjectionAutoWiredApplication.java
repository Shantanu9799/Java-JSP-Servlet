package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependecyInjectionAutoWiredApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(DependecyInjectionAutoWiredApplication.class, args);
		
		
		Student student1 = context.getBean(Student.class); // creating the instance
		
		student1.show();
		
		// Only 1 time called the constructor - Singleton Scope
		// Called as many time as you tried to create an instances
		
		/*
		Student student2 = context.getBean(Student.class);
		
		student2.show();
		
		Student student3 = context.getBean(Student.class);
		
		student3.show();
		*/
		
	}

}
