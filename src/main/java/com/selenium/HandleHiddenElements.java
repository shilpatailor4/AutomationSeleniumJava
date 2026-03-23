package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleHiddenElements {

	public static void main(String[] args) throws InterruptedException {
		// Handle hidden elements using javascript code
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.letskodeit.com/practice");
		
		//click on the hide and button then below textbox field is hidden
		driver.findElement(By.xpath("//input[@value='Hide']")).click();
		
		//handle using JS
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		//Inspect Element -> Find inputbox id element and copy --> Console -> type (document.getElementById and inside the breaket pass  the id value)
		// document.getElementById('displayed-text') then element html is showing
		jse.executeScript("document.getElementById('displayed-text').value='Shilpa tailor';");
		
		
		//click on the show button
		driver.findElement(By.id("show-textbox")).click();
		
		Thread.sleep(3000);
		
		driver.close();
		
		

	}

}
