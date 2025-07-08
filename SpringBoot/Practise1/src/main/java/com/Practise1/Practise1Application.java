package com.Practise1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Practise1Application {

	public static void main(String[] args) {

		// SpringApplication.run(Practise1Application.class, args);
		
		// Below is the Dependency Injection
		ApplicationContext context = SpringApplication.run(Practise1Application.class, args);

		Dev obj = context.getBean(Dev.class);

		obj.build();
	}

}
