package com.citi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class MaxSumKElementArray {
	
	public static void findSumAndArray(int[] arr, int k, String order) {
		Set<Integer> set = new HashSet<>();
		
		for(int i: arr) {
			set.add(i);
		}
		
		if(k > set.size() || k < 0) {
			System.out.println("Enter valid number of elements required.");
		}else {
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			
			for(int num: set) {
				pq.offer(num);
				if(pq.size() > k) {
					pq.poll();
				}
			}
			
			int sum = 0;
			List<Integer> sol = new ArrayList<>(k);
			int idx = 0;
			for(int num: pq) {
				sum += num;
				sol.add(num);
			}
			
			System.out.println(sum);
			if(order.equalsIgnoreCase("asc")) {
				Collections.sort(sol);
			}else {
				Collections.sort(sol, Comparator.reverseOrder());
			}
			System.out.println(sol);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {1,2,2,3,4,4};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int k = sc.nextInt();
		findSumAndArray(arr, k, "desc");
		sc.close();
	}

}
