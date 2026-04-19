package com.citi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RemoveDuplicateAndSortJava8 {

	public static void main(String[] args) {
		int[] arr = new int[]{8,9,7,10,11,4,3,56,88,96,14,23,55,0,1,1,11,10,55};
		List<Integer> list = Arrays.asList(8,9,7,10,11,4,3,56,88,96,14,23,55,0,1,1,11,10,55);
		
		List<Integer> sol = list.stream().distinct().sorted((a,b) -> b-a).toList();
		List<Integer> ans = Arrays.stream(arr).boxed().distinct().sorted(Comparator.reverseOrder()).toList();
		System.out.println(sol);
		System.out.println(ans);
	}
}
