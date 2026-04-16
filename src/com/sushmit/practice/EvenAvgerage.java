package com.sushmit.practice;

import java.util.Arrays;
import java.util.List;

public class EvenAvgerage {

	public static void main(String[] args) {
		// Given list of integers we need to find the average of all even numbers present in list using java 8
		List<Integer> list = Arrays.asList(22,36,45,78,98,77,22,35,47,41,25,66,99);
		double average = list.stream().filter(n -> n%2 == 0).mapToInt(Integer::intValue).average().orElse(0);
		System.out.println(average);
		double avg = list.stream().filter(n -> n%2!=0).mapToInt(Integer::intValue).average().orElse(0);
		System.out.println(avg);
	}
}
