package com.java;

import java.util.LinkedHashMap;
import java.util.Map;

public class OccuranceInInsertionOrder {

	public static void main(String[] args) {
		// Find the occurance of given string but result should be appear in insertion order
		
		String str = "shilpaa"; //op: s=1, h=1, i=1, l=1, p=1, a=2
		
		Map<Character, Integer> maps = new LinkedHashMap<>(); //LinkedHashMap follow the insertion order
		
		for(char ch : str.toCharArray()) {
			if(maps.containsKey(ch)) {
				maps.put(ch, maps.get(ch)+1);
			}else {
				maps.put(ch, 1);
			}
		}
		
		System.out.println(maps);
		

	}

}
