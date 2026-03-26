package com.java;

public class FindMissingNumber {

	public static void main(String[] args) {
		
		//How to Find the Missing Values from a Sorted Array
		
		int[] arr = {1,2,3,4,6,7, 9};
		int expected = arr[0];
		
		System.out.println("Missing Numbers:: ");
		for(int i=0; i<arr.length; i++) {
			while(arr[i] > expected) {
				System.out.print(expected + " ");
				expected++;
			}
			expected++;
		}

	}

}
