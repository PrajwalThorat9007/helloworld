package com.bridgelabz.helloworld;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		log.info("Spring Boot Application Starting...");

		SpringApplication.run(Application.class, args);

		log.info("Application Started Successfully");

	}
	private static final Logger log =
			LoggerFactory.getLogger(Application.class);

}
