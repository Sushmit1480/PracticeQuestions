package com.sushmit.calculator;

import java.util.Map;

public class Calculator {

	private static final Map<String, Operation> operations = Map.of(
			"+", (a,b) -> a+b,
			"-", (a,b) -> a-b, 
			"*", (a,b) -> a*b,
			"/", (a,b) -> a/b
			);
	
	public static double calculate(double a, double b, String operator) {
		return operations.get(operator).apply(a, b);
	}
	
	public static void main(String[] args) {
		System.out.println(calculate(10, 20, "+"));
		System.out.println(calculate(10, 20, "-"));
		System.out.println(calculate(10, 20, "*"));
		System.out.println(calculate(10, 20, "/"));
	}

}
