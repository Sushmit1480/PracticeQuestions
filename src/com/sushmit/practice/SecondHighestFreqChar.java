package com.sushmit.practice;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SecondHighestFreqChar {

	public static void main(String[] args) {
		String str = "Hello World!";
		char ch = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.sorted((e1, e2) -> Long.compare(e2.getValue(), e1.getValue()))
				.skip(1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("message"));
		System.out.println(ch);
		
		Map<Character, Long> map = str.chars().mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(map);
		char secondHigh = map.entrySet()
				.stream()
				.sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
				.skip(1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElseThrow(() -> new RuntimeException("Some Runtime error"));
		
		System.out.println("Second Highest character: " + secondHigh);
	}

}
