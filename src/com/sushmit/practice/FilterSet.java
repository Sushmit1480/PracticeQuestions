package com.sushmit.practice;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class FilterSet {

	public static void main(String[] args) {
		Map<Integer, String> t = new TreeMap<>(new MarksComparator());
		Map<Integer, String> f = new TreeMap<>();
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			
			System.out.print("Enter Marks: ");
			int marks = sc.nextInt();
			sc.nextLine();
			System.out.print("Enter Name: ");
			String name = sc.nextLine();
			
			if(marks < 36) {
				f.put(marks, name);
			}
			
			t.put(marks, name);
		}
		
		System.out.println("Student list with top student: ");
		System.out.println(t);
		System.out.println("Failed student list: ");
		System.out.println(f);
		sc.close();
	}

}
