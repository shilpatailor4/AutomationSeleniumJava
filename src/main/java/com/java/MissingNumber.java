package com.java;

public class MissingNumber {

	public static void main(String[] args) {
		// find the missing number from the given array list
		
		int[] nums = {1, 2, 3, 5, 6, 7, 8, 9, 10}; //missing is 4
		int sum = 0;
		int sum1 = 0;
		
		for(int i=0; i<nums.length; i++) {
			sum += nums[i];
		}
		
		System.out.println("Total of sum: " + sum);

		for(int j=0; j<=10; j++) {
			sum1 += j;
		}
		
		System.out.println("Tootal of sum1: " + sum1);
		
		System.out.println("Missing number is:: " + (sum1-sum));  //Missing number is:: 4
	}

}
