package com.java;

import java.util.Scanner;

public class PrintInitials {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter firstname");
		String firstName = scanner.next();
		
		System.out.println("Enter secondname");
		String secondName = scanner.next();
		
		System.out.println("Enter lastname");
		String lastName = scanner.next();
		
		String initials = (" " + firstName.charAt(0) + secondName.charAt(0) + lastName.charAt(0)).toUpperCase();
		
		System.out.println(initials);
	}
}
