package com.rishu.springdatajpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);
	}

	// DTOs ( Data Transfer Objects ) - A class whose purpose is to
	// transfer data, usually from server to client and vice versa.

	// entities - A class whose purpose is to store/retrieve
	// data from to/from a database.

	// POJOs ( Plain Old Java Objects ) - A class that doesn't extend any framework
	// code nor has any sort of restrictions baked into it.

}
