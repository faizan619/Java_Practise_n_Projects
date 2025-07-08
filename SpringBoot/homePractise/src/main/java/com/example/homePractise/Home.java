package com.example.homePractise;

// import org.springframework.stereotype.Component;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// @Component
@RestController
public class Home{

    @RequestMapping("/")
	public String build(){
		return "Welcome to Spring World - Mr Faizan Alam";
		// System.out.println("Working on the Progress");
	}

}