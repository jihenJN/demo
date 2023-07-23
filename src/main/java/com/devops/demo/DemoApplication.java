package com.devops.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		int x = 5 ;
		int y = 10 ; 
		SpringApplication.run(DemoApplication.class, args);
	}

}
