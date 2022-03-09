package com.springRest.assignment6.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public int add(int num1, int num2) {
		int c=num1+num2;
		return c;
	}

	@Override
	public int sub(int num1, int num2) {
		int c=num1-num2;
		return c;
	}

	@Override
	public int mul(int num1, int num2) {
		int c=num1*num2;
		return c;
	}

	@Override
	public int div(int num1, int num2) {
		int c=num1/num2;
		return c;
	}

	@Override
	public int sql(double num1) {
		double c=Math.sqrt(num1);
		return (int) c;
	}

}
