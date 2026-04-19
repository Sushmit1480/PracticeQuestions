package com.citi;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	public static int[] twoSum(int[] arr, int target) {
		int[] result = new int[2];
		Map<Integer, Integer> hashmap = new HashMap<>();
		for(int i = 0; i < arr.length; i++) {
			if(hashmap.containsKey(target - arr[i])) {
				result[1] = i;
				result[0] = hashmap.get(target-arr[i]);
				return result;
			}
			
			hashmap.put(arr[i], i);
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = new int[] {1,3,6,9,7,4};
		int target = 10;
		int[] response = twoSum(arr, target);
		
		for(int i: response) {
			System.out.println(i);
		}
	}

}
