package com.java;

public class RemoveSpecialJunkChar {

	public static void main(String[] args) {
		// How to remove the special characters and junk char?

		String str = "^%^ Hello 344 Java  *&&*";
		String replaceStr = str.replaceAll("[^A-Za-z0-9 ]", "");
		
		System.out.println(replaceStr);

	}

}


//Hello 344 Java 