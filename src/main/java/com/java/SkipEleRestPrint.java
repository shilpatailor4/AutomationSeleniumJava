package com.java;

public class SkipEleRestPrint {

	public static void main(String[] args) {
		/*Implement an array int arr = {1, 2, 3, 4, 5, 7, 8, 9}; skip 3 and all elements after 3, 
		 * then skip 7 and print the result?*/ 
		
		int[] arr = {1, 2, 3, 4, 5, 7, 8, 9};
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] == 3) {
				i++;
			}
			
			if(arr[i] == 7) {
				continue;
			}
			System.out.print(arr[i] + " ");
		}

	}

}


//1 2 4 5 8 9 