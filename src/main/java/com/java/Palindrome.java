package com.java;

public class Palindrome {

	public static void main(String[] args) {
		// check the given string palindrome
		
		String str = "madam";
		String rev = "";
		
		for(int i=str.length()-1; i>=0; i--) {
			rev += str.charAt(i);
		}
		
		System.out.println("Reverse string:: " + rev);
		
		if(str.equals(rev)) {
			System.out.println("String is palindrome");
		}else {
			System.out.println("String is not palindrome");
		}

	}

}

//Reverse string:: madam
//String is palindrome
