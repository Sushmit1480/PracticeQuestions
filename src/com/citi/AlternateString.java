package com.citi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class AlternateString {
		
	public static int operations(String input) {
		int count1 = 0, count2 = 0;
		for(int i = 0; i < input.length(); i++) {
			char expected1 = (i % 2 == 0) ? '0' : '1';
			char expected2 = (i % 2 == 0) ? '1' : '0';
			
			if(input.charAt(i) != expected1) count1++;
			if(input.charAt(i) != expected2) count2++;
		} 
		
		return Math.min(count1, count2);
	}
	
	public static void main(String[] args) {
		String input;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter input value: ");
		input = sc.next();
		
		System.out.println("number of operations needed: " + operations(input));
		
		List<Map<String, Integer>> list = Arrays.asList(
			    Map.of("Math", 90, "English", 85),
			    Map.of("Math", 78, "English", 88)
			);
		
		int highest = list.stream().flatMap(n -> n.values().stream()).max(Comparator.naturalOrder()).orElse(0);
		System.out.println(highest);
		sc.close();
	}
}
