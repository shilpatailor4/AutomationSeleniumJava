package com.java;

public class ReverseCasingOfString {

	public static void main(String[] args) {
		// Code to convert lowercase to uppercase and vice versa.

		String input = "Hello World";
		
		StringBuilder result = new StringBuilder();
		
		char data;
		for(int i=0; i<input.length(); i++) {
			data = input.charAt(i);
			
			// USE isUpperCase() to check the condition
            if(Character.isUpperCase(data)) {
                result.append(Character.toLowerCase(data));
            }
			
            // USE isLowerCase() to check the condition
            else if(Character.isLowerCase(data)) {
                result.append(Character.toUpperCase(data));
            }
			
			else {
				result.append(data);
			}
		}
		
		System.out.println("Original String: " + input);
		System.out.println("Result: " + result.toString());
		}
}
