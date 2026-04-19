package com.citi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {

	public List<List<Integer>> threeSum(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		if(nums == null || nums.length == 0) {
			return res;
		}
		int n = nums.length;
		Arrays.sort(nums);
		for(int i = 0; i < n; i++) {
			int front = i+1;
			int back = n-1;
			while(front < back) {
				long sum = nums[i] + nums[front] + nums[back];
				if(sum < 0) front++;
				else if(sum > 0) back--;
				else {
					List<Integer> triplet = new ArrayList<>();
					triplet.add(nums[i]);
					triplet.add(nums[front]);
					triplet.add(nums[back]);
					res.add(triplet);
					
					while(front <  back && nums[front] == triplet.get(1)) ++front;
					while(front <  back && nums[back] == triplet.get(2)) --back;
				}
			}
			while(i+1 < n && nums[i+1] == nums[i]) ++i;
		}
		
		return res;
    }
}
