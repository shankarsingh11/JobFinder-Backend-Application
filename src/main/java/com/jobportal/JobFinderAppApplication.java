package com.jobportal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JobFinderAppApplication {

	public static void main(String[] args) {

        SpringApplication.run(JobFinderAppApplication.class, args);

        System.out.println("hello Job Seeker!");
	}

}
