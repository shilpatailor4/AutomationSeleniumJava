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
		
		//If we found only non reat words in given string then use it
		for(Map.Entry<String, Integer> entry : maps.entrySet()){
	          if(entry.getValue() == 1){
	              System.out.println(entry.getKey() + "=" + entry.getValue());
	          }
	      }
	}

}

//{I=1, love=1, selenium=2, java=2, and=1}
//I=1
//love=1
//and=1
