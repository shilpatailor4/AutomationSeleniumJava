package com.java;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesArrayElement {

	public static void main(String[] args) {
		//  Write Java code to remove duplicates from an array.
		
		int[] arr = {1, 2, 2, 3, 4, 4, 5};
		
		Set<Integer> seen = new LinkedHashSet<>();
		
		for(int num : arr) {
			seen.add(num);
		}
		
		StringBuilder result = new StringBuilder();
		
		for(Integer num : seen) {
			result.append(num);
		}
		
		System.out.print("After remove duplicate elements: " + result);

	}

}

//After remove duplicate elements: 12345