package com.selenium;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadJavaScriptVariable {

	public static void main(String[] args) {
		// fetch the page title using javascript
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.letskodeit.com/practice");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		String title = (String) jse.executeScript("return document.title");
		System.out.println(title);
		
		driver.close();

	}

}
