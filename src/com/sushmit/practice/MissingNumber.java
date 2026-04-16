package com.sushmit.practice;

public class MissingNumber {

	public int missingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n+1)/2;
		int actualSum = 0;
		for(int num: arr) {
			actualSum += num;
		}
		
		return sum-actualSum;
	}
	
	public static void main(String[] args) {
		MissingNumber m = new MissingNumber();
		int[] arr = {1,2,3,5,6};
		System.out.println(m.missingNumber(arr));
	}

}
