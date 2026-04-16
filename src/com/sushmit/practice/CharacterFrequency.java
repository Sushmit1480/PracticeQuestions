package com.sushmit.practice;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharacterFrequency {

	public static void main(String[] args) {
		// most repeated character out of the character array
		String str = "bbbccddaaaeraaabbcde";
		Map<Character, Long> frequncyMap = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(frequncyMap);
//		LinkedHashMap<Character, Long> sortedHashMap = frequncyMap.entrySet().stream().sorted()
		Map<Character, Long> freq = str.chars().mapToObj(c -> (char) c).collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		System.out.println(freq);
		LinkedHashMap<Character, Long> sort = freq.entrySet()
				.stream()
				.sorted(Map.Entry.<Character, Long>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(sort);
	}
}
