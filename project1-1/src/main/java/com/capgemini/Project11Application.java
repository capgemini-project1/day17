package com.capgemini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Project11Application implements CommandLineRunner {
	
	@Autowired
	private DBUtil obj1;
	
	@Autowired
	private DBUtil obj2;
	
	
	

	public static void main(String[] args) {
		SpringApplication.run(Project11Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Helo world");
		System.out.println(obj1);
		System.out.println(obj2);
	}

}
