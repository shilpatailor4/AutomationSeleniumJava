package com.java.abstractions;

public class MumbaiBranch extends Bank{

public boolean validateDocument(String document) {
		
		if(document.equalsIgnoreCase("EB")) {
			return true;
		}else{
			System.out.println("Invalid document..account can only be created with EB!!");
			return false;
		}
	}

}
