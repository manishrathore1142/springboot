package com.example.demo.Bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Car {
	 @Value("${carname}")
	private String carname;
	 
	@Autowired
	private Engine engine;
	
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	
	public void print(){
		System.out.println("--carname--"+carname);
		System.out.println("--model---"+engine.getModelyear());
	}
	
}
