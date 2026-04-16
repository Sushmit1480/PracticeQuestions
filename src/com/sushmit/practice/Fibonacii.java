package com.sushmit.practice;

public class Fibonacii {

	public int fibonacii(int n) {
		int a = 0;
		int b = 1;
		for(int i = 2; i <= n; i++) {
			int c = a+b;
			a = b;
			b = c;
		}
		return b;
	}
	
	public static void main(String[] args) {
		Fibonacii f = new Fibonacii();
		System.out.println(f.fibonacii(6));
	}
}
