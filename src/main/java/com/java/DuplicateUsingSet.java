package com.java;

import java.util.HashSet;
import java.util.Set;

public class DuplicateUsingSet {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4, 2, 5, 6, 3};
		
		Set<Integer> seen = new HashSet<>();
		
		for(int num : arr) {
			if(!seen.add(num)) {
				System.out.println("Duplicate:: " + num);
			}
		}

	}

}
