package com.java;

public class LargestSmallestNumbers {

	public static void main(String[] args) {
		// find the largest and second largest numbers from the array
		
		int[] nums = {40, 10, 50, 90, 60, 20};
		int largest = nums[0];
		int smallest = nums[0];
		
		for(int i=0; i<nums.length; i++) {
			if(nums[i] > largest) {
				largest = nums[i];
			}
			
			if(nums[i] < smallest) {
				smallest = nums[i];
			}
		}
		
		System.out.println("Smallest Num: " + smallest);
		System.out.println("Largest Num: " + largest);

	}

}
