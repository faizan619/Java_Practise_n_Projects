package com.example.homePractise;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{
	public void compile(){
		System.out.println("Building Project on Awesome Laptop");
	}
}