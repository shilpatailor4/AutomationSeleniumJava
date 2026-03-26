package com.java;

import java.util.HashMap;

public class MapAverage {

	public static void main(String[] args) {
		/*Write a code using HashMap (Brian – 21, Lee – 22, Cathe – 45) using key and value and find the average?*/
		
		HashMap<String, Integer> maps = new HashMap<String, Integer>();
		maps.put("Brian", 21);
		maps.put("Lee", 22);
		maps.put("cathe", 45);
		
		double sum=0;
		
		for(int age : maps.values()) {
			sum += age;
		}
		
		double avgAge = sum/maps.size();
		
		System.out.println("Avg age is:: " + avgAge);

	}

}


/*
 * // Avg age is:: 29.333333333333332


 *Type Casting: I used double for the sum and average. If you use an int for the sum and divide by an int, 
 * Java will perform "Integer Division" and truncate the decimals (e.g., $29.33$ would just become $29.0$).
 */
