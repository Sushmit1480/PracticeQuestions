package com.citi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.Set;

public class MaximumSumOfKElements {
	public static int maxSumKthDist(int[] arr, int k) {
		Set<Integer> set = new HashSet<>();
		for(int i: arr) {
			set.add(i);
		}
		if(k > set.size()) {
			return -1;
		}
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for(int num: set) {
			minHeap.offer(num);
			if (minHeap.size() > k) {
	           int digit = minHeap.poll();
	           System.out.println(digit);
	        }
		}
		
		int sum = 0;
		for(int i: minHeap) {
			sum += i;
			System.out.println(i);
		}
		
		return sum;
	}

	public static void main(String[] args) {
		int[] arr = new int[] {1,2,2,3,4,4};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of elements: ");
		int k = sc.nextInt();
		System.out.println("maximum Sum: " + maxSumKthDist(arr, k));
		sc.close();
	}

}
