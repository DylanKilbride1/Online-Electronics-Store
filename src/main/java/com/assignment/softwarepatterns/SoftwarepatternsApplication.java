package com.assignment.softwarepatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.assignment.softwarepatterns"})
public class SoftwarepatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwarepatternsApplication.class, args);
	}
}