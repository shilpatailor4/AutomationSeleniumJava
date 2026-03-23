package com.java;

public class ReverseWordsWithoutChangePosition {

	public static void main(String[] args) {
		// Reverse a word without chage string poisiton
		
		String str = "I love java selenium";
		String[] words = str.split(" ");
		
		StringBuilder sb = new StringBuilder();
		
		for(String word : words) {
			StringBuilder revSB = new StringBuilder(word);
			revSB.reverse();
			sb.append(revSB).append(" ");
		}
		
		System.out.println(sb.toString().trim());

	}

}
