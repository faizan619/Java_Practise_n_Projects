package com.example.homePractise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class HomePractiseApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomePractiseApplication.class, args);
		
		// Below is the Dependency Injection
		// ApplicationContext context = SpringApplication.run(HomePractiseApplication.class, args);

		// Home obj = context.getBean(Home.class);

		// obj.build();
	}

}
