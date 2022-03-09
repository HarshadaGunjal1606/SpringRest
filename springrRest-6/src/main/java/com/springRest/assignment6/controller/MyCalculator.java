package com.springRest.assignment6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springRest.assignment6.service.CalculatorService;

@RestController
public class MyCalculator {
	@Autowired
	private CalculatorService cs;
	
	
	@GetMapping("/add/{num1},{num2}")
	public int show(@PathVariable int num1,@PathVariable int num2) {
		
		
		return this.cs.add(num1,num2);
		
	}
	@GetMapping("/sub/{num1},{num2}")
	public int sub(@PathVariable int num1,@PathVariable int num2) {
		
		
		return this.cs.sub(num1,num2);
		
	}
	@GetMapping("/mul/{num1},{num2}")
	public int mul(@PathVariable int num1,@PathVariable int num2) {
		
		
		return this.cs.mul(num1,num2);
		
	}
	@GetMapping("/div/{num1},{num2}")
	public int div(@PathVariable int num1,@PathVariable int num2) {
		
		
		return this.cs.div(num1,num2);
		
	}

	@GetMapping("/sql/{num1}")
	public int sql(@PathVariable int num1) {
		
		
		return this.cs.sql(num1);
		
	}

}
