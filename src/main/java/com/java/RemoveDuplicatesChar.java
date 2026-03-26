package com.java;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesChar {
	
//	Java Program to Remove Duplicate Characters from a Given String
	
	public static String removeDuplicateCharacters(String input) {
		Set<Character> seen = new LinkedHashSet<>();
		for(char ch : input.toCharArray()) {
			seen.add(ch);
		}
		
		StringBuilder result = new StringBuilder();
		
		for(Character ch : seen) {
			result.append(ch);
		}
		
		return result.toString();
	}
		
	public static void main(String[] args) {
		
		String input = "programming";
		String op = removeDuplicateCharacters(input);
        System.out.println(op);

	}

}
