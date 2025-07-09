package com.example.homePractise;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Qualifier;


@Component
public class Dev{

	// @Autowired						// this is called field injection.
	// private Laptop lap;


	// private Laptop lap;				// this is called constructor injection
	// @Autowired		
	// public Dev(Laptop lap){
	// 	this.lap = lap;
	// }


	// private Laptop lap;				// this is called setter injection
	// @Autowired
	// public void setLaptop(Laptop lap){
	// 	this.lap = lap;
	// }

	@Autowired
	@Qualifier("laptop")
	private Computer comp;

	public void build(){
		// lap.compile();
		comp.compile();
		System.out.println("Working of Development Project");
	}
}