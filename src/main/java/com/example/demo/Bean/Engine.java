package com.example.demo.Bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Engine {
	 @Value("${engine}")
	private String modelyear;
	 
	public void setModelyear(String modelyear) {
		this.modelyear = modelyear;
	}
	public String getModelyear() {
		return modelyear;
	}
}
