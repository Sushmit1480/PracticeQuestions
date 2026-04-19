package com.citi;

import java.util.HashMap;
import java.util.Map;

public class VariableLengthArgument {

	public static int add(int... nums) {
		int sum = 0;
		for(int num: nums) {
			sum += num;
		}
		
		return sum;
	}
	
	public static void main(String... args) {
		System.out.println(add(1,2,3,4,5,6,7,8,9,10));
		System.out.println(add(1));
		System.out.println(add(10,20,30,40,50,60,70,80,90,100));
		
		int i = 07;
		Integer a = 06;
		System.out.println(a.getClass());
		System.out.println(i);
		
		Map<String, String> map = new HashMap<>();
		map.put("1", "One");
		map.put("2", "Two");
		System.out.println(map.get("3"));
		
		double r1 = 8.735634;
		double r2 = 8.73563;
		
		System.out.println(Double.compare(r1, r2));
	}
}
