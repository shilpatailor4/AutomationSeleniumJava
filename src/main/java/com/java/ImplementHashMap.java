package com.java;

import java.util.HashMap;

//Question: Implement HashMap in the interface and use it in the main

//Create interface class
interface MyInterface{
	HashMap<String, String> getData();
}

//........................................................

//create a class and implements interface class
class MyClass implements MyInterface{
	
	public HashMap<String, String> getData(){
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("key1", "value1");
		map.put("key2", "value2");
		map.put("key3", "value3");
		
		return map;
	}
}

//........................................................

//call method in main class
public class ImplementHashMap {

	public static void main(String[] args) {
		
		MyClass obj = new MyClass();
		HashMap<String, String> data = obj.getData();
	    System.out.println(data);

	}

}
