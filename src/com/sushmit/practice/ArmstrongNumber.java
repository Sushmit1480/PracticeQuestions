package com.sushmit.practice;

public class ArmstrongNumber {

	public boolean isArmStrongNumber(int num) {
		int originalNum = num;
		int sum = 0;
		int count = String.valueOf(num).length();
		while(num != 0) {
			int digit = num % 10;
			sum += Math.pow(digit, count);
			num /= 10;
		}
		return sum == originalNum;
	}
	
	public static void main(String[] args) {
		ArmstrongNumber a = new ArmstrongNumber();
		System.out.println(a.isArmStrongNumber(9474));
	}
}
