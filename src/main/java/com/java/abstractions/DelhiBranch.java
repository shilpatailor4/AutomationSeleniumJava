package com.java.abstractions;

public class DelhiBranch extends Bank{
	
	public boolean validateDocument(String document) {
		
		if(document.equalsIgnoreCase("passport")) {
			return true;
		}else{
			System.out.println("Invalid document..account can only be created with passport!!");
			return false;
		}
	}

}
