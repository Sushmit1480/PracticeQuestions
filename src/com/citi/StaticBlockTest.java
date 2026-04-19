package com.citi;

public class StaticBlockTest {

	static {
		System.out.println("Static Block 1");
		int a = 10;
		int b = 200;
		System.out.println(a+b);
	}
	
	static {
		System.out.println("Static Block 2");
	}
	
	public static void main(String[] args) {
		System.out.println("main method");
	}
	
}
