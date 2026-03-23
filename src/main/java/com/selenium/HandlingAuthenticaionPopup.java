package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAuthenticaionPopup {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://the-internet.herokuapp.com/basic_auth");
		
		//Handling Authentication popup -- update the username and password in the URL itself 
		// added like that: (https://username:password@URL)
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		boolean elementDisplayed = driver.findElement(By.xpath("//p[contains(text(),'Congratulations!')]"))
				.isDisplayed();
		
		System.out.println("Element present the true otherwise false: " + elementDisplayed);
		
		driver.close();
		

	}

}