package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJenkingApplication {

	public static Logger logger = LoggerFactory.getLogger(SpringJenkingApplication.class);

	public static void main(String[] args) {
		logger.info("first logger  message");
		SpringApplication.run(SpringJenkingApplication.class, args);
	}

}
