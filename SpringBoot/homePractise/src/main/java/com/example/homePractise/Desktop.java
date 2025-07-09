package com.example.homePractise;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary		// as laptop and desktop share same method. so writing primary will indicate the project to consider this method first
public class Desktop implements Computer{
	public void compile(){
		System.out.println("Building Aweosome project on Desktop");
	}
}