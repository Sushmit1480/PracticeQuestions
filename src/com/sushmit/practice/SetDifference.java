package com.sushmit.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SetDifference {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of elements in both set: ");
		int n = sc.nextInt();
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();
		System.out.println("Enter the values for 1st set: ");
		for(int i = 0; i < n; i++) {
			int input = sc.nextInt();
			set1.add(input);
		}
		
		System.out.println("Enter the values of 2nd set: ");
		for(int i = 0; i < n; i++) {
			int input = sc.nextInt();
			set2.add(input);
		}
		
		Set<Integer> difference = new HashSet<>();
		difference.addAll(set1);
		difference.removeAll(set2);
		
		System.out.println("Set1 :- "+set1);
		System.out.println("Set2 :- "+set2);
		System.out.println("Difference Set :- "+difference);
		sc.close();
	}
}
