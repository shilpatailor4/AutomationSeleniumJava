package com.java;

import java.util.Arrays;

public class Anagram {
	
	// Check the given strings s1, s2 anagram or not
	
	public static boolean isAnagram(String s1, String s2) {
		
		//Convert both strings to charArray
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();
		
		//Sort the both arrays
		Arrays.sort(c1);
		Arrays.sort(c2);
		
		//Compare both arrays are same or not if same then return true
		return Arrays.equals(c1, c2);
	}

	public static void main(String[] args) {
		String s1 = "listen";
		String s2 = "silent";
		
		System.out.println(isAnagram(s1, s2));
		
		if(isAnagram(s1, s2) == true) {
			System.out.println("Strings are anagram");
		}else {
			System.out.println("Strings are not anagram");
		}

	}

}
