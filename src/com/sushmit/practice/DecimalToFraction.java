package com.sushmit.practice;

import java.util.Scanner;

public class DecimalToFraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the decimal value: ");
		double input= sc.nextDouble();
		decimalToFraction(input);
		sc.close();
	}
	
	public static void decimalToFraction(double input) {
		int num = 1000000;
		int denominator = num;
		int numerator = (int) (input * num);
		int gcd = gcd(numerator, denominator);
		denominator /= gcd;
		numerator /= gcd;
		
		System.out.println(numerator+ " , "+ denominator);
	}
	
	public static int gcd(int a, int b) {
		while(b != 0) {
			int temp = b;
			a = a%b;
			b = temp;
		}
		return a;
	}
}
