package com.sushmit.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergeList {

	public static void main(String[] args) {
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6);
		List<Integer> list2 = Arrays.asList(4,5,6,7,8,9);
		
		List<Integer> merge = Stream.concat(list1.stream(), list2.stream()).distinct().collect(Collectors.toList());
		System.out.println(merge);
		
		int secondHighest = merge.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().orElse(0);
		System.out.println(secondHighest);
	}

}
