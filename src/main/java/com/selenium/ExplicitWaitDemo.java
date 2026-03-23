package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDemo {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://omayo.blogspot.com/");
		
		//Explicit wait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
		
		// When I click on the dropdown element then after 3 second facebook element is present that why need to apply wait
		
		//here it won't wait
		driver.findElement(By.xpath("//button[text()='Dropdown']")).click();
		
		//3 second wait then appear
		wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Facebook"))).click();
//	    driver.findElement(By.linkText("Facebook")).click();
		
		
         driver.close();

	}

}
