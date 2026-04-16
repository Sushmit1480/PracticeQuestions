package com.sushmit.practice;

import java.util.Arrays;
import java.util.List;

public class ThirdHighestNumber {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,5,9,8,7,6,4,3,9,7,10);
		int a = Integer.MIN_VALUE, b = Integer.MIN_VALUE, c = Integer.MIN_VALUE;
		
		for(int i: list) {
			if(i > a) {
				c = b;
				b = a;
				a = i;
			}else if(i > b && i < a) {
				c = b;
				b = i;
			}else if(i > c && i < a && i < b) {
				c = i;
			}
		}
		
		System.out.println("Third Highest Number: " + c);
	}

}
