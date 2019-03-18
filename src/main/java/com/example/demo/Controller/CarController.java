package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Bean.Car;

@RestController
public class CarController {
	
	@Autowired
	private Car car;
	@RequestMapping("/car")
	public void car(){
		car.print();
		
	}

}
