package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PauseExecution {

	public static void main(String[] args) throws InterruptedException {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
		
		//Pause the execution for 5 mili second
		synchronized (driver) {
			
			driver.wait(5000);
			
		}
		
		//enter email after 5 mili second
		driver.findElement(By.id("input-email")).sendKeys("Shilpa@gmail.com");
		
		
		driver.close();

	}

}
