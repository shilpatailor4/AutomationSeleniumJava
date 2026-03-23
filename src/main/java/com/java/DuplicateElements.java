package com.java;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElements {

	public static void main(String[] args) {
		// Find the duplicate numbers from the given array
		int[] numbers = {10, 30, 20, 40, 10, 50, 40};
		
		
		//1st way using HashSet
	    Set<Integer> inputSet = new HashSet<Integer>();
		
		for(int num : numbers) {
			if(!inputSet.add(num)) {
				System.out.println(num);
			}
		}  
		
		//>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>
		
		
		//Second Way using loop
		for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                if(numbers[i] == numbers[j]){
                    System.out.println("Duplicate elements: "+numbers[i]);
                }
            }
        }
		

	}

}
