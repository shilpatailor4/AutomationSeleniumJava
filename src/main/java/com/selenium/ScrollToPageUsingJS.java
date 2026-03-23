package com.selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToPageUsingJS {

	public static void main(String[] args) throws InterruptedException {
		// scroll to the page on specific size
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.get("https://www.letskodeit.com/practice");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0, 700)");
		
		Thread.sleep(3000);
		
		WebElement mouseHover = driver.findElement(By.id("mousehover"));
		jse.executeScript("arguments[0].click();", mouseHover);
		
		Thread.sleep(2000);
		driver.close();

	}

}
