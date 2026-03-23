package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleKeys {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		driver.findElement(By.xpath("//input[@value='Login']")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("//div[contains(text(),'Warning: No match')]")).isDisplayed();
		
		driver.close();

	}

}
