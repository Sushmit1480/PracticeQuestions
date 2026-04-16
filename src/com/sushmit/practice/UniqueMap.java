package com.sushmit.practice;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class UniqueMap {

	public static void main(String[] args) {
		List<Map.Entry<String, String>> list = List.of(Map.entry("Apple", "a"), 
				Map.entry("Ball", "b"), 
				Map.entry("Cat", "a"),
				Map.entry("Dog", "b"));
		System.out.println(list);
		Set<String> uniqueValues = new HashSet<>();
		LinkedHashMap<String, String> uniqueMap = list.stream()
				.filter(entry -> uniqueValues.add(entry.getValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		
		System.out.println(uniqueMap);

	}

}
