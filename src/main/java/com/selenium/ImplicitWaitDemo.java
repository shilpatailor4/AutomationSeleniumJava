package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://omayo.blogspot.com/");
		
		// When I click on the dropdown element then after 3 second facebook element is present that why need to apply wait
		
		//here it won't wait
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		
		//3 second wait then appear
	    driver.findElement(By.linkText("Facebook")).click();
		
		
         driver.close();
	}

}
