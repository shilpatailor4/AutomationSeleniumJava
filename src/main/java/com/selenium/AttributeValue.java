package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeValue {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		WebElement attributeValue = driver.findElement(By.name("fname"));
		System.out.println(attributeValue.getAttribute("value"));
		
		//clear the text from the input field
		attributeValue.clear();
		
		driver.close();

	}

}
