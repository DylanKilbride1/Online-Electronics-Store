package com.assignment.softwarepatterns;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.assignment.softwarepatterns"})
public class SoftwarePatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(SoftwarePatternsApplication.class, args);
	}
}