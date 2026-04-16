package com.sushmit.practice;

import java.util.ArrayList;
import java.util.List;

public class AllSubArray {

	private static void findSubsets(int index, int[] arr, List<List<Integer>>  ans, List<Integer> ds, int n) {
		if(index == n) {
			ans.add(new ArrayList<>(ds));
			return;
		}
		ds.add(arr[index]);
		findSubsets(index+1, arr, ans, ds, n);
		ds.remove(ds.size()-1);
		findSubsets(index+1, arr, ans, ds, n);
	}
	
	private static List<List<Integer>> subSets(int[] arr){
		List<List<Integer>> ans = new ArrayList<>();
		List<Integer> ds = new ArrayList<>();
		findSubsets(0, arr, ans, ds, arr.length);
		ans.sort((a, b) -> Integer.compare(a.size(), b.size()));
		return ans;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,2,3};
		List<List<Integer>> ans = subSets(arr);
		for(List<Integer> lst: ans) {
			System.out.println(lst);
		}
	}

}
