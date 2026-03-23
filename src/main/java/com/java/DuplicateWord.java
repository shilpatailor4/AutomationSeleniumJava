package com.java;

public class DuplicateWord {

	public static void main(String[] args) {
		// find the duplicate words from the given string array
		String[] str = {"Java", "Python", "Ruby", "Java", "C#", "C#"};
		
		System.out.println("Duplicate words:: ");
		for(int i=0; i<str.length; i++) {
			for(int j=i+1; j<str.length; j++) {
				if(str[i].equals(str[j])) {
					System.out.print(str[i] + " ");
				}
			}
		}

	}

}
