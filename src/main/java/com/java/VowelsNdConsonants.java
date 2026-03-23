package com.java;

public class VowelsNdConsonants {

	public static void main(String[] args) {
		// Find the vowels and consonants from the gven string
		
		String str = "shilpa";
		char ch;
		
		//Find Vowels
		
		System.out.println("Vowels:: ");
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.print(ch + " ");
			}
		}
		
		System.out.println();
		System.out.println("Consonants:: ");
		
		//Find Consonants
		for(int i=0; i<str.length(); i++) {
			ch = str.charAt(i);
			
			if(!(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')) {
				System.out.print(ch + " ");
			}
		}
		
		

	}

}
