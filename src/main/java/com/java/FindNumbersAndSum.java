package com.java;

public class FindNumbersAndSum {

	public static void main(String[] args) {
		// Find the numbers only  {1, 2, r, %, 3} and sum of all the numbers
		
		Object[] inputData =  {1, 2, 'r', '%', 3};
		int sum = 0;
		
		System.out.print("Numbers: ");
		for(Object item : inputData) {
			if(item instanceof Integer) {
				int num = (Integer) item;
				
				sum += num;
				
				System.out.print(num + " ");
			}
		}
		
		System.out.println();		
		System.out.println("Sum of all numbers: " + sum);


	}

}


//Numbers: 1 2 3 
//Sum of all numbers: 6