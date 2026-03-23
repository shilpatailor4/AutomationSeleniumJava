package com.java;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class OcurranceOfWords {

	public static void main(String[] args) {
		// Find the occurance of words
		String str = "I love selenium java and selenium java";
		String[] words = str.split(" ");
		
//		HashMap<String, Integer> maps = new HashMap<>();
		Map<String, Integer> maps = new LinkedHashMap<>();
		
		for(int i=0; i<words.length; i++) {
			if(!maps.containsKey(words[i])) {
				maps.put(words[i], 1);
			}else {
				maps.put(words[i], maps.get(words[i])+1);
			}
		}
		
		System.out.println(maps);
	}

}
