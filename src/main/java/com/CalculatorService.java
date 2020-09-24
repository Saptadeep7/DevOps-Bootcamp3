package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorService {
	
	@GetMapping("/sum")
	public int sum() {
		int a=10,b=20;
		return a+b;
	}
	
	@GetMapping("/multiply")
	public int multiply() {
		int a=10,b=45;
		return a*b;
	}
	
	@GetMapping("/substract")
	public int substract() {
		int a=100,b=40;
		return a-b;
	}
	
	@GetMapping("/division")
	public int division() {
		int a=55, b=11;
		return a/b;
	}

}
