package com.sushmit.practice;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequency {
	public static void main(String[] args) {
		String input = "aabbbggttrrccsskkloowacbbdhghtu";
		LinkedHashMap<Character, Long> map = input.chars()
				.mapToObj(c -> (char) c)
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.sorted(Map.Entry.<Character, Long>comparingByValue(Comparator.reverseOrder()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println(map);
	}
}
