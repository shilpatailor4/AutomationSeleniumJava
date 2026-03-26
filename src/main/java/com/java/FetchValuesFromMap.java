package com.java;

import java.util.HashMap;
import java.util.Map;

public class FetchValuesFromMap {

	public static void main(String[] args) {
		// Write a program to fetch the values from the map using keys.
		
		Map<String, Integer> map = new HashMap<>();
		map.put("John", 28);
        map.put("Jane", 24);
        map.put("Jack", 35);
        
        String key = "John";
        if(map.containsKey(key)) {
        	System.out.println("Value for " + key + " : " + map.get(key));
        }else {
        	System.out.println("Key not found!!");
        }

	}

}

//Value for John : 28
