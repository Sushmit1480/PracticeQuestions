package com.citi;

public class MaximumSumOfSubArray {
	
	public static int maxSubArray(int[] nums) {
        int sum = 0, max = Integer.MIN_VALUE;
        int ansStart = -1, ansEnd = -1;
        for(int i = 0; i < nums.length; i++){
        	if(sum == 0) ansStart = i;
            sum += nums[i];

            if(sum > max){
                max = sum;
                ansStart = ansStart;
                ansEnd = i;
            }

            if(sum < 0){
                sum = 0;
            }
        }

        for(int i = ansStart; i < ansEnd; i++) {
        	System.out.print(nums[i]);
        }
        return max;
    }
	
	public static void main(String[] args) {
		int[] arr = new int[] {-2,-3,4,-1,-2,1,5,-3};
		System.out.println(maxSubArray(arr) );
		
	}
}
