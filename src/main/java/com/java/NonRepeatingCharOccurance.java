package com.java;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingCharOccurance {

	public static void main(String[] args) {
		
		//Find the occurance of given string and result display only non repeat char
		
		String str = "abbaeddc";
		
		HashMap<Character, Integer> maps = new HashMap<>();
		
		for(char ch : str.toCharArray()) {
			if(maps.containsKey(ch)) {
				maps.put(ch, maps.get(ch)+1);
			}else {
				maps.put(ch, 1);
			}
		}
		
		System.out.println("All occurance value:: " + maps);
		
		for(Map.Entry<Character, Integer> entry : maps.entrySet()) {
			if(entry.getValue() == 1) {
				System.out.println("Unique occurance:: " + entry.getKey());
			}
		}

	}

}
