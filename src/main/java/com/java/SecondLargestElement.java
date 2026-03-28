package com.java;

public class SecondLargestElement {

	public static void main(String[] args) {
		// Print the highest and second-highest integer from the array.
		
		int[] arr = {12, 45, 23, 89, 78, 56};
		int largest = arr[0];
		int secondLargest = arr[0];
		int smallest=arr[0];
		
		for(int i=0; i<arr.length; i++) {
			//largest
			if(arr[i] > largest) {
				largest = arr[i];
			}
			
			//smallest
			if(arr[i] < smallest) {
				smallest = arr[i];
			}
			
			//second largest
			if(arr[i] > secondLargest && arr[i] < largest) {
				secondLargest = arr[i];
			}
		}
		
//		for(int i=0; i<arr.length; i++) {
//			if(arr[i] > secondLargest && arr[i] < largest) {
//				secondLargest = arr[i];
//			}
//		}		
		System.out.println("Largest:: " + largest);
		System.out.println("Second Largest:: " + secondLargest);
		System.out.println("Smallest:: " + smallest);
	}

}
//Largest:: 89
//Second Largest:: 78
//Smallest:: 12








