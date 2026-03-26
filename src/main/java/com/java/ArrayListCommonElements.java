package com.java;

import java.util.ArrayList;

public class ArrayListCommonElements {

	public static void main(String[] args) {
		// Write a program to find the common elements between two ArrayLists.
		
		ArrayList<Integer> list1 = new ArrayList<>();
		ArrayList<Integer> list2 = new ArrayList<>();
		list1.add(1);
		list1.add(2);
		list1.add(3);
		list2.add(3);
		list2.add(4);
		list2.add(5);
		
	    list1.retainAll(list2);  // Retains only the elements that are present in both lists
	    
	    System.out.println("Common elements:: " + list1);
	}

}

//Common elements:: [3]
