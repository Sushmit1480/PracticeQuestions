package com.sushmit.practice;

public class ReverseInteger {

	public int reverseInteger(int num) {
		int input = num;
		if(num < 0) {
			input = input * (-1);
		}
		
		int sum = 0;
		while(input > 0) {
			int digit = input % 10;
			sum = (sum*10)+digit;
			input /= 10;
		}
		
		if(num < 0) {
			return sum * (-1);
		}
		return sum;
	}
	
	public static void main(String[] args) {
		ReverseInteger r = new ReverseInteger();
		System.out.println(r.reverseInteger(-123));
	}

}
