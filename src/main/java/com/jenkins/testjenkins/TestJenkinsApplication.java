package com.jenkins.testjenkins;

import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestJenkinsApplication {

	public static Logger logger = LoggerFactory.getLogger(TestJenkinsApplication.class);

	@PostConstruct
	public void init(){
		logger.info("Application Started....");

	}
	public static void main(String[] args) {

		logger.info("Application Executed....");
		SpringApplication.run(TestJenkinsApplication.class, args);
	}

}
