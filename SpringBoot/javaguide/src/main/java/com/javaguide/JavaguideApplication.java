package com.javaguide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class JavaguideApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(JavaguideApplication.class, args);
		ComponentClass componentclass = (ComponentClass) applicationContext.getBean(ComponentClass.class);
		// Both Works
		// ComponentClass componentclass = (ComponentClass) applicationContext.getBean("componentclass");
		System.out.println(componentclass.getMessage());
	}
}

@Component
class ComponentClass{
	public String getMessage(){
		return "This is the Get Message! From Faizan Alam";
	}
}
