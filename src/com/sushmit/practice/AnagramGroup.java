package com.sushmit.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroup {
	
	public static List<List<String>> groupAnagramString(String[] arr){
		Map<String, List<String>> map = new HashMap<>();
		for(String str: arr) {
			char[] chars = str.toCharArray();
			Arrays.sort(chars);
			String input = new String(chars);
			if(!map.containsKey(input)) {
				map.put(input, new ArrayList<>());
			}
			map.get(input).add(str);
		}
		return new ArrayList<>(map.values());
	}
	
	public static void main(String[] args) {
		String[] arr = {"eat", "tea", "tan", "ate", "nat", "bat"};
		List<List<String>> sol = groupAnagramString(arr);
		System.out.println(sol);
	}
}
