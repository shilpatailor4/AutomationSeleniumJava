package com.java;

public class ReverseString {

	public static void main(String[] args) {
		// Reverse a given string
		
		String str = "shilpa tailor";
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		System.out.println("Reverse String:: " + rev);

	}

}
