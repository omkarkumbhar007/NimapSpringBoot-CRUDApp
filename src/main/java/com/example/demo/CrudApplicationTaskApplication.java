package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrudApplicationTaskApplication {

	public static void main(String[] args) {
		
		SpringApplication.run(CrudApplicationTaskApplication.class, args);
		System.out.println("CRUD Task Category and Products");
	}

}
