package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import lombok.extern.slf4j.Slf4j;
@Slf4j
@SpringBootApplication
public class DemoApplication {
	
	public void init() {
		log.info("Application started........");
		System.out.println("Application started........");
	}

	public static void main(String[] args) {
		log.info("Application executed........");
		System.out.println("Application executed........");
		SpringApplication.run(DemoApplication.class, args);
	}

}
