package com.java;

public class ReverseArray {

	public static void main(String[] args) {
		// How to reverse a given array?

		int[] arr = {10, 20, 30, 40, 50};
		int start=0;
		int end=arr.length-1;
		
		while(start < end) {
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}
		
		for(int num : arr) {
			System.out.print(num + " ");
		}

	}

}


//50 40 30 20 10 