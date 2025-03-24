package com.test2.test2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Test2Application {

	public static void main(String[] args) {
		String x = "mike";
		int x = 100;
		int y = 200;
		double z = 10.3f;
		SpringApplication.run(Test2Application.class, args);
	}

}
