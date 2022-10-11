package com.example.demo;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		System.out.printf("Arguments: %s%n", Arrays.asList(args));
		SpringApplication.run(DemoApplication.class, args);
	}

}
